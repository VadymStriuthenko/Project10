import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello ");
        System.out.println("I can guess your usual daily activity.");
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        if (age < 6) {
            System.out.println("You are probably at home, going for walks and kindergarten.");
        } else if (age <= 17) {
            System.out.println("You are probably going to school.");
        } else if (age <= 22) {
            System.out.println("You are probably studying at university.");
        } else if (age > 60) {
            System.out.println("You are probably retired.");
        } else {
            System.out.println("You are probably working.");
        }
        System.out.println("Thank you for answering! Have a great day!");
        scanner.close();
    }
}