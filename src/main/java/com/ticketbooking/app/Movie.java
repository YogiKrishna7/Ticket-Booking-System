package com.ticketbooking.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movieId;

    @Column(name = "movie_title")
    private String movieTitle;

    @Column(name = "duration")
    private int duration;

    @Column(name = "rating")
    private String rating;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "audio_language")
    private String audioLanguage;

    @Column(name = "created_by")
    private String createdBy = "system";

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "modified_by")
    private String modifiedBy = "system";

    @Column(name = "modified_date")
    private String modifiedDate;

	

	public Movie() {
	}

	
	public Movie(int movieId, String movieTitle, int duration, String rating, String releaseDate, String audioLanguage,
			String createdBy, String createDate, String modifiedBy, String modifiedDate) {
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.duration = duration;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.audioLanguage = audioLanguage;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAudioLanguage() {
		return audioLanguage;
	}

	public void setAudioLanguage(String audioLanguage) {
		this.audioLanguage = audioLanguage;
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
