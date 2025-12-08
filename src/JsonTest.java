import org.json.JSONObject;

public class JsonTest {
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "Florence");
        obj.put("role", "Student");
        obj.put("age", 23);

        // Print JSON
        System.out.println(obj.toString(4)); // pretty print
    }
}
