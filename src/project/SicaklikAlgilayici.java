package project;

import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    private int sicaklik;
    ISubject publisher;
    public void sicaklikOku(){
        System.out.println("Sicaklik :" + sicaklikGonder() + " derecedir.");
    }

    public  SicaklikAlgilayici(ISubject publisher) {

        Random rand = new Random();
        sicaklik = rand.nextInt(50);
        if(sicaklikGonder()>40) {
            publisher.bildirimGonder("Sıcaklık" + sicaklik +"DERECE ! Önleminizi alin.");
        }

    }

    @Override
    public int sicaklikGonder() {
        return sicaklik;
    }
}
