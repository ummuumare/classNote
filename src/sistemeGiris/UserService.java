package sistemeGiris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> userNames = new ArrayList<>();
    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    public  static Scanner input = new Scanner(System.in);
    public void register(){

        System.out.println("Ad Soyad giriniz : ");
        String name = input.nextLine();
        String userName;
        boolean existsUsername;
        do {
            System.out.println("Kullanici adi giriniz : ");
            userName = input.nextLine().trim();
            existsUsername = this.userNames.contains(userName);
            if (existsUsername){
                System.out.println("bu username kullanilmis, farkli bir username deneyiniz");
            }
        }while (existsUsername);

        String email;
        boolean existsEmail;
        boolean isValid;
        do {
            System.out.println("Email giriniz: ");
            email=input.nextLine().trim();
            isValid=emailValidation(email);
            existsEmail = this.emails.contains(email);
            if (existsEmail){
                System.out.println("Bu email kullanilmis, farkli bir email deneyiniz..");
               isValid=false;

            }
        }while (!isValid);

        String password;
        boolean isValidPass;
        do {
            System.out.println("Sifrenizi giriniz");
            password  = input.nextLine().trim();
            isValidPass = validatePassword(password);

        }while (!isValidPass);
        User user = new User(name,email,userName,password);
        this.emails.add(user.getEmail());
        this.passwords.add(user.getPassword());
        this.userNames.add(user.getAccountId());
        System.out.println("Tebrikler isleminiz basariyla gerceklestir");
        System.out.println("Kullanici adi veya email ile sisteme giris yapabilirsiniz");

    }

    public void login(){
        System.out.println("Kullanici adi veya email olarak giriniz");
       String userNameOrEmail = input.nextLine();
         boolean isUserName = this.userNames.contains(userNameOrEmail);
         boolean isEmail = this.emails.contains(userNameOrEmail);
         if (isUserName || isEmail){
             boolean isWrong =true;
             while (isWrong){
                 System.out.println("Sifre giriniz:  ");
                 String password = input.nextLine();
                 int indx ;
                 if (isUserName){
                     indx = this.userNames.indexOf(userNameOrEmail);
                 }else {
                     indx = this.emails.indexOf(userNameOrEmail);
                 }
                 if (this.passwords.get(indx).equals(password)){
                     System.out.println("Welcome");
                 }else {
                     System.out.println("Sifreniz yanlis, tekrar deneyiniz");
                 }
             }




         }else {
             System.out.println("Sisteme kayitli kullanici  bulunamadi");
             System.out.println("Uyeyseniz bilgilerinizi kontrol ediniz, veya uye olunuz");
         }

    }

    public boolean emailValidation(String email){
      boolean isValid;
      boolean spaces =  email.contains(" ");
      boolean isContainAt = email.contains("@");
      if (spaces){
          System.out.println("Email bosluk iceremez..");
          isValid=false;
      }else if (!isContainAt){
          System.out.println("Email '@' sembolunu icermelidir.. ");
          isValid=false;
      }else {
          String ilk = email.split("@")[0];
          String ikinci = email.split("@")[1];
          int notValid = ilk.replaceAll("[a-zA-Z0-9-._]","").length();
          boolean checkStart = notValid ==0;
          boolean checkEnd = ikinci.equals("gmail.com") ||
                             ikinci.equals("hotmail.com") ||
                             ikinci.equals("yahoo.com");

if (!checkStart){
    System.out.println("Email kullanici adi buyuk harf ,kucuk harf, rakam, -,_,. disinda karakter iceremez");
}else if (!checkEnd){
    System.out.println("email, gmail.com, yahoo.com, veya hotmail.com ile bitmelidir");
}
        isValid=checkStart && checkEnd;
      }
      if (!isValid){
          System.out.println("Gecersiz email, tekrar deneyiniz ");
      }
        return isValid;
    }
    public boolean validatePassword(String password){
        boolean isValid;
        String uppeCase = password.replaceAll("[^A-Z]", "");
        String lowerCase = password.replaceAll("[^a-z]", "");
        String digit = password.replaceAll("[\\D]", "");
        String symbol = password.replaceAll("[\\P{Punct}]", "");
        boolean space = password.contains(" ");
        boolean length6 = password.length()>=6;
        boolean existsUpper = uppeCase.length()>0;
        boolean existLower = lowerCase.length()>0;
        boolean existDigit = digit.length()>0;
        boolean existsSymbol = symbol.length()>0;

        if (space){
            System.out.println("sifre bosluk icermez!!");
        } else if (!length6) {
            System.out.println("sifre en az 6 karakter icermelidir!!");
        } else if (!existLower) {
            System.out.println("sifre en az 1 kucuk harf icermelidir!");
        } else if (!existDigit) {
            System.out.println("sifre en az 1 rakam icermelidir");
        } else if (!existsUpper) {
            System.out.println("Sifre en az 1 buyuk harf icermelidir");
        } else if (!existsSymbol) {
            System.out.println("Sifre en az bir tane sembol icermelidir");
        }


    isValid = !space && length6 && existsUpper && existDigit && existsSymbol && existLower;
        if (!isValid){
            System.out.println("Gecersiz islem, tekrar deneyiniz!!");
        }
        return isValid;
}


}
