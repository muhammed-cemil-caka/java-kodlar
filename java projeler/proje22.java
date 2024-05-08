import java.util.Scanner;
public class proje22 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("çarpım tablosunun satır sayısını giriniz:");
        
        int satirsayisi=scanner.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=satirsayisi;i++){
            for(int j=1;j<=10;j++){
            System.out.println(i*j+"\t");

            }
            System.out.println();
        }

        
    }
    
}
