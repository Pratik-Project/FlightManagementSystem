package com.test;

import java.util.Arrays;

public class Passenger {
	
	private String nameOfPassenger;
	private String passportNumber;
	private Flight[] bookedFlights;
	private int bookedFlightCount;
	public Passenger(String nameOfPassenger, String passportNumber) {
		
		this.nameOfPassenger = nameOfPassenger;
		this.passportNumber = passportNumber;
		this.bookedFlights = new Flight[4];
		this.bookedFlightCount = 0;
	}
	public String getNameOfPassenger() {
		return nameOfPassenger;
	}
	public void setNameOfPassenger(String nameOfPassenger) {
		this.nameOfPassenger = nameOfPassenger;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Flight[] getBookedFlight() {
		return bookedFlights;
	}
	public void setBookedFlight(Flight[] bookedFlight) {
		this.bookedFlights = bookedFlight;
	}
	public int getBookedFlightCount() {
		return bookedFlightCount;
	}
	public void setBookedFlightCount(int bookedFlightCount) {
		this.bookedFlightCount = bookedFlightCount;
	}
	@Override
	public String toString() {
		return "Passenger [nameOfPassenger=" + nameOfPassenger + ", passportNumber=" + passportNumber
				+ ", bookedFlight=" + Arrays.toString(bookedFlights) + ", bookedFlightCount=" + bookedFlightCount + "]";
	}
	
	
	
       public Flight bookFlight(Flight flight) {
		
		if(bookedFlights.length>bookedFlightCount) {
			
			bookedFlights[bookedFlightCount++]=flight;
			
			flight.bookFlight();
			
			System.out.println(nameOfPassenger+"   " +"bookedflight"+"   " +flight.getFlightNumber());
		}else {
			
			System.out.println("The flight has already booked,try other flights");
		}
		
		return flight;
	}
       
       
       public Flight cancelBooking(Flight flight) {
    	   
    	   for(int a=0;a<bookedFlightCount;a++) {
    		   
    		   if(bookedFlights[a].getFlightNumber().equals(flight.getFlightNumber())){
    			   
    			   for(int b=a;b<bookedFlightCount;b++) {
    				   
    				   
    				   bookedFlights[b]=bookedFlights[b+1];
    				   
    				   
    			   }
    			   
    			   bookedFlights[bookedFlightCount-1]=null;
    			   
    			   bookedFlightCount--;
    			   flight.cancelBooking();
    			   
    		   }
    	   }
    	   
    	   
    	   
    	   return flight;
       }
	
	
	
	
	
	
	
	
	
	
	
	

}
