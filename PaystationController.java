package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;
	/*
		When the ordinary customer is ready to leave, he or she must go to a pay
		station to pay. The ticket is inserted into a slot, and the bar code is read. The
		ticket bar code information is compared with the stored information
	*/
public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		//TODO Implement constructor
	}
	/*
	After inserting ticket, system will fetch ticket dates and times are the same as the bar code
	dates and times, then the current date and time are obtained, and the
	duration of the stay in the car park is calculated
	*/


	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		
	}
	/*
		Calculation and display of the charge to pay.
	*/
	@Override
	public void ticketPaid() {
		// TODO Auto-generated method stub
		
	}
	/*
		After payment ticket ejected and data recorded 
	*/
	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}

	
	
}
