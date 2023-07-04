package sistemeGiris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> userName = new ArrayList<>();
    List<String> email = new ArrayList<>();
    List<String> password = new ArrayList<>();

    public void register(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ad Soyad giriniz : ");
        String name = input.nextLine();
        String userName;
        System.out.println("Kullanici adi giriniz : ");
        userName = input.nextLine();
        System.out.println("");
    }

}
