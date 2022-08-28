package com.yash.oops.exceptionhandling.example5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	public static void main(String[] args)
			throws BookingNotAllowedException, BookinglimitExceeded, NormalTicketBookingException {

		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
		String[] timeIn24Hours = formatter.format(currentDate).split(":");
//		System.out.println(timeIn24Hours[0]);

		TicketBooking tb1 = new TicketBooking(1, "Sushant", false, 6);
		TicketBooking tb2 = new TicketBooking(2, "Sushant", false, 6);
		TicketBooking tb3 = new TicketBooking(3, "Sushant", false, 6);
		TicketBooking tb4 = new TicketBooking(4, "Sushant", false, 6);
		TicketBooking tb5 = new TicketBooking(5, "Sushant", false, 6);

		int hour = Integer.parseInt(timeIn24Hours[0].toString());
		int count = 0;

		List<TicketBooking> ll = new ArrayList();
		ll.add(tb1);
		ll.add(tb2);
		ll.add(tb3);
		ll.add(tb4);
		ll.add(tb5);
		ll.add(tb5);
		ll.add(tb5);
		for (TicketBooking tb : ll) {
			count++;

			if (hour <= 10 && hour > 12 && tb.isTatkal() || count > 4 && tb.isTatkal()) {
				throw new BookinglimitExceeded("Booking Limit Exceeded");
			} else if (hour >= 23 && hour < 1) {
				throw new BookingNotAllowedException("Booking Not Allowed");
			} else if (count > 6) {
				throw new NormalTicketBookingException("Normal ticket booking");
			} else if (tb.getAge() > 0 && tb.getAge() < 5) {
				throw new BookingNotAllowedException("Booking Not Allowed");
			} else {
				System.out.println("Ticket Booked Successfully");
			}
		}
	}
}
