package practice.polymorphism;

public class Medya {
    private String dosyaAdi;

    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public String getDosyaAdi() {
        return dosyaAdi;
    }

    public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public void oynat(){
        System.out.println("Dosya oynatiliyor..");

    }

    public void durdur(){
        System.out.println("Dosya durduruluyor..");
    }

}
