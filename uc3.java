public class HelloApp {
    public static void main(String[] args) {
        // Check if argument is provided, else use default "World"
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting
        System.out.println("Hello " + name);
    }
}
