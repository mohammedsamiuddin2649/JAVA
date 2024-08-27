import java.util.*;

public class greater {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter b number");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("It is Equal");
        }
        else if(a>b){
                System.out.println("a is greater");}
        else {
                System.out.println("a is lesser");
            }
            
        
    }
    
}
