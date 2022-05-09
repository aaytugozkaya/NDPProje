package project;

public class IstemciModul {
    IKullaniciFactory kullaniciFactory;
    public IstemciModul(IKullaniciFactory kullaniciFactory){
        this.kullaniciFactory=kullaniciFactory;
    }

    public void basla(){
        IKullanici kullanici1 = kullaniciFactory.factoryMethod();
    }
}
