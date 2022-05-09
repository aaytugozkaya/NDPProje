package project;

import java.util.Scanner;

public class Sogutucu {
    public Sogutucu(ISubject publisher) {
        String kullaniciAdi;
        int sifre;
        boolean giris = false;
        do{ //Kullanıcı bilgileri doğrulanana kadar kullanıcı adı ve şifre istenir
            Scanner reader = new Scanner(System.in);
            System.out.print("Kullanici Adi: ");
            kullaniciAdi = reader.next();

            //Kullanıcı doğrulaması yapılırsa kullanıcı ağ arayüzü kullanıcıya menüyü gösterir
            IVeritabaniBagla veritabaniBagla = new VeritabaniBagla();
            ;
            if (veritabaniBagla.KullaniciDogrula(kullaniciAdi)) {
                IAgArayuzu arayuz = new AgArayuzu();
                arayuz.islemSec(publisher);
                giris = true;
            }
        }while(!giris);

    }
}
