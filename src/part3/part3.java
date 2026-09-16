```java
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     BOOK RECOMMENDATION APP");
        System.out.println("=================================");

        System.out.print("Hi! What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nChoose your favourite genre:");
        System.out.println("1 - Detective");
        System.out.println("2 - Fantasy");
        System.out.println("3 - Non-fiction");
        System.out.println("4 - Science fiction");

        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String genre;

        // switch statement
        switch (choice) {
            case 1:
                genre = "detective";
                break;
            case 2:
                genre = "fantasy";
                break;
            case 3:
                genre = "non-fiction";
                break;
            case 4:
                genre = "science fiction";
                break;
            default:
                genre = "unknown";
        }

        System.out.println("\nNice to meet you, " + name + "!");

        // Check that the genre is valid
        if (!genre.equals("unknown")) {

            System.out.println("You chose " + genre + ".");
            System.out.println("Let me find a book for you...\n");

            // Age + genre conditions
            if (age >= 13 && age <= 16) {

                if (genre.equals("detective")) {
                    System.out.println("I recommend: The Hound of the Baskervilles by Arthur Conan Doyle.");
                } else if (genre.equals("fantasy")) {
                    System.out.println("I recommend: The Hobbit by J.R.R. Tolkien.");
                } else if (genre.equals("non-fiction")) {
                    System.out.println("I recommend: A Short History of Nearly Everything by Bill Bryson.");
                } else {
                    System.out.println("I recommend: Ender's Game by Orson Scott Card.");
                }

            } else if (age >= 17 && age <= 25) {

                if (genre.equals("detective")) {
                    System.out.println("I recommend: And Then There Were None by Agatha Christie.");
                } else if (genre.equals("fantasy")) {
                    System.out.println("I recommend: The Name of the Wind by Patrick Rothfuss.");
                } else if (genre.equals("non-fiction")) {
                    System.out.println("I recommend: Atomic Habits by James Clear.");
                } else {
                    System.out.println("I recommend: The Martian by Andy Weir.");
                }

            } else if (age > 25) {

                if (genre.equals("detective")) {
                    System.out.println("I recommend: The Murder of Roger Ackroyd by Agatha Christie.");
                } else if (genre.equals("fantasy")) {
                    System.out.println("I recommend: The Lord of the Rings by J.R.R. Tolkien.");
                } else if (genre.equals("non-fiction")) {
                    System.out.println("I recommend: Sapiens by Yuval Noah Harari.");
                } else {
                    System.out.println("I recommend: Dune by Frank Herbert.");
                }

            } else {
                System.out.println("You are quite young! I recommend starting with The Hobbit.");
            }

            // Additional logical operators
            if (age >= 13 && age <= 25) {
                System.out.println("\nThese books are suitable for your age group.");
            }

            if (genre.equals("fantasy") || genre.equals("science fiction")) {
                System.out.println("You seem to enjoy imaginative stories! 🚀");
            }

            if (age != 0 && age > 0) {
                System.out.println("Your age was entered correctly.");
            }

            // Another nested if/else
            if (age >= 18) {
                if (genre.equals("non-fiction")) {
                    System.out.println("You might also enjoy books about history, science or personal development.");
                } else {
                    System.out.println("You might also enjoy exploring other fiction genres.");
                }
            } else {
                System.out.println("You might enjoy reading with friends or discussing books at school.");
            }

        } else {
            System.out.println("Sorry, I don't recognize that genre.");
        }

        System.out.println("\nThank you for using the Book Recommendation App, "
                + name + "! 📚");
        System.out.println("Happy reading!");

        scanner.close();
    }
}
```
