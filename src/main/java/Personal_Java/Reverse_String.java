package Personal_Java;

public class Reverse_String {

    public static void main(String[] args) {

        String str = "Hello I am Stephane";

        String revStr = "";


        for (int i = str.length()-1; i >= 0 ; i--) {

            revStr+= str.charAt(i);

        }


        System.out.println(revStr);
    }
}
