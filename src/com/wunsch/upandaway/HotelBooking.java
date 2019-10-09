package com.wunsch.upandaway;

public class HotelBooking {
	private long id = 0;
	private double price = 0;
	private String fromDate = "";
	private String toDate = "";
	private String hotel = "";
	private String town = "";
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	public HotelBooking() {
		super();
	}
	
	public HotelBooking(long id, double price, String fromDate, String toDate, String hotel, String town) {
		super();
		this.id = id;
		this.price = price;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.hotel = hotel;
		this.town = town;
	}


}
