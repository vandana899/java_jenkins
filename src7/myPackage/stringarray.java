package myPackage;

public class stringarray {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "van";
        str[1] = "lan";
        str[2] = "man";
        str[3] = "can";
        str[4] = "ban";
        System.out.println(str.length);
        for (int j = 0; j < str.length; j++) {
            System.out.println(str[j]);
        }
    }
}
