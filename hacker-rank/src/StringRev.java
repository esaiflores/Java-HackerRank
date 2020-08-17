public class StringRev {

    public static String rev(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        String s= "Welcome to Edureka"; // Note that string is immutable in Java
        s= rev(s);
        System.out.println("Result after reversing a string is : "+s);
    }

}
