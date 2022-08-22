package com.inti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Destination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDestination;
	
	private long longitude;
	private long latitude;
	@OneToMany(mappedBy = "hotel")
	List<Hotel> hotels;
	
	
	
	public long getIdDestination() {
		return idDestination;
	}
	public void setIdDestination(long idDestination) {
		this.idDestination = idDestination;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	
	
	
}
