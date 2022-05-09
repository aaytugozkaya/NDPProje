package project;

public class IsyeriFactory implements IKullaniciFactory {
    @Override
    public IKullanici factoryMethod() {
        Itfaiye itfaiye = new Itfaiye();
        itfaiye.setIsyeriIsmi("Bursa/Nilüfer");
        itfaiye.setMagdurNumara("0505123456");
        return itfaiye;
    }
}
