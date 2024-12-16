package com.ticketbooking.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBookingDAO {
    Scanner input = new Scanner(System.in);

    void userRegister(User user) {
        String query = "insert into users (name, phno, email, address, user_name, password) values (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = c.prepareStatement(query);

            ps.setString(1, user.getName());
            ps.setString(2, user.getPhno());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getUserName());
            ps.setString(6, user.getPassword());

            int done = ps.executeUpdate();

            if (done > 0) {
                System.out.println("User registered successfully");
            } else {
                System.out.println("User registration failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    boolean authenticate(String username, String password) {
        String query = "select * from users where user_name = ? and password = ?";

        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful");
                return true;
            } else {
                System.out.println("User not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    void changePassword(String username, String currentPassword, String newPassword) {

        String query = "select * from users where user_name = ? and password = ?";

        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, currentPassword);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String newQuery = "update users set password = ? where user_name = ?;";

                PreparedStatement ps1 = c.prepareStatement(newQuery);
                ps1.setString(1, newPassword);
                ps1.setString(2, username);

                int done = ps1.executeUpdate();

                if (done > 0) {
                    System.out.println("Password updated successfully");
                } else {
                    System.out.println("Failed to update password");
                }
            } else {
                System.out.println("User not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void resetPassword(String username, String newPassword) {
        String query = "select * from users where user_name = ?";

        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String newQuery = "update users set password = ? where user_name = ?;";

                PreparedStatement ps1 = c.prepareStatement(newQuery);
                ps1.setString(1, newPassword);
                ps1.setString(2, username);

                int done = ps1.executeUpdate();

                if (done > 0) {
                    System.out.println("Password reset successfully");
                } else {
                    System.out.println("Failed to reset password");
                }
            } else {
                System.out.println("User not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    List<Movie> searchByscreen(String theaterName) {
        List<Movie> screenList = new ArrayList<>();

        String query = "select screen_name, movie_title, show_time, location from screens join showtimes on screens.screen_id = showtimes.screen_id join movies on showtimes.current_movie_id = movies.movie_id where location like ? order by show_time;";

        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, "%" + theaterName + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String screenName = rs.getString("screen_name");
                String movieName = rs.getString("movie_title");
                String showTime = rs.getString("show_time");
                String location = rs.getString("location");

                Movie movie = new Movie(screenName, movieName, showTime, location);
                screenList.add(movie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return screenList;
    }

    List<Movie> searchBymovie(String moviename) {
        List<Movie> movieList = new ArrayList<>();

        String query = "select movie_title, screen_name, show_time, location from movies join showtimes on movies.movie_id = showtimes.current_movie_id join screens on showtimes.screen_id = screens.screen_id where movie_title like ? order by show_time;";
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, "%" + moviename + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String movieName = rs.getString("movie_title");
                String screenName = rs.getString("screen_name");
                String showTime = rs.getString("show_time");
                String location = rs.getString("location");

                Movie movie = new Movie(screenName, movieName, showTime, location);
                movieList.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movieList;
    }

    void selectShowtime(int choice, String searchMovieOrTheater) {

        try {
            List<Movie> list = new ArrayList<>();

            if (choice == 1) {
                list = searchByscreen(searchMovieOrTheater);
            } else if (choice == 2) {
                list = searchBymovie(searchMovieOrTheater);
            }

            System.out.println("Available Movies and Showtimes:");

            int i = 0;
            for (Movie movie : list) {
                System.out.println(i + ". " + movie.getMovieTitle());
                System.out.println("Location: " + movie.getLocation());
                System.out.println("Screen: " + movie.getScreenName());
                System.out.println("Showtime: " + movie.getShowTime());
                System.out.println();
                i++;
            }

            System.out.print("Select a movie/showtime (enter number): ");
            int showtimeChoice = input.nextInt();
            input.nextLine();

            Movie selectedMovie = list.get(showtimeChoice);

            System.out.println("You have selected:");
            System.out.println("Movie: " + selectedMovie.getMovieTitle());
            System.out.println("Screen: " + selectedMovie.getScreenName());
            System.out.println("Showtime: " + selectedMovie.getShowTime());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}