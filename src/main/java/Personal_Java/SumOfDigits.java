package Personal_Java;

public class SumOfDigits {

    public static void main(String[] args) {

        String str = "A1B2C3D4";

        int sum =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //get each character
            //System.out.println(ch);

            if(Character.isDigit(ch)){
                //check if character is digit or not.
                sum+=  Integer.parseInt(""+ ch);
                //convert char to string, which converted to interger
                //value is then added to sum
            }
        }

        System.out.println(sum);
        
    }
}
