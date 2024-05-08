public class proje8 {
    public static void main(String[] args) {
        double[] mylist = new double [4];
        
       mylist [0] = 1.2;
       mylist [1] = 1.3;
       mylist [2] = 4.3;
       mylist [3] = 5.6;
double total=0;
double max=mylist[0];
for(double number : mylist){
    if(max<number){
        max=number;
    }
    total=total+number;
    System.out.println(number);
}System.out.println(total);
System.out.println(max);
    }
}
