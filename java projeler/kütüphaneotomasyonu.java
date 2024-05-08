import java.util.*;

// Kitap sınıfı kitapların özelliklerini tutar
class Kitap {
    String ad;
    String yazar;
    int sayfaSayisi;
    boolean oduncAlindiMi;

    Kitap(String ad, String yazar, int sayfaSayisi) {
        this.ad = ad;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.oduncAlindiMi = false;
    }

    void kitabiOduncAl() {
        this.oduncAlindiMi = true;
    }

    void kitabiGeriVer() {
        this.oduncAlindiMi = false;
    }

    @Override
    public String toString() {
        return "Kitap adı: " + ad + ", Yazar: " + yazar + ", Sayfa Sayısı: " + sayfaSayisi + ", Ödünç Alındı mı? " + (oduncAlindiMi ? "Evet" : "Hayır");
    }
}

// Katalog sınıfı, kitapları depolamak ve yönetmek için kullanılır
class Katalog {
    List<Kitap> kitapListesi = new ArrayList<>();

    void kitapEkle(Kitap kitap) {
        kitapListesi.add(kitap);
    }

    void kitapSil(Kitap kitap) {
        kitapListesi.remove(kitap);
    }

    void kitaplariListele() {
        for (Kitap kitap : kitapListesi) {
            System.out.println(kitap);
        }
    }
}

// Ana uygulama sınıfı
public class kütüphaneotomasyonu {

    public static void main(String[] args) {
        // Kullanıcı adı ve parola
        String kullaniciAdi = "admin";
        String parola = "123";

        // Kullanıcı girişi için Scanner nesnesi
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adı ve parolayı al
        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAdi = scanner.nextLine();

        System.out.print("Parola: ");
        String girilenParola = scanner.nextLine();

        // Kullanıcı adı ve parolayı kontrol et
        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenParola.equals(parola)) {
            System.out.println("Giriş başarılı!");

            // Katalog oluştur ve birkaç kitap ekle
            Katalog katalog = new Katalog();
            katalog.kitapEkle(new Kitap("Java Başlangıç Kitabı", "Ali Can", 300));
            katalog.kitapEkle(new Kitap("Python Programlama", "Ayşe Yılmaz", 250));
            katalog.kitapEkle(new Kitap("Algoritma ve Veri Yapıları", "Mehmet Yıldırım", 400));

            // Kullanıcıya mevcut kitapları göster
            System.out.println("Kütüphanedeki Kitaplar:");
            katalog.kitaplariListele();
        } else {
            System.out.println("Giriş başarısız! Kullanıcı adı veya parola yanlış.");
        }

        // Scanner kapat
        scanner.close();
    }
}
