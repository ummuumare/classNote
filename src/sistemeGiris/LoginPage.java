package sistemeGiris;

import java.util.Scanner;

public class LoginPage {
    public  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        start();
    }
    public  static void start(){
     int selection;
      do {
          showMenu();
          selection =input.nextInt();
          switch (selection){
              case 1:
                  //Uye olma
                  break;
              case 2:
                  //giris yapma
                  break;
              case 0:
                  System.out.println("iyi gunler bekleriz");
                  break;
              default:
                  System.out.println("Hatali giris yaptiniz, tekrar deneyinz...");
          }

      }while (selection!=0);



    }

    public static void showMenu() {
        System.out.println("*******TECHPROEDUCATION*************");
        System.out.println("1-Uye ol");
        System.out.println("2- Giris yap");
        System.out.println("0- CIKIS");
        System.out.println("seciminiz: ") ;
    }


}
