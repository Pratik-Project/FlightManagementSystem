package com.test;

public class Flight {

	private String flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private boolean isAvailable;

	public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime,
			boolean isAvailable) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.isAvailable = true;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", isAvailable=" + isAvailable
				+ "]";
	}

	public void bookFlight() {

		//isAvailable = false;

		if (isAvailable) {
			isAvailable = false;
			System.out.println("Flight" +  ">>"+flightNumber+ "<<"+ "booked successfully");
		} else {

			System.out.println("Flight" +  ">>"+flightNumber+ "<<" + "is already booked");
		}

	}

	public void cancelBooking() {

		//isAvailable = true;

		if (!isAvailable) {
			isAvailable = true;

			System.out.println("flight" + ">>"+flightNumber+ "<<"+ "cancelled successfully");
		} else {

			System.out.println("flight" +  ">>"+flightNumber+ "<<" + "is available");
		}

	}

}
