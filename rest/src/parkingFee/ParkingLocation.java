package parkingFee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("locations")
public class ParkingLocation {

	/**
	 * 
	 * To return all locations
	 * i.e. http://localhost:9080/freeParking/locations
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation() {
		return "locations";
	}


	/**
	 * To return specific location by passing location id
	 * 	i.e. http://localhost:9080/freeParking/locations/1
	 * @param locationId
	 * @return
	 */
	@GET
	@Path("{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocation(@PathParam("location") String locationId) {
		return locationId;
	}
}
