import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("hello") || userInput.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");

            } else if (userInput.contains("name")) {
                System.out.println("Bot: My name is Java AI ChatBot.");

            } else if (userInput.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you for asking!");

            } else if (userInput.contains("java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");

            } else if (userInput.contains("python")) {
                System.out.println("Bot: Python is a powerful programming language used in AI and Data Science.");

            } else if (userInput.contains("course")) {
                System.out.println("Bot: Focus on Java, SQL, Spring Boot, and DSA for placements.");

            } else if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;

            } else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}