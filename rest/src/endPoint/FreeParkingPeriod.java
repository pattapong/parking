package endPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import parking.om.Period;

@Path("periods")
public class FreeParkingPeriod {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Period getLocation() {
		Period period = new Period();
		period.setAllowTimeUnit("2");
		period.setEndTime("08:00:00 AM");
		period.setStartTime("05:00:00 PM");
		period.setParkingFeeId(2);
		return period;
	}

	@GET
	@Path("{period}")
	@Produces(MediaType.APPLICATION_JSON)
	public Period getPeriod(@PathParam("period") String periodId) {
		Period period = new Period();
		period.setAllowTimeUnit("1");
		period.setEndTime("08:00:00 AM");
		period.setStartTime("05:00:00 PM");
		period.setParkingFeeId(1);
		return period;
	}

}
