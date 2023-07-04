package practice.oop_project;

public abstract class Hayvan {

     private String ad;
     private int yas;
     private String tur;

     public abstract void yemekYer();

     public abstract void sesCikarir();

    public Hayvan(String ad, int yas, String tur) {
        this.ad = ad;
        this.yas = yas;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return " Hayvan " + " Ad :" + ad  + " Yas :" + yas + " Tur :" + tur;
    }
}
