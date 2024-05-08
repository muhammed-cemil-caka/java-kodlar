public class proje13 {
    public static void main(String[] args) {
        
    int sayi=54;
    if(sayi==2){
        System.out.println("sayi asaldir");
    }
    if(sayi==1){
        System.out.println("sayi asal değildir");
    }
    
    for(int j=2;j<sayi;j++){
        if(sayi%j==0){
            System.out.println("sayi asal değildir");
            break;
        }
          else{
            System.out.println("sayi asaldir");
            break;
        } 
    }
 
          


    }
}
