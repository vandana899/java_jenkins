package myPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mytry {
    public static void main(String[] args) throws IOException {
//        int i = 44;
//        int f = 89;
//        {
//            System.out.println(i == f);
//        }
//        int d = 65;
//        int g = 90;
//        {
//            System.out.println(d > g);
//        }
//        int a = 45;
//        int w = 34;
//        {
//            System.out.println(a > w);
//        }
//        int e=21; int u=66;
//        System.out.println(e!=u);
//
//
//    }
//int a;
//int j;
//        System.out.println("enter your integer");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        a=Integer.parseInt(br.readLine());
//        j=Integer.parseInt(br.readLine());
//        {
//            System.out.println(a);
//       }
//        {System.out.println(j);
//
//        }
       // int i = 34;
        //pre increment
//        {
//            {
//                System.out.println(++i);
//                System.out.println(i);
//            }
//            //post incrment
//            {  System.out.println(i++);
//            System.out.println(i);
//            }
//            //pre decrement
//            {
//            System.out.println(--i);
//            System.out.println(i);
//        }
//        //post decrement
//            {System.out.println(i--);
//            System.out.println(i);
//            }
//        }
        String str="VANDANA";
        String str1="vandana";
        String str2="   van   ";
        char ch= ' ';
        //length of string
        System.out.println(str1.length());
        //lowercase
        System.out.println(str.toLowerCase());
        //to uppercase
        System.out.println(str1.toUpperCase());
        //to remove left and right place of the string
        System.out.println(str2.trim());
        //to add the string into the declare using the concatenation operator
        System.out.println(str2+"girl");
        //to combine two strings using ch using concatention operator
        System.out.println(str+ch+str2);
        //to replace the string olr char to new char
        System.out.println(str.replace('V','v'));
        //to print the portion of the string using sub string
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(3));
        //to check two strings equal or not
        System.out.println(str.equals(str2));

    }
}