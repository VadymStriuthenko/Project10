import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // clear the input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // ==, !=, >, <, <=, >=
        if (age == 18) {
            System.out.println("You are exactly 18 years old.");
        } else if (age != 18) {
            System.out.println("You are not 18 years old.");
        }

        if (age > 17) {
            System.out.println("You are 18 or older.");
        }

        if (age < 18) {
            System.out.println("You are younger than 18.");
        }

        if (age <= 17) {
            System.out.println("You are 17 or younger.");
        }

        if (age >= 18) {
            System.out.println("You are 18 or older.");
        }

        // String.equals()
        if (name.equals("Alex")) {
            System.out.println("Hello, Alex!");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        // && operator
        if (age >= 13 && age <= 16) {
            System.out.println("You are between 13 and 16.");
        }

        // || operator
        if (age < 6 || age > 60) {
            System.out.println("You are in a special age group.");
        }

        // ! operator
        boolean student = age >= 7 && age <= 22;

        if (!student) {
            System.out.println("You are not in the school/university age group.");
        }

        // Nested if/else
        if (age >= 18) {
            if (age <= 22) {
                System.out.println("You are probably a university student.");
            } else {
                System.out.println("You are probably working.");
            }
        } else {
            System.out.println("You are probably still at school.");
        }

        // switch
        System.out.print("Choose a day number (1-3): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday - school or work.");
                break;
            case 2:
                System.out.println("Tuesday - school or work.");
                break;
            case 3:
                System.out.println("Wednesday - school or work.");
                break;
            default:
                System.out.println("Unknown day.");
        }

        scanner.close();
    }
}