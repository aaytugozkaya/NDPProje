package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class VeritabaniBagla implements IVeritabaniBagla {

    private Connection baglan()
    {

        Connection conn=null;
        String url = "jdbc:postgresql://localhost:5432/SogutucuProje";
        String user = "postgres";
        String password = "143646";
        try {
            conn = DriverManager.getConnection(url,user,password);

            System.out.println("Veritabanına bağlandı!");

        } catch (Exception e) {
            System.out.println("Bağlantı girişimi başarısız!");
            e.printStackTrace();
        }
        return conn;
    }



    public boolean KullaniciDogrula(String kullaniciAdi) {
        System.out.println("Kullanıcı kontrol ediliyor...");

        System.out.println("Hesap bilgilerine erişiliyor...");


        Connection conn=this.baglan();
        try
        {

            String sql= "SELECT *  FROM public.kullanici WHERE kullaniciadi='"+kullaniciAdi+"'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);




            if(rs.next())
            {
                System.out.println("Kullanici adi dogru.");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Sifre giriniz.");
                int sifre = scanner.nextInt();
                String sql2= "SELECT *  FROM public.kullanici WHERE kullaniciadi='"+kullaniciAdi+"' AND sifre="+ sifre;

                Statement stmtn = conn.createStatement();
                ResultSet rss = stmt.executeQuery(sql2);
                conn.close();
                if(rss.next()){
                    System.out.println("Sifre dogru.");
                    return true;
                }

            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}

