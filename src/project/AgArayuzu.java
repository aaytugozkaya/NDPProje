package project;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{
    @Override
    public void islemSec(ISubject publisher) {
        int secim = 0;
        AnaIslemPlatformu aip = new AnaIslemPlatformu();
        do{
            Scanner scanner = new Scanner(System.in);

            System.out.println("1) Soğutucuyu Aç.");
            System.out.println("2) Soğutucuyu Kapat.");
            System.out.println("3) Sıcaklık Görüntüle.");
            System.out.println("4) Bildirim Gönder.");
            System.out.println("5) Çıkış yap.");
            System.out.print("Seçiminiz : ");
            secim = scanner.nextInt();


             switch(secim){
                case 1:
                    if(aip.sogutucuDurumu()==true){
                        System.out.println("Sogutucu zaten kullanımda...\n");
                    }
                    else aip.SogutucuyuKullan(1);
                    break;
                case 2:
                    if(aip.sogutucuDurumu()==false){
                        System.out.println("Sogutucu zaten kapali durumda...\n");
                    }
                    else aip.SogutucuyuKullan(0);
                    break;
                case 3:
                    SicaklikAlgilayici sicaklik = new SicaklikAlgilayici(publisher);
                    sicaklik.sicaklikOku();

                    break;
                 case 4:
                     SicaklikAlgilayici sicaklikk = new SicaklikAlgilayici(publisher);
                    publisher.bildirimGonder("Şu andaki sıcaklık :" + sicaklikk.sicaklikGonder());
                     break;
                case 5:
                    break;
                default:
                    System.out.println("Böyle bir işlem bulunmamaktadır!!Lütfen uygun işlemi seçiniz.\n");
                    break;
            }

        }while(secim != 4);
    }

}
