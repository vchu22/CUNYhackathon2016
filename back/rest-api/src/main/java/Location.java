import java.util.Comparator;

/**
 * Created by gc on 10/15/2016.
 */
public class Location  {
    public double lat;
    public double lng;
    public String title;
    private boolean visited;

    public Location(double lat, double lng, String title) {
        this.lat = lat;
        this.lng = lng;
        this.title = title;
        visited = false;
    }

    public void visit() {
        visited = true;
    }
}
