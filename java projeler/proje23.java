import java.util.Scanner;

public class proje23 {
    public static void main(String[] args) {
        final String dogruSifre = "1735";
        int kalanHak = 3;
        boolean hesapBloke = false;

        Scanner scanner = new Scanner(System.in);

        while (kalanHak > 0 && !hesapBloke) 
        {
         System.out.print("LÜTFEN ŞİFRENİZİ GİRİNİZ: ");
         System.out.println();
         String girilenSifre = scanner.nextLine();

            if (girilenSifre.equals(dogruSifre)) 
            {
                System.out.println("ŞİFRE DOĞRU");
                System.out.println();
                atmIslemleri();
                break;
            } 
            else 
            {
                kalanHak--;

                if (kalanHak == 0) {
                    System.out.println("HESABINIZ BLOKE OLDU LÜTFEN BANKAYLA İLETİŞİME GEÇİNİZ.");
                    hesapBloke = true;
                } else {
                    System.out.println("ŞİFRE YANLIŞ KALAN HAKKINIZ: " + kalanHak);
                }
            }
        }

        scanner.close();
    }

    private static void atmIslemleri() {
        Scanner scanner = new Scanner(System.in);
        int secim;
        int bakiye=2000;

            System.out.println("HOŞGELDİNİZ");
            System.out.println();
            System.out.println("1. PARA ÇEKME");
            System.out.println("2. HAVALE İŞLEMLERİ");
            System.out.println("3. PARA YATIRMA");
            System.out.println("4. BAKİYE SORGULAMA");
            System.out.println("5. ÇIKIŞ");
            System.out.println();
            System.out.print("İŞLEM SEÇİNİZ: ");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                     int tutar;
                     int kalan;
                    System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ:"); 
                    tutar=scanner.nextInt();
                    kalan=bakiye-tutar;
                    break;

                case 2:
                    int iban;
                    int tutar2;
                    int kalan2;
                    System.out.println("LÜTFEN IBAN NUMARASINI GİRİNİZ:");
                    iban=scanner.nextInt();
                    System.out.println("GÖNDERMEK İSTEDİĞİNİZ TUTARI GİRİNİZ:");
                    tutar2=scanner.nextInt();
                    if(tutar2>bakiye)
                    {
                      System.out.println("YETERSİZ BAKİYE!!");
                    }
                    else
                    {
                        kalan2=bakiye-tutar2;
                        System.out.println("KALAN BAKİYE:"+kalan2);
                    } 
                    break;

                case 3:
                    int tutar3;
                    int toplam;
                    System.out.println("YATIRACAĞINIZ TUTARI GİRİNİZ:");     
                    tutar3=scanner.nextInt();
                    toplam=tutar3+bakiye;
                    System.out.println("YENİ BAKİYENİZ:"+toplam);
                    break;

                case 4:
                    System.out.println("BAKİYENİZ:"+bakiye);
                    break;

                case 5:
                    System.out.println("ATM'MİZİ KULLANDIĞINIZ İÇİN TEŞEKKÜRLER İYİ GÜNLER DİLERİZ.:)");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
          }
        }
