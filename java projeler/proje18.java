public class proje18 {

     public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }return toplam;
    }
     public static void main(String[] args) {
              int toplam2=topla(2,3,4,5,6,7,8,9);   
        System.out.println(toplam2);
    }
   
}
