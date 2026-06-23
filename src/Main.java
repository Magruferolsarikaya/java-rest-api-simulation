import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApiController server = new ApiController();

        System.out.println("=== 1. TEST: Correct Endpoint Request ===");

        String correctAnswer = server.handleGetRequest("/api/subscriptions");
        System.out.println(correctAnswer);

        System.out.println("\n=== 2. TEST: Wrong Endpoint Request ===");

        String wrongAnswer = server.handleGetRequest("/api/users/20240808058");
        System.out.println("Server answer: " + wrongAnswer);
    }
}
class Subscription{
    private int id;
    private String planName;
    private double price;
    public Subscription(int id,String planName,double price){
        this.id=id;
        this.planName=planName;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getPlanName(){
        return planName;

    }
    public double getPrice(){
        return price;
    }
    public String toJson(){
        return "{"+
                "\"id\": "+id+" ,"+
                "\"planName\": \""+planName+ "\","+
                "\"price\": "+price+
                "}";
    }
}
class ApiController {

    private List<Subscription> db = new ArrayList<>();

    public ApiController() {

        db.add(new Subscription(1, "Google AI Pro 5 TB", 499.99));
        db.add(new Subscription(2, "Basic SaaS", 19.99));
        db.add(new Subscription(3, "Enterprise Plan", 999.00));
    }

    public String handleGetRequest(String endpoint) {
        if (endpoint.equals("/api/subscriptions")) {


            StringBuilder jsonBuilder = new StringBuilder();
            jsonBuilder.append("[\n");

            for (int i = 0; i < db.size(); i++) {
                jsonBuilder.append("  ").append(db.get(i).toJson());


                if (i < db.size() - 1) {
                    jsonBuilder.append(",\n");
                } else {
                    jsonBuilder.append("\n");
                }
            }

            jsonBuilder.append("]");
            return jsonBuilder.toString();
        }
        return "404 Not Found";
    }
}