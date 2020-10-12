package com.hotel_reservation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
	
	private HotelReservationUC3 hotelReservation;
	private Customer cust;
	
	@Before
	public void init() {
		hotelReservation = new HotelReservationUC3();
		hotelReservation.addHotel("Lakewood", 110,90);
    	hotelReservation.addHotel("Bridgewood", 160,50);
    	hotelReservation.addHotel("Ridgewood", 220,150);
	}
    
	//Testing for creation of 3 hotels
	@Test
    public void whenLakewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Lakewood",110,90));
    }
	
	@Test
    public void whenBridgewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Bridgewood", 160,50));
    }
	
	@Test
    public void whenRidgewoodAdded_ShouldReturnTrue()
    {	
        assertTrue(hotelReservation.addHotel("Ridgewood", 220,150));
    }
	
	//Testing for correct output for staying 1 day
	@Test
    public void whenStayed1Day_CheapestHotelShouldBe_Lakewood()
    {	
		cust=hotelReservation.findCheapestHotel("12.05.2020", "13.05.2020");
        assertEquals(110, cust.getBill());
    }
	
	@Test
    public void whenStayed1Day_CheapestHotelShouldCost_110()
    {	
		cust=hotelReservation.findCheapestHotel("12.05.2020", "13.05.2020");
        assertEquals("Lakewood", cust.getHotelName());
    }
}
