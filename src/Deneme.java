import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
         /*
          Spor kursu icin secilecek ogrencileri belirleyen bir uygulama  yaziniz

             kurs gereklilikleri:
             erkekler : boy 160 ve ustu
                        kilo: 70-90 kg
             kadin : boy 150 ve ustu
                     kilo 50-70 kg

            kullanicidan ogrenCi sayisi ve her bir ogrenci icin isim cinsiyet kilo ve boy bilgilerini girmesini isteyiniz..

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisi giriniz..");
        int numbersStd = scan.nextInt();
        String[] isim = new String[numbersStd];
        double[] weight = new double[numbersStd];
        double[] height = new double[numbersStd];
        String[] gender = new String[numbersStd];
        boolean isSuccess = true;

        do {

            for (int i = 0; i < numbersStd; i++) {
                System.out.println("ogrenci ismi :");
                String name = scan.next();
                isim[i] = name;
                System.out.println("cinsiyet :");
                String gen = scan.next().toUpperCase().substring(0, 1);
                if (gen.equals("K") || gen.equals("E")) {
                    gender[i] = gen;
                } else {
                    System.out.println("invalid entry");
                    isSuccess = false;
                    break;
                }
                System.out.println("boy :");
                height[i] = scan.nextDouble();
                System.out.println("kilo :");
                weight[i] = scan.nextDouble();
            }
        } while (!isSuccess);
        System.out.println("*****CHOOSEN STUDENTS FOR THE COURSE*******");
        int counter = 0;

        for (int i = 0; i < numbersStd; i++) {
            if (gender[i].equals("K") && weight[i] >= 50 && weight[i] <= 70 && height[i] > 150) {
               System.out.println("isim : " + isim[i] +" Cinsiyet: " + gender[i] + " Boy: " + height[i] + " Kilo: " + weight[i] );

                counter++;
            } else if (gender[i].equals("E") && weight[i] >= 70 && weight[i] <= 90 && height[i] > 170) {
              System.out.printf("isim: " + isim[i] + " Cinsiyet: " + gender[i] + " Boy: " + height[i] + " Kilo: " + weight[i]);
                counter++;
            }
        }
            if (counter == 0) {
                System.out.println("Maalesef kursa ogrenci kaydi yapilamamistir");
            } else
                System.out.println(counter + " tane ogrenci kaydedilmistir");
        }
    }
