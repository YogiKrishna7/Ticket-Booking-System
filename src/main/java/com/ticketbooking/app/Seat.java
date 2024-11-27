package com.ticketbooking.app;

public class Seat {
    int seatId;
    int screenId;
    int seatNumber;
    int seatPrice;
    
    public Seat(int seatId, int screenId, int seatNumber, int seatPrice) {
        this.seatId = seatId;
        this.screenId = screenId;
        this.seatNumber = seatNumber;
        this.seatPrice = seatPrice;
    }
    public int getSeatId() {
        return seatId;
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    public int getScreenId() {
        return screenId;
    }
    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public int getSeatPrice() {
        return seatPrice;
    }
    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

}
