package com.ticketbooking.app;

public class Booking {
    private int bookingId;
    private int bookingNumber;
    private int userId;
    private int movieId;
    private int showTimeId;
    private int screenId;
    private int seatId;
    private int totalPrice;
    private int bookingStatusId;

    public Booking(int bookingId, int bookingNumber, int userId, int movieId, int showTimeId, int screenId, int seatId,
            int totalPrice, int bookingStatusId) {
        this.bookingId = bookingId;
        this.bookingNumber = bookingNumber;
        this.userId = userId;
        this.movieId = movieId;
        this.showTimeId = showTimeId;
        this.screenId = screenId;
        this.seatId = seatId;
        this.totalPrice = totalPrice;
        this.bookingStatusId = bookingStatusId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getShowTimeId() {
        return showTimeId;
    }

    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getBookingStatusId() {
        return bookingStatusId;
    }

    public void setBookingStatusId(int bookingStatusId) {
        this.bookingStatusId = bookingStatusId;
    }

}
