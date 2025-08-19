import java.util.HashMap;

public class HashM {

    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington Dc");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");

        // System.out.println(countries);

        // countries.remove("USA");

        // countries.clear();

        // System.out.println(countries.get("India"));
        // System.out.println(countries);

        // countries.replace("India", "Pune");

        // countries.containsKey("England"); // false
        // System.out.println(countries.containsValue("Berlin")); // true

        for (String display : countries.keySet()) {
            System.out.println("capital city of " + display + " is " + countries.get(display) + ".");
        }
    }
}
