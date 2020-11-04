package Week02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phoneOne = new Phone("Apple", 8);
        Phone phoneTwo = new Phone("Samsung", 4);
        System.out.println("Típus: " + phoneOne.type + ", Memória mérete: " + phoneOne.mem + " Gb");
        System.out.println("Típus: " + phoneTwo.type + ", Memória mérete: " + phoneTwo.mem + " Gb");
    }
}





