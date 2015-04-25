package parking.om;

import org.json.JSONArray;

public class ParkingLocation {

	private int parkingId;
	
	private ParkingCoordinate startingCoordinate;
	
	private ParkingCoordinate endingCoordinate;
	
	private JSONArray parkingFeeArray;

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public ParkingCoordinate getStartingCoordinate() {
		return startingCoordinate;
	}

	public void setStartingCoordinate(ParkingCoordinate startingCoordinate) {
		this.startingCoordinate = startingCoordinate;
	}

	public ParkingCoordinate getEndingCoordinate() {
		return endingCoordinate;
	}

	public void setEndingCoordinate(ParkingCoordinate endingCoordinate) {
		this.endingCoordinate = endingCoordinate;
	}

	public JSONArray getParkingFeeArray() {
		return parkingFeeArray;
	}

	public void setParkingFeeArray(JSONArray parkingFeeArray) {
		this.parkingFeeArray = parkingFeeArray;
	}

}
