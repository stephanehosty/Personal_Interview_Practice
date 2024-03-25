package Personal_Java;

public class unique_Character {

    public static void main(String[] args) {


        String str = "aaaabbbccd";

        String unique = "";

        for(int i = 0; i < str.length(); i++)
        {
           char ch =  str.charAt(i);

           if(str.indexOf(ch) == str.lastIndexOf(ch)){

               unique += ch;
           }

        }

        System.out.println(unique);
    }
}
