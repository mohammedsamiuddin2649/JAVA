import java.util.*;

public class tables {
    public static void main(String[] args) {
        System.out.println("Enter the number for the table you want");
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,mul=0;
        for(i=1;i<=10;i++){
            mul=n*i;
            System.out.println(mul);
        }
    }
    
}
