package ogrenciIslemleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    public  static List<Ogrenci> eklenenOgrenciler = new ArrayList<>();
    public static void ogrenciSecme(String isim, String cinsiyet, double boy, double kilo){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz : ");
        int ogrencisayisi = scan.nextInt();
        System.out.println("ogrenci bilgileri giriniz ");
        System.out.println("isim : ");
        isim = scan.nextLine();
        scan.next();
        System.out.println("Cinsiyet (Kiz/Erkek) : ");
        cinsiyet = scan.next().toUpperCase().substring(0,1);
        System.out.println("kilo :");
        kilo = scan.nextDouble();
        System.out.println("boy : ");
        boy = scan.nextDouble();
if (cinsiyet.equals("K") && kilo>= 50 && kilo<=70 && boy>= 1.60){
    Ogrenci ogrenci = new Ogrenci(isim, cinsiyet, kilo, boy);
    eklenenOgrenciler.add(ogrenci);

} else if (cinsiyet.equals("E") && kilo >= 60 && kilo <= 80 && boy >= 1.70) {
    Ogrenci ogrenci = new Ogrenci(isim, cinsiyet, kilo, boy);
    eklenenOgrenciler.add(ogrenci);
}
    }
}
