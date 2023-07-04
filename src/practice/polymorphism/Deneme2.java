package practice.polymorphism;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        /*
    bilet icin rastgele n tane sayi uretilsin.
    loto sonucu rastgele n tane sayi ile uretilsin
    sayisal lotoda tekrarli sayilar olmamali

    n(hane sayisi), sayilar icin min ve max degerler kullanicidan alinsin

    sonuc ve bilet karsilastirilsin kac eslesme oldugu kullaniciya bildirilsin
     */
        lotoYapma();
    }

    public static void lotoYapma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane sayi girmek istersiniz yaziniz!");
        int degerMiktari = scan.nextInt();
        System.out.println("Lutfen Min deger giriniz");
        int min = scan.nextInt();
        System.out.println("Lutfen Max deger giriniz");
        int max = scan.nextInt();
        Random rnd = new Random();
        int random = rnd.nextInt();
        int[] loto = new int[degerMiktari];
        int[] bilet = new int[degerMiktari];

        int random1 = 0;
        int random2 = 0;
        boolean isRepeat;
        for (int i = 0; i < degerMiktari; i++) {
            do {
                isRepeat = false;
                random1 = rnd.nextInt(max + 1 - min) + min;
                for (int j = 0; j < i; j++) {
                    if (loto[i] == random1) {
                        isRepeat = true;
                        break;
                    }
                }
            } while (isRepeat);
            loto[i] = random1;
            do {
                isRepeat = false;
                random2 = rnd.nextInt(max + 1 - min) + min;
                for (int j = 0; j < i; j++) {
                    if (bilet[i] == random2) {
                        isRepeat = true;
                        break;
                    }
                }
            } while (isRepeat);
            bilet[i] = random2;
        }
        System.out.println("benim biletim : ");
        System.out.println(Arrays.toString(bilet));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("loto degerleri : ");
        System.out.println(Arrays.toString(loto));

        System.out.println();
        int result = compare(bilet,loto);
        if (result>0) {
            System.out.println("Tebrikler ! " + result + " eslesme var.");
        }else {
            System.out.println("maalesef eslesme yok");
        }
        }
    public static int compare(int[] arr, int[] brr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    counter++;
                }
        }

    } return counter;
    }
}
