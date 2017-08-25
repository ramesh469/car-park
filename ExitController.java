package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;
/*
	When a customer wants to exit the car park
	They interact with the exit control pillar
	So that they can get out of the car park and leave.

*/
public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	/*
		A car arrives at the exit control pillar validates the carkpark details and fetches required information.
	*/	
	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
		//TODO Implement constructor
	}
	/*
		System detects that a car has arrived at exit pillar displays ‘Insert Ticket message.
	*/
	@Override
	public void ticketInserted(String ticketStr) {
		// TODO Auto-generated method stub
		
	}
	/*
		Checks ticket paid or valid and displays ‘Take Ticket’ message
	*/
	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}
	/*
		Detects that car has exited and records exit time for ticket.
		increments available spaces with one.
	*/
	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
