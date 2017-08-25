package bcccp.carpark;

import java.util.List;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;
/*
	The Council has a requirement for a new system to control its car parks. This
	system must provide for the day-to-day operation of each car park—issuing
	tickets, handling payment and controlling barriers—and the management of
	car parks—recording problems, issuing season tickets and monitoring service
	level agreements with the security company that guards the car parks
*/
public class Carpark implements ICarpark {
	
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int numberOfCarsParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	/*
		Defines a Constructor which calls current class constructor with details like name, capacity, adhoc and session data.
	*/
	public Carpark(String name, int capacity, 
			IAdhocTicketDAO adhocTicketDAO, 
			ISeasonTicketDAO seasonTicketDAO) {
		//TODO Implement constructor
	}
	/*
		System detects that a car has arrived at the entry control pillar.
	*/
	@Override
	public void register(ICarparkObserver observer) {
		// TODO Auto-generated method stub
		
	}

	/*
		Implemented to deregister the car details before leaving parking zone.
	*/
	
	@Override
	public void deregister(ICarparkObserver observer) {
		// TODO Auto-generated method stub
		
	}

	/*
		Vehicle name
	*/

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
		Checks the parking place and informed no space is available.
	*/
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	/*
		Issues adhoc tickets for 
    */
	
	@Override
	public IAdhocTicket issueAdhocTicket() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
		A record of the ticket has been updated and stored.
	 */
	@Override
	public void recordAdhocTicketEntry() {
		// TODO Auto-generated method stub
		
	}
	/*
		Whenever car arrives issues ticket by validating ad-hoc recorded data.
	*/
	@Override
	public IAdhocTicket getAdhocTicket(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
		Based on entry and session, calculates the ad-hoc charges.
	*/	
	@Override
	public float calculateAddHocTicketCharge(long entryDateTime) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
		Records adhoc exit ticket information.
	*/

	@Override
	public void recordAdhocTicketExit() {
		// TODO Auto-generated method stub
		
	}
	/*
		Register the tickets for season customers.
	*/
	@Override
	public void registerSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}
	/*
		To deregister the season tickets for registered season users.
	*/
	@Override
	public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}
	/*
		System checks ticket paid or valid of the season ticket has been updated and stored.
		System displays ‘Invalid ticket’ message in case of invalid. 
	*/	
	@Override
	public boolean isSeasonTicketValid(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
		Validates and check the season ticket is now recorded as not in use
	*/
	@Override
	public boolean isSeasonTicketInUse(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
		Fetches ticket ID and record the entry session.
	*/
	@Override
	public void recordSeasonTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	/*
		Checks session ticket and the season ticket holder has been allowed exit
	*/
	@Override
	public void recordSeasonTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}

	
	

}
