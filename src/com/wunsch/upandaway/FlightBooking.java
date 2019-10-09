package com.wunsch.upandaway;

public class FlightBooking {
	private long id = 0;
	private double price = 0;
	private String fromDate = "";
	private String toDate = "";
	private String fromDest = "";
	private String toDest= "";
	private String airline = "";
	
	
	public long getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public String getFromDate() {
		return fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public String getFromDest() {
		return fromDest;
	}
	public String getToDest() {
		return toDest;
	}
	public String getAirline() {
		return airline;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public void setFromDest(String fromDest) {
		this.fromDest = fromDest;
	}
	public void setToDest(String toDest) {
		this.toDest = toDest;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public FlightBooking() {
		super();
	}
	@Override
	public String toString() {
		return "FlightBooking [id=" + id + ", price=" + price + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", fromDest=" + fromDest + ", toDest=" + toDest + ", airline=" + airline + "]";
	}
	public FlightBooking(long id, double price, String fromDate, String toDate, String fromDest, String toDest) {
		super();
		this.id = id;
		this.price = price;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromDest = fromDest;
		this.toDest = toDest;
	}
	public FlightBooking(long id, double price, String fromDate, String toDate, String fromDest, String toDest,
			String airline) {
		super();
		this.id = id;
		this.price = price;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromDest = fromDest;
		this.toDest = toDest;
		this.airline = airline;
	}
	
	
}
