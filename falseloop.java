public class falseloop {
    
    public static void main(String[] args) {
        int i=12;
        while(i<11){
        System.out.println("hi sami");
        }
        do {
        System.out.println("hi sami");
        }while(i<11);
    }
}
