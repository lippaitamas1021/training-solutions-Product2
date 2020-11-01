package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favourite band?");
        String band = scanner.nextLine();

        System.out.println("What is your favourite song?");
        String title = scanner.nextLine();

        System.out.println("How long is that song?");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Band: " + band + ", Title: " + title + ", Length: " + length + " min");
    }
}
