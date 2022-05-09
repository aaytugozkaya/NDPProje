package project;

public class ItfaiyeBildirim implements IObserver{



    @Override
    public void guncelleme(String mesaj) {

        System.out.println("İtfaiye merkezi :" + mesaj );
    }

}
