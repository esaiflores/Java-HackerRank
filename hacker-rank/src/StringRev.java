public class StringRev {

    public static void main(String[] args){

    }

    public static String reverseString(String inputString) {
        char[] inputStringArray = inputString.toCharArray();
        String reverseString = "hello";
        for (int i = inputStringArray.length - 1; i >= 0; i--) {
            reverseString += inputStringArray[i];
        }
        return reverseString;
    }

}
