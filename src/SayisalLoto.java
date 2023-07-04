import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class SayisalLoto {
    /*
    bilet icin rastgele n tane sayi uretilsin.
    loto sonucu rastgele n tane sayi ile uretilsin
    sayisal lotoda tekrarli sayilar olmamali

    n(hane sayisi), sayilar icin min ve max degerler kullanicidan alinsin

    sonuc ve bilet karsilastirilsin kac eslesme oldugu kullaniciya bildirilsin
     */
    public static void main(String[] args) {
generateLoto();
    }
    public static void generateLoto(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayisal loto icin sayi hanesi sayisi giriniz: ");
        int slots = scan.nextInt();
        System.out.print("Sayilar icin min deger giriniz: ");
        int min = scan.nextInt();
        System.out.print("Sayilar icin max deger giriniz: ");
        int max = scan.nextInt();
        //loto ve bilet icin
        int[] lotoArr  = new int[slots];
        int[] ticketArr = new int[slots];

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        Random random = new Random();
        boolean isRepeat;
        for (int i = 0; i < slots; i++) {
            do {
                isRepeat =false;
                randomNumber1=  random.nextInt(max+1-min)+min;
                for (int j = 0; j <i ; j++) {
                    if (lotoArr[i]==randomNumber1){
                        isRepeat =true;
                        break;
                    }
                }
            }while (isRepeat);
            lotoArr[i]=randomNumber1;

            do {
                isRepeat =false;
                randomNumber2=  random.nextInt(max+1)+min;
                for (int j = 0; j <i ; j++) {
                    if (lotoArr[i]==randomNumber2){
                        isRepeat =true;
                        break;
                    }
                }
            }while (isRepeat);
            ticketArr[i]=randomNumber2;

        }
        System.out.println("Benim biletim : ");
        for (int i = 0; i < ticketArr.length; i++) {
            System.out.print(ticketArr[i] + " ");
        }
        System.out.println("\n--------------");
        System.out.println("Loto sonucu : ");
        for (int i = 0; i < lotoArr.length; i++) {
            System.out.print(lotoArr[i] + " ");
        }
        System.out.println();
        int result = compareArr(ticketArr,lotoArr);
        if (result>0) {
            System.out.println("Tebrikler ! " + result + " eslesme var.");
        }else {
            System.out.println("maalesef eslesme yok");
        }
    }

    public static int compareArr(int[] arr, int [] brr){
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <brr.length ; j++) {
                if (arr[i]==brr[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}

