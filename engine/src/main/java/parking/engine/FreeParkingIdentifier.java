package parking.engine;

import org.json.JSONArray;

import parking.om.FreeParkingPeriod;

public class FreeParkingIdentifier {

	
	/**
	 * Get JSON array of parkingFee ID
	 * @param parkingId parking id
	 * @return The JSON array of parking fee id
	 */
	public JSONArray getParkingFeeJSONArray(final int parkingId){
		return null;
	}

	/**
	 * Get ParkingFee object from parkingFeeId
	 * @param parkingFeeId parking fee ID
	 * @return ParkingFee object
	 */
	public FreeParkingPeriod getParkingFeeFromId(final int parkingFeeId){
		return null;
	}
	
	/**
	 * To compare the current time with start/end time of the parkingFee Object, to determine
	 * It is free to park or not
	 * @param parkingFee ParkingFee object
	 * @return true if the parking is free to park, otherwise false
	 */
	public boolean isFree(FreeParkingPeriod parkingFee){
		return false;
	}
}
