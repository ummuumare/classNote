package practice.polymorphism;

public class runner {
    public static void main(String[] args) {
        Medya medya = new Medya("Ses Dosyasi.mp3");

        System.out.println(medya.getDosyaAdi());
    }
}
