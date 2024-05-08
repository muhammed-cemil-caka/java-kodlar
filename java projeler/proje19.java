public class proje19 {

     public static int çarp(int...sayilar){
     int çarpim=1;
        for(int sayi:sayilar){
            çarpim=çarpim*sayi;
             } return çarpim;
    }
    public static void main(String[] args) {
        int çarpim2=çarp(2,3,4,5,6,7,8);
        System.out.println(çarpim2);
    }
}
