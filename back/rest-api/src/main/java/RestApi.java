/**
 * Created by gc on 10/14/2016.
 */

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.secure;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;
//import spark.Route;
import java.util.ArrayList;

//store locations
//send notifications
//keep track of points
public class RestApi {
    public static void main( String[] args) {

        ArrayList<Location> visitedLocs = new ArrayList<Location>();
        visitedLocs.add(new Location(1,1,"paco"));
        visitedLocs.add(new Location(1,1,"paco"));
        Gson gson = new Gson();

        //secure("deploy/keystore.jks", "password", null, null);

        //run a test to retrieve json object
        get("/advent", (req, res) -> {
            //return a json array of location objects
            return gson.toJson(visitedLocs);
        });

        post("/loc", (req,res) -> {
            Location place;

           for (Location loc : visitedLocs) {

           }
           return "blah";
        });

    }
}
