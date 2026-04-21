public class HelloApp {
    public static void main(String[] args) {

        String result;

        // Check if no arguments are provided
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder names = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            result = names.toString();
        }

        // Display greeting
        System.out.println("Hello, " + result + "!");
    }
}
