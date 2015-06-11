package parking.om;

public class Period {

	private int parkingFeeId;

	private String startTime;

	private String endTime;

	private String allowTimeUnit;

	public int getParkingFeeId() {
		return parkingFeeId;
	}

	public void setParkingFeeId(int parkingFeeId) {
		this.parkingFeeId = parkingFeeId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAllowTimeUnit() {
		return allowTimeUnit;
	}

	public void setAllowTimeUnit(String allowTimeUnit) {
		this.allowTimeUnit = allowTimeUnit;
	}

}
