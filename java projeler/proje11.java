public class proje11 {
    public static void main(String[] args) {
        
     String[][] arabalar = new String[2][2];
        
     arabalar[0][0]="MERCEDES";
     arabalar[0][1]="AUDİ";
     arabalar[1][0]="BMW";
     arabalar[1][1]="OPEL";

     for(int i=0;i<=1;i++){
       for(int j=0;j<=1;j++){
        System.out.println(arabalar[i][j]);
        System.out.println("----------");
       }
     }
    }
}
