package com.wunsch.upandaway;

public class RentalCarReservation {
	
	private long id = 0;
	private double price = 0;
	private String fromDate = "";
	private String toDate = "";
	private String pickupLocation = "";
	private String returnLocation = "";
	private String company = "";
	
	//============== Getter ============
	
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
	public String getPickupLocation() {
		return pickupLocation;
	}
	public String getReturnLocation() {
		return returnLocation;
	}
	public String getCompany() {
		return company;
	}
	
	//============== Setter ============

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
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}
	public void setCompany(String company) {
		this.company = company;
	}
		
	//============ Constructor ===========
	
	public RentalCarReservation() {
		super();
	}
	
	public RentalCarReservation(long id, double price, String fromDate, String toDate, String pickupLocation,
			String returnLocation) {
		super();
		this.id = id;
		this.price = price;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.pickupLocation = pickupLocation;
		this.returnLocation = returnLocation;
	}
	public RentalCarReservation(long id, double price, String fromDate, String toDate, String pickupLocation,
			String returnLocation, String company) {
		super();
		this.id = id;
		this.price = price;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.pickupLocation = pickupLocation;
		this.returnLocation = returnLocation;
		this.company = company;
	}
	@Override
	public String toString() {
		return "RentalCarReservation [id=" + id + ", price=" + price + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", pickupLocation=" + pickupLocation + ", returnLocation=" + returnLocation + ", company=" + company
				+ "]";
	}
}
