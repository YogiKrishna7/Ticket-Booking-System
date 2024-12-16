package com.ticketbooking.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TicketBookingMain {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Connection c = Connect.getConnected();
            TicketBookingDAO dao = new TicketBookingDAO(c);

            User user = new User();

            /* user registration / signup */

            // user.setName("yogi");
            // user.setPhno("986670907");
            // user.setEmail("yogi@gmail.com");
            // user.setAddress("ram nagar");
            // user.setUserName("yogi7");
            // user.setPassword("123");

            // dao.userRegister(user);

            /* Reset Password */

            // System.out.println("Enter username: ");
            // String username = input.nextLine();

            // System.out.println("Enter new password: ");
            // String newpassword = input.nextLine();

            // dao.resetPassword(username, newpassword);

            /* Login */

            System.out.println("Enter your username to login: ");
            String loginUsername = input.nextLine();

            System.out.println("Enter your password to login: ");
            String loginPassword = input.nextLine();

            if (dao.authenticate(loginUsername, loginPassword)) {
                System.out.println("Authentication successful!");

                /* Change password */

                // System.out.println("Enter username: ");
                // String userName = input.nextLine();

                // System.out.println("Enter cureent password: ");
                // String currentPassword = input.nextLine();

                // System.out.println("Enter new password: ");
                // String newPassword = input.nextLine();

                // dao.changePassword(userName, currentPassword, newPassword);

                /* Search movie and select */

                System.out.println("Search By ?\n1)Screen\n2)Movie");
                int choice = input.nextInt();
                input.nextLine();

                System.out.println("Enter Screen or Movie Name: ");
                String search = input.nextLine();

                dao.selectShowtime(choice, search);

            } else {
                System.out.println("Authentication failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}