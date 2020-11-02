package classstructuremethods;

public class clientMain {
    public static void main(String[] args) {
        client client = new client();

        client.setName("Lippai Tamás");
        client.setYear(1984);
        client.setAddress("4400 Nyíregyháza, Országzászló tér 5.");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("4400 Nyíregyháza, Deák Ferenc utca 88.");

        System.out.println("Új lakcím: " + client.getAddress());
    }
}
