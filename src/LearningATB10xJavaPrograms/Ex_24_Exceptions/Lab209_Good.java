package Ex_24_Exceptions;

public class Lab209_Good {
     public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10 / c;
        } catch(Exception e) { //if you know exactly.. then write which exception.
            //catch (Arithmeticexception e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
