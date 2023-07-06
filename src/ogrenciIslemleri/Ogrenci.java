package ogrenciIslemleri;

public class Ogrenci {
    private String isim;
    private String cinsiyet;
    private  double kilo;
    private  double boy;

    public Ogrenci(String isim, String cinsiyet, double kilo, double boy) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.kilo = kilo;
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                " Isim = " + isim +
                " Cinsiyet = " + cinsiyet +
                " Kilo = " + kilo +
                " Boy = " + boy ;
    }
}
