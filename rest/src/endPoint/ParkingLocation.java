package endPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("locations")
public class ParkingLocation {


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation() {
		return "locations";
	}

	@GET
	@Path("{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation(@PathParam("location") String locationId) {
		return locationId;
	}
}
