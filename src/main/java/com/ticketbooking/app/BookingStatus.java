package com.ticketbooking.app;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "booking_statuses")
public class BookingStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_status_id")
	private int bookingStatusId;

	@Column(name = "booking_status_code")
	private String bookingStatusCode;

	@Column(name = "description")
	private String description;

	@Column(name = "display_name")
	private String displayName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_status_id")
	@OrderColumn(name = "idx")
	private List<Booking> bookingsList;

	@Column(name = "created_by")
	private String createdBy = "system";

	@Column(name = "create_date")
	private String createDate;

	@Column(name = "modified_by")
	private String modifiedBy = "system";

	@Column(name = "modified_date")
	private String modifiedDate;

	public BookingStatus() {
		super();
	}

	public BookingStatus(int bookingStatusId, String bookingStatusCode, String description, String displayName,
			List<Booking> bookingsList, String createdBy, String createDate, String modifiedBy, String modifiedDate) {
		super();
		this.bookingStatusId = bookingStatusId;
		this.bookingStatusCode = bookingStatusCode;
		this.description = description;
		this.displayName = displayName;
		this.bookingsList = bookingsList;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public int getBookingStatusId() {
		return bookingStatusId;
	}

	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}

	public String getBookingStatusCode() {
		return bookingStatusCode;
	}

	public void setBookingStatusCode(String bookingStatusCode) {
		this.bookingStatusCode = bookingStatusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public List<Booking> getBookingsList() {
		return bookingsList;
	}

	public void setBookingsList(List<Booking> bookingsList) {
		this.bookingsList = bookingsList;
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
