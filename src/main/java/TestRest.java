import static spark.Spark.*;

public class TestRest {
    public static void main(String[] args) {
       get("/ola", (req, res) -> "Ol� Mundo!");
       get("/hello", (req, res) -> "Hello World");
    }
}
