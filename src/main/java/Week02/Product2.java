package Week02;

import java.util.Scanner;

public class Product2 {
    private String name;
    private String code;

    public Product2(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product2 P1 = new Product2("apple", "12345");
        Product2 P2 = new Product2("plum", "67890");
        Product2 P3 = new Product2("peach", "45678");

        System.out.println("Product: " + P1.getName() + ", Code" + P1.getCode());
        System.out.println("Product: " + P2.getName() + ", Code" + P2.getCode());
        System.out.println("Product: " + P3.getName() + ", Code" + P3.getCode());
    }
    public void areTheyEqual(boolean) {}
}
