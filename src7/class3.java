public class class3 {
    public static void main(String[] args) {
        String str="Thiruvananthapuram";
        String str1="vandana";
        String str2="    van   ";
        char ch=' ';
        int i=2;
        //to find out the length  of the str
        System.out.println(str.length());
        //to remove the left and right space of the characters in the  str2
        System.out.println(str2.trim());
        //to add string into the declare string using concatenation operator
        System.out.println(str + "city");
        //to combine two string using concatenation operator
        System.out.println(str+ch+str1);
        //to replace the string of old characters into new characters
        System.out.println(str2.replace('v','c'));
        //to print portion of the string use substring
        System.out.println(str.substring(7,5));
        System.out.println(str.substring(7));
        //to print the position of the character
        System.out.println(str.charAt(9));
        //to check two strings equal or not
        System.out.println(str.equals(str1));

    }
}

