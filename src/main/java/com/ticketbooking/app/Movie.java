package com.ticketbooking.app;

public class Movie {
	private String screenName;
	private String movieTitle;
	private String showTime;
	private String location;
	
	public Movie(String screenName, String movieTitle, String showTime, String location) {
		this.screenName = screenName;
		this.movieTitle = movieTitle;
		this.showTime = showTime;
		this.location = location;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}