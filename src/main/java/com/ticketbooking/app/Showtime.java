package com.ticketbooking.app;

public class Showtime {
	private int showTimeId;
	private int screenId;
	private String showTime;
	private int isActive;
	private int currentMovieId;
	private String createdBy;
	private String createDate;
	private String modifiedBy;
	private String modifiedDate;

	public Showtime(int showTimeId, int screenId, String showTime, int isActive, int currentMovieId, String createdBy,
			String createDate, String modifiedBy, String modifiedDate) {
		this.showTimeId = showTimeId;
		this.screenId = screenId;
		this.showTime = showTime;
		this.isActive = isActive;
		this.currentMovieId = currentMovieId;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
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

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getCurrentMovieId() {
		return currentMovieId;
	}

	public void setCurrentMovieId(int currentMovieId) {
		this.currentMovieId = currentMovieId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
