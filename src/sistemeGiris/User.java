package sistemeGiris;

public class PojoClass {
   private  String name;
   private String surname;
   private String accountId;
   private String email;
   private String password;

    public PojoClass(String name, String surname, String accountId, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.accountId = accountId;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }















}
