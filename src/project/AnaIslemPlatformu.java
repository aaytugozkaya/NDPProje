package project;

public class AnaIslemPlatformu {


private boolean sogutucuAcik;

public boolean sogutucuDurumu(){
    if(sogutucuAcik == true)
        return true;
    else
        return false;
}
public void SogutucuyuKullan(int kapatac){
    Eyleyici eyleyici = new Eyleyici();

    if(kapatac == 0)
    {
        eyleyici.sogutucuKapat();
        sogutucuAcik=false;
    }
    if(kapatac == 1)
    {
        eyleyici.sogutucuAc();
        sogutucuAcik=true;
    }

}
}
