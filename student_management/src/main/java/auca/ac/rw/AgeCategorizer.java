package auca.ac.rw;


public class AgeCategorizer {

    public static String categorize(int age, String sex) {
        if (age < 0) return "Invalid age";
        if (sex == null) return "Invalid sex";
        
        sex = sex.trim().toLowerCase();
        if (!sex.equals("male") && !sex.equals("female")) return "Invalid sex";

        if (age <= 12) {
            return sex.equals("male") ? "Baby Boy" : "Baby Girl";
        } else if (age < 18) {
            return sex.equals("male") ? "Teen Boy" : "Teen Girl";
        } else {
            return sex.equals("male") ? "Gentleman" : "Lady";
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java sia.AgeCategorizer <age> <sex>");
            return;
        }

        try {
            int age = Integer.parseInt(args[0]);
            String sex = args[1];
            System.out.println("Category: " + categorize(age, sex));
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Must be a number.");
        }
    }
}