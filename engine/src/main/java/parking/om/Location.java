package parking.om;

import org.json.JSONArray;

public class Location {

	private int parkingId;
	
	private Coordinate startingCoordinate;
	
	private Coordinate endingCoordinate;
	
	private JSONArray freeParkingTimeArray;

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public Coordinate getStartingCoordinate() {
		return startingCoordinate;
	}

	public void setStartingCoordinate(Coordinate startingCoordinate) {
		this.startingCoordinate = startingCoordinate;
	}

	public Coordinate getEndingCoordinate() {
		return endingCoordinate;
	}

	public void setEndingCoordinate(Coordinate endingCoordinate) {
		this.endingCoordinate = endingCoordinate;
	}

	public JSONArray getFreeParkingTimeArray() {
		return freeParkingTimeArray;
	}

	public void setFreeParkingTimeArray(JSONArray freeParkingTimeArray) {
		this.freeParkingTimeArray = freeParkingTimeArray;
	}

}
