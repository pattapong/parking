package parkingFee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("periods")
public class FreeParkingPeriod {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation() {
		return "periods";
	}

	@GET
	@Path("{period}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation(@PathParam("period") String periodId) {
		return periodId;
	}

}
