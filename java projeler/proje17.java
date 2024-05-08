public class proje17 {
    public static void main(String[] args) {
        int[]  sayilar=new int[]{1,2,3,4,5,6,7,8};
        int aranacak=5;
        for(int sayi:sayilar){
            if(sayi%aranacak==0){  
                
               System.out.println("sayi mevcuttur"); 
            }
             else {
                    System.out.println("sayi mevcut değildir");
                
                }
              
        }
        
    

    
    }
    
}
