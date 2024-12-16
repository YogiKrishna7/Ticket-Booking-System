package com.ticketbooking.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seat_id")
	private int seatId;

	@Column(name="screen_id")
	private int screenId;

	@Column(name = "seat_number")
	private String seatNumber;

	@Column(name = "seat_price")
	private int seatPrice;

	@Column(name = "created_by")
	private String createdBy = "system";

	@Column(name = "create_date")
	private String createDate;

	@Column(name = "modified_by")
	private String modifiedBy = "system";

	@Column(name = "modified_date")
	private String modifiedDate;

	public Seat() {
		super();
	}

	public Seat(int seatId, int screenId, String seatNumber, int seatPrice, String createdBy, String createDate,
			String modifiedBy, String modifiedDate) {
		super();
		this.seatId = seatId;
		this.screenId = screenId;
		this.seatNumber = seatNumber;
		this.seatPrice = seatPrice;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
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

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
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
