package JAVA;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Java";

        String revStr = "";

        for(int i = str.length()-1; i>=0; i--){

            revStr += str.charAt(i);
        }

        if(str.equalsIgnoreCase(revStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }


    }
}
