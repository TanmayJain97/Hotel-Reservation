package com.hotel_reservation;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
	
	private HotelReservationUC1 hotelReservation;
	
	@Before
	public void init() {
		hotelReservation = new HotelReservationUC1();
	}
    
	//Testing for creation of 3 hotels
	@Test
    public void whenLakewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Lakewood",110));
    }
	
	@Test
    public void whenBridgewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Bridgewood", 160));
    }
	
	@Test
    public void whenRidgewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Ridgewood", 220));
    }
}