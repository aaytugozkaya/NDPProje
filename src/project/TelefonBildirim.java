package project;

public class TelefonBildirim implements IObserver{
    @Override
    public void guncelleme(String mesaj) {
        System.out.println("Alarm!!!!!! Sıcaklık kritik seviyede." + mesaj);
    }
}
