package bcccp.carpark;

// Sensor detector
public interface ICarSensorResponder {
	
	public void carEventDetected(String detectorId, boolean detected);

}
