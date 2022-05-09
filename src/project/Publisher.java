package project;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{

    private List<IObserver> bildirimGidecekler = new ArrayList<>();

    @Override
    public void ekle(IObserver subscriber) {
        bildirimGidecekler.add(subscriber);
    }
    @Override
    public void bildirimGonder(String bildirim) {
        for(IObserver aboneler: bildirimGidecekler) {
            aboneler.guncelleme(bildirim);
        }
    }
}
