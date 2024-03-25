package Personal_Java;

public class remove_Duplicate {

    public static void main(String[] args) {

        String str = "!!@#@@";

        String result = "";

         for ( int i = 0; i < str.length(); i++){

             String  ch= ""+ str.charAt(i);

             if(result.contains(ch)) {
               continue;
             }

             result += ch;
         }

        System.out.println(result);
    }
}
