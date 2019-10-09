package com.wunsch.upandaway;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

class TravelAgency {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		//readFile();
		//readAll();
		//split();
		splitAll();
		
	}

	
	static void readFile() throws IOException{	
		
		try (BufferedReader tr = Files.newBufferedReader(Paths.get("/Users/hwunsch/Documents/workspace/Upandaway/res/bookings.txt"),StandardCharsets.UTF_8)){
			String inValue = null;
			while((inValue = tr.readLine()) != null) {
				System.out.println(inValue);
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	static void readAll() throws IOException{
		List <String> lines = Files.readAllLines(Paths.get("/Users/hwunsch/Documents/workspace/Upandaway/res/bookings.txt"));
		Collections.sort(lines);
		
		for(String line : lines)
			System.out.println(line);
	}
	static void split() throws IOException{
		
		RentalCarReservation  rcr = new RentalCarReservation();
		
		String s1 = "F|10|1799.0|20150402|20150402|FRA|YUL|Lufthansa";
        String[] arrOfStr = s1.split(Pattern.quote("|")); 
        
        char type = arrOfStr[0].charAt(0);
        System.out.println("Der Flugtyp ist: "+ type);
        int id = Integer.parseInt(arrOfStr[1]);
        System.out.println("Die Flugnummer ist: "+ id);
        
        rcr.setId(id);
        System.out.println("Die Flugnummer der RentalCarReservation ist: "+ rcr.getId());
        
        double price = Double.parseDouble(arrOfStr[2]);
        System.out.println("Der Preis ist: "+ price);
        String fromDate = arrOfStr[3];
        System.out.println("Das Startdatum ist: "+ fromDate);
        String toDate = arrOfStr[4];
        System.out.println("Das Enddatum ist: "+ toDate);
        
        
        
        for (String a : arrOfStr) {
        	System.out.println(a);}
        } 
	
        
    static void splitAll() throws IOException{
		try (BufferedReader tr = 
				Files.newBufferedReader(Paths.get("/Users/hwunsch/Documents/workspace/Upandaway/res/bookings.txt"),StandardCharsets.UTF_8)){
			String inValue = null;
			int countFlightID=0;
			double sumFlightPrice=0;
			int countCarID=0;
			double sumCarPrice=0;
			int countHotelID=0;
			double sumHotelPrice=0;
			
			Collection<RentalCarReservation> rentalCarReservations = new ArrayList<>();
			final Iterator<RentalCarReservation> rentalCarIterator = rentalCarReservations.iterator();
			Collection<HotelBooking> hotelBookings = new ArrayList<>();
			final Iterator<HotelBooking> hotelBookingIterator = hotelBookings.iterator();
			Collection<FlightBooking> flightBookings = new ArrayList<>();
			final Iterator<FlightBooking> flightBookingIterator = flightBookings.iterator();
			
			while((inValue = tr.readLine()) != null) {
				
				String[] arrOfStr = inValue.split(Pattern.quote("|")); 
				char type = arrOfStr[0].charAt(0);
				//System.out.println("Der Flugtyp ist: "+ type);
			    int id = Integer.parseInt(arrOfStr[1]);
			    //System.out.println("Die Flugnummer ist: "+ id);
			    double price = Double.parseDouble(arrOfStr[2]);
			    //System.out.println("Der Preis ist: "+ price);
			    String fromDate = arrOfStr[3];
			    //System.out.println("Das Startdatum ist: "+ fromDate);
			    String toDate = arrOfStr[4];
			    //System.out.println("Das Enddatum ist: "+ toDate);
			    String pickupLocation = arrOfStr[5];
			    //System.out.println("Die Abholstation ist: "+ pickupLocation);
			    String returnLocation = arrOfStr[6];
			    //System.out.println("Die Rückgabestation ist: "+ returnLocation);
			    
			    
			    

				   
				   
			     //Company fehlt noch
			    switch (type) {
			    case 'F':
			       FlightBooking  fb = new FlightBooking(id,price,fromDate,toDate,pickupLocation,returnLocation);
				   //System.out.printf("Die Flugbuchung hat die Nummer %d und Kostet %,.2f€. Das Startdatum ist am %s am %s, die Rückkehr ist am %s am %s.%n",fb.getId(),fb.getPrice(),fb.getFromDate(),fb.getFromDest(),fb.getToDate(),fb.getToDest());
				   countFlightID++;
				   sumFlightPrice += price;
				   flightBookings.add(fb);
				   break;
			    case 'R':
			       RentalCarReservation  rcr = new RentalCarReservation(id,price,fromDate,toDate,pickupLocation,returnLocation);
				   //System.out.printf("Die Mietwagenresiervierung hat die Nummer %d und Kostet %,.2f€. Der Abholtag ist am %s bei %s, der Rückgabetag ist am %s bei %s.%n",rcr.getId(),rcr.getPrice(),rcr.getFromDate(),rcr.getPickupLocation(),rcr.getToDate(),rcr.getReturnLocation());
				   countCarID++;
				   sumCarPrice += price;
				   rentalCarReservations.add(rcr);
				   break;
			     case 'H':
			       HotelBooking  hb = new HotelBooking(id,price,fromDate,toDate,pickupLocation,returnLocation);
				   //System.out.printf("Die Hotelbuchung hat die Nummer %d und Kostet %,.2f€. Der Anreisetag ist %s am %s in %s, der Abreisetag ist am %s.%n",hb.getId(),hb.getPrice(),hb.getFromDate(),hb.getHotel(),hb.getTown(),hb.getToDate());
				   countHotelID++;
				   sumHotelPrice += price;
				   hotelBookings.add(hb);
				   break;
			    }
			    
			}
			for(RentalCarReservation rentalCarReservation : rentalCarReservations) {
				System.out.println(rentalCarReservation);
				}
			
			
			//while(rentalCarIterator.hasNext()) {
			//	RentalCarReservation rentalCarReservation = rentalCarIterator.next();
			//System.out.println(rentalCarReservation);
			//}
			
			//System.out.print(rentalCarReservations);

			System.out.printf("Es wurden %d Flugbuchungen im Wert von %,.2f€, %d Mietwagenbuchungen im Wert von %,.2f€ und %d Hotelreservierungen im Wert von %,.2f€ angelegt.",countFlightID,sumFlightPrice,countCarID,sumCarPrice,countHotelID,sumHotelPrice);
		
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
    }
}
