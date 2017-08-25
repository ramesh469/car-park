package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
	/*
		Implemented and designed when a customer wants to enter the car park they interact with the entrance control pillar
	So that they can get into the car park and park their car.

	*/
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	/*
		Defines a Constructor which calls other class functionalities and implemented interface methods. 
	*/
	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
		//TODO Implement constructor
	}
	/*
			When a car approaches an entry barrier, its presence is detected by a sensor
		under the road surface, and a ‘Press Button’ display is flashed on the control
		pillar.
	*/
	@Override
	public void buttonPushed() {
		// TODO Auto-generated method stub
		
	}
	/*
		System displays "Insert Ticket" message at pillar.
	*/
	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		
	}
	/*
		A ‘Take Ticket’ display is flashed on the control pillar
	*/
	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}
	/*
		
	*/
	@Override
	public void notifyCarparkEvent() {
		// TODO Auto-generated method stub
		
	}
	/*
	 	Detects that car has entered and records exit time for ticket.
		Decrement available spaces with one.
	*/
	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
