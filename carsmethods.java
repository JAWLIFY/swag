import java.util.Scanner;

public class Carsmethods {

    static void carInfo(String carName, double carPrice) {
        System.out.println("The car " + carName + " costs $" + carPrice);
    }

    static void carGreeting(String carName, int carYear) {
        System.out.println("Hello! Your favorite car is the " + carName + " from the year " + carYear);
    }

    static void carLoanPayment(String carModel, double loanAmount) {
        double monthlyPayment = loanAmount * 0.05;
        System.out.println("The monthly payment for " + carModel + " is $" + monthlyPayment);
    }

    static void roadTripDistance(String vehicle, double speed) {
        double distance = speed * 5;
        System.out.println("The " + vehicle + " traveled " + distance + " miles.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a method: ");
        System.out.println("1. Car Info");
        System.out.println("2. Car Greeting");
        System.out.println("3. Car Loan Payment");
        System.out.println("4. Road Trip Distance");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter car name: ");
            scanner.nextLine();
            String carName = scanner.nextLine();
            System.out.print("Enter car price: ");
            double carPrice = scanner.nextDouble();
            carInfo(carName, carPrice);
        } else if (choice == 2) {
            System.out.print("Enter your favorite car: ");
            scanner.nextLine();
            String carName = scanner.nextLine();
            System.out.print("Enter the year of the car: ");
            int carYear = scanner.nextInt();
            carGreeting(carName, carYear);
        } else if (choice == 3) {
            System.out.print("Enter car model: ");
            scanner.nextLine();
            String carModel = scanner.nextLine();
            System.out.print("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();
            carLoanPayment(carModel, loanAmount);
        } else if (choice == 4) {
            System.out.print("Enter vehicle type: ");
            scanner.nextLine();
            String vehicle = scanner.nextLine();
            System.out.print("Enter speed: ");
            double speed = scanner.nextDouble();
            roadTripDistance(vehicle, speed);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
