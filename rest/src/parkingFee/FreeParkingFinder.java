package parkingFee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("find")
public class FreeParkingFinder {

	@GET
	@Path("check/{coordinate}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean isFreeParking(@PathParam("coordinate") String coordinate) {
		return true;
	}
	
	@GET
	@Path("{coordinate}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getClosestFreeParking(@PathParam("coordinate") String coordinate){
		return "coordinate";
	}
}
