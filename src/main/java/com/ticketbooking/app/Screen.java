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
@Table(name = "screens")
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "screen_id")
	private int screenId;

	@Column(name = "screen_name")
	private String screenName;

	@Column(name = "location")
	private String location;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "seating_capacity")
	private int seatingCapacity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "screen_id")
	@OrderColumn(name = "idx")
	private List<Seat> seatslist;

	@Column(name = "created_by")
	private String createdBy = "system";

	@Column(name = "create_date")
	private String createDate;

	@Column(name = "modified_by")
	private String modifiedBy = "system";

	@Column(name = "modified_date")
	private String modifiedDate;

	public Screen() {
		super();
	}

	public Screen(int screenId, String screenName, String location, String city, String state, String country,
			int seatingCapacity, List<Seat> seatslist, String createdBy, String createDate, String modifiedBy,
			String modifiedDate) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.location = location;
		this.city = city;
		this.state = state;
		this.country = country;
		this.seatingCapacity = seatingCapacity;
		this.seatslist = seatslist;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public List<Seat> getSeatslist() {
		return seatslist;
	}

	public void setSeatslist(List<Seat> seatslist) {
		this.seatslist = seatslist;
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
