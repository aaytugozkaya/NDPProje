package project;

public class Main {
    public static void main(String[] args) {
        TelefonBildirim tlfn= new TelefonBildirim();
        ItfaiyeBildirim itfaiye = new ItfaiyeBildirim();
        Publisher publisher = new Publisher();
        publisher.ekle(tlfn);
        publisher.ekle(itfaiye);

        Sogutucu sogutucu = new Sogutucu(publisher);
    }
}
