
public class proje10 {
    public static void main(String[] args) {
    
        int[] dizi = {2,4,6,8,0};
        System.out.println("dizi:"); 

        for (int eleman:dizi){
            System.out.println(eleman+ "");
        }
        System.out.println("-----------------");
        int toplam=0;
        for (int eleman:dizi){
            toplam+=eleman;
           } System.out.println(toplam);

          System.out.println("-----------------");
          int top=0;
          int ort=0;
          for(int eleman:dizi){
           top+=eleman;
            ort=top/5;
          }
           System.out.println(ort);
       }
    
}
 