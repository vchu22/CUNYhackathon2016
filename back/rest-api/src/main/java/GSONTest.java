/**
 * Created by gc on 10/15/2016.
 */
import com.google.gson.*;
import java.util.ArrayList;

public class GSONTest {
    public static void print(Object o) {
        System.out.println(o);
    }
    public static void main(String[] args) {
        //learning exercise for using gson to convert java objects back and forth

        // Serialization
        Location l = new Location(42.24242424,41.12121212, "random");
        ArrayList<Location> list = new ArrayList<Location>();
        list.add(l);
        list.add(l);
        list.add(l);

        Gson gson = new Gson();
        gson.toJson(1);            // ==> 1
        gson.toJson("abcd");       // ==> "abcd"
        gson.toJson(new Long(10)); // ==> 10
        int[] values = { 1 };
        gson.toJson(values);       // ==> [1]
        print(gson.toJson(l));
        print(gson.toJson(list));

// Deserialization
//        int one = gson.fromJson("1", int.class);
//        Integer one = gson.fromJson("1", Integer.class);
//        Long one = gson.fromJson("1", Long.class);
//        Boolean false = gson.fromJson("false", Boolean.class);
//        String str = gson.fromJson("\"abc\"", String.class);
//        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);
    }
}
