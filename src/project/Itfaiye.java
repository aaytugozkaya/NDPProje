package project;

public class Itfaiye implements IKullanici {
    public String isyeriIsmi ;
    public String magdurNumara;

    public String getIsyeriIsmi() {
        return isyeriIsmi;
    }

    public void setIsyeriIsmi(String isyeriIsmi) {
        this.isyeriIsmi = isyeriIsmi;
    }

    public String getMagdurNumara() {
        return magdurNumara;
    }

    public void setMagdurNumara(String magdurNumara) {
        this.magdurNumara = magdurNumara;
    }

    @Override
    public void Ara(String telefonNo) {
        System.out.println(telefonNo + " numarali kişi arandı.");
    }
}
