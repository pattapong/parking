package parking.om;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FreeParkingPeriod {

	private int parkingFeeId;
	
	private Date startTime;
	
	private Date endTime;
	
	private TimeUnit allowTimeUnit;

	public int getParkingFeeId() {
		return parkingFeeId;
	}

	public void setParkingFeeId(int parkingFeeId) {
		this.parkingFeeId = parkingFeeId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public TimeUnit getAllowTimeUnit() {
		return allowTimeUnit;
	}

	public void setAllowTimeUnit(TimeUnit allowTimeUnit) {
		this.allowTimeUnit = allowTimeUnit;
	}
	
}
