import com.google.gson.JsonObject;

public class location{
	public double latitude;
	public double longitude;
	public String locName;
	public Boolean visited;
	public location(double lat, double lang, String loc){
		latitude = lat;
		longitude = lang;
		locName = loc;
		visited = false;
	}
	
	/*
	 * calculate distance between two points in meters
	 * 1 deg latitude = 110.574 km
	 * 1 deg longitude = 111.320*cos(latitude) km
	 */
	public double compare(location b){
		double distance;
		double x1 = this.latitude*110.574, x2 = b.latitude*110.574;
		double y1 = 111.320*Math.cos(this.longitude), y2 = 111.320*Math.cos(b.longitude);
		//double x = this.latitude-b.latitude);
		distance = Math.abs(Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
		distance *= 1000; 
		return distance;
	}
}
