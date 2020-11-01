package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.name = "John Doe";
        client.yearOfBirth = 1980;
        client.address = "BP, Budafoki út";

        Client anotherClient = new Client();
        anotherClient.name = "Jack Doe";

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your address?");
        String address = scanner.nextLine();

        System.out.println("name: " + name + ", age: " + age + " year old, address: " + address);
    }
}
