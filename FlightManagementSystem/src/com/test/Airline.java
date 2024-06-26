package com.test;

import java.util.Arrays;

public class Airline {
	
	private Flight[] flights;
	private Passenger [] passengers;
	private int flightCount;
	private int passengerCount;
	private final int maxFlights = 10;
    private final int maxPassengers = 10;
    
    
    public Airline() {
        flights = new Flight[maxFlights];
        passengers = new Passenger[maxPassengers];
        flightCount = passengerCount = 0;
    }
	
	public Airline(Flight[] flights, Passenger[] passengers, int flightCount, int passengerCount) {
		super();
		this.flights = flights;
		this.passengers = passengers;
		this.flightCount = flightCount=0;
		this.passengerCount = passengerCount=0;
	}

	 public void addFlight(Flight flight) {
	        if (flightCount < maxFlights) {
	            flights[flightCount++] = flight;
	        } else {
	            System.out.println("Maximum number of flights reached");
	        }
	    }
		
		
	  public void removeFlight(String flightNumber) {
	        for (int a = 0; a < flightCount; a++) {
	            if (flights[a].getFlightNumber().equals(flightNumber)) {
	               
	                for (int b = a; b < flightCount - 1; b++) {
	                    flights[b] = flights[b + 1];
	                }
	                flights[flightCount - 1] = null;
	                flightCount--;
	                break;
	            }
	        }
	    }
	
	
	   public void registerPassenger(Passenger passenger) {
	        if (passengerCount < maxPassengers) {
	            passengers[passengerCount++] = passenger;
	        } else {
	            System.out.println("Maximum number of passengers reached");
	        }
	    }

	    public void unregisterPassenger(String passportNumber) {
	        for (int a = 0; a < passengerCount; a++) {
	            if (passengers[a].getPassportNumber().equals(passportNumber)) {
	               
	                for (int b = a; b < passengerCount - 1; b++) {
	                    passengers[b] = passengers[b + 1];
	                }
	                passengers[passengerCount - 1] = null;
	                passengerCount--;
	                break;
	            }
	        }
	    }

	    
	    private Passenger findPassenger(String passportNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                return passengers[i];
	            }
	        }
	        return null;
	    }

	    private Flight findFlight(String flightNumber) {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                return flights[i];
	            }
	        }
	        return null;
	    }
	    
	    
	    
	    public void bookFlight(String passportNumber, String flightNumber) {
	        Passenger passenger = findPassenger(passportNumber);
	        Flight flight = findFlight(flightNumber);
	        if (passenger != null && flight != null && flight.isAvailable()) {
	            passenger.bookFlight(flight);
	            System.out.println("Flight booked successfully for " + passenger.getNameOfPassenger());
	        } else {
	            if (passenger == null) {
	                System.out.println("Passenger not found with passport number: " + passportNumber);
	            } else if (flight == null) {
	                System.out.println("Flight not found with number: " + flightNumber);
	            } else {
	                System.out.println("Flight unavailable for booking");
	            }
	        }
	    }

	    public void cancelBooking(String passportNumber, String flightNumber) {
	        Passenger passenger = findPassenger(passportNumber);
	        Flight flight = findFlight(flightNumber);
	        if (passenger != null && flight != null) {
	            passenger.cancelBooking(flight);
	            System.out.println("Flight booking cancelled for " + passenger.getNameOfPassenger());
	        } else {
	            if (passenger == null) {
	                System.out.println("Passenger not found with passport number: " + passportNumber);
	            } else {
	                System.out.println("Flight not found with number: " + flightNumber);
	            }
	        }
	    }
	  
	  
	   
	    public void listAvailableFlights() {
	        System.out.println("Available Flights:");
	        int count = 0;
	        for (int a = 0; a < flightCount; a++) {
	            if (flights[a].isAvailable()) {
	                System.out.println(flights[a]);
	                count++;
	            }
	        }
	        if (count == 0) {
	            System.out.println("No available flights found.");
	        }
	    }

		@Override
		public String toString() {
			return "Airline [flights=" + Arrays.toString(flights) + ", passengers=" + Arrays.toString(passengers)
					+ ", flightCount=" + flightCount + ", passengerCount=" + passengerCount + ", maxFlights="
					+ maxFlights + ", maxPassengers=" + maxPassengers + "]";
		}
	  
	  
	  
	
	
	
}
