import static spark.Spark.get;
import static spark.Spark.post;

import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import spark.Request;
import spark.Response;
import spark.Route;

public class CUNYAdventure {
	@SuppressWarnings("null")
	public static Vector<location> onlyVisitedLoc(Vector<location> list){
		Vector<location> returnList = new Vector<location>();
		for (location i : list){
            if(!i.visited){
            	returnList.addElement(i);
            }
        }
		return returnList;
	}
	
	public static void main( String[] args) {
		// list of location to visit
		Vector<location> locList = new Vector<location>();
        locList.addElement(new location(40.734298, -73.815777,"Student Union"));
        locList.addElement(new location(40.735120, -73.816030,"Jefferson Hall"));
        locList.addElement(new location(40.734939, -73.820338,"Science Building"));
		
		// get user's current location
        post("/loc", (req, res) -> {
            location userLoc = new location(40.735361, -73.820600,"Student Location");
            Boolean visited = false;
            for (location i : locList){
	            if(userLoc.compare(i)<=60){
	            	i.visited = true;
	            }
            }
            Gson g = new Gson();
        	String out = g.toJson(onlyVisitedLoc(locList));
            return out;
        });
        
        // return a list of location to visit
        post("/advent", (req, res) -> {
        	Gson g = new Gson();
        	String out = g.toJson(locList);
            return out;
        });
        
    }
}