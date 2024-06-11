import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private static ArrayList<String> usn = new ArrayList<>();
    private static ArrayList<String> pw = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Login Register page");
            System.out.print("1. Register\n");
            System.out.print("2. Login\n");
            System.out.print("3. Exit\n");
            System.out.print("Please choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        usernames.add(username);
        passwords.add(password);
        
        System.out.println("Registration successful!");
    }
     private static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        boolean loggedIn = false;
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username) && passwords.get(i).equals(password)) {
                loggedIn = true;
                break;
            }
        }
        
        if (loggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

}
