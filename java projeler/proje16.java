import java.util.Scanner;

public class proje16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi1 i girin:");
        int sayi1=scanner.nextInt();
        System.out.println("sayi2 yi girin:");
        int sayi2=scanner.nextInt();
        int toplam1=0;
        int toplam2=0;
        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0){
                toplam2=toplam2+i;
        }
    }
    if(sayi1==toplam2&&sayi2==toplam1){
        System.out.println("arkadaş sayidirlar!");
     }
     else{
        System.out.println("arkadaş sayi değildir!!");
     }
   }
 }