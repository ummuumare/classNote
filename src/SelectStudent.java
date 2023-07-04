import java.util.Scanner;

public class SelectStudent {
    public static void main(String[] args) {
        /*
          Spor kursu icin secilecek ogrencileri belirleyen bir uygulama  yaziniz

             kurs gereklilikleri:
             erkekler : boy 160 ve ustu
                        kilo: 70-90 kg
             kadin : boy 150 ve ustu
                     kilo 50-70 kg

            kullanicidan ogreni sayisi ve her bir ogrenci icin isim cinsiyet kilo ve boy bilgilerini girmesini isteyiniz..

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba Lutfen formu doldurunuz ..");
        System.out.println("Ogrenci sayisi giriniz");
        int numberStd = scan.nextInt();
        String[] students = new String[numberStd];
        String[] gender = new String[numberStd];
        double[] height = new double[numberStd];
        double[] weight = new double[numberStd];
        boolean isSuccess = true;

        do {
            isSuccess=true;
            for (int i = 0; i < numberStd; ++i) {
                System.out.println("Ogrenci ismi giriniz");

                  String name = scan.next();
                   students[i]=name;
                System.out.println("Cinsiyet: ");
                String gen = scan.next().toUpperCase().substring(0, 1);
                if (gen.equals("K") || gen.equals("E")) {
                    gender[i] = gen;
                } else {
                    System.out.println("invalid entry !!");
                    isSuccess = false;
                    break;
                }
                System.out.println("boy : ");
                double boy = scan.nextDouble();
                height[i]=boy;
                System.out.println("Kilo : ");
                double kilo = scan.nextDouble();
                weight[i]= kilo;

            }
        } while (!isSuccess);
         int counter = 0;
        System.out.println("*** Kursa secilen ogrenciler ***");
        for (int i = 0; i < numberStd; i++) {
            if (gender[i].equals("K") && weight[i] >= 50 && weight[i]<= 70 && height[i]>= 1.50){
                System.out.println("Isim: " + students[i] + " Cinsiyet :" + gender[i] + " boy: " + height[i] + " kilo : " + weight[i]);
                counter++;
            }else if (gender[i].equals("E") && weight[i] >= 70 && weight[i]<= 90 && height[i] >= 1.60){
                System.out.println("Isim: " + students[i] + " Cinsiyet :" + gender[i] + " boy: " + height[i] + " kilo : " + weight[i]);
                counter++;
            }
            if (counter==0){
                System.out.println("Maalesef kursa uygun yeterlilikte ogrenci bulunamamistir");
                break;
            }
        }
    }
}