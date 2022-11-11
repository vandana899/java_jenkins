package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch4 {
    public static void main(String[] args) throws IOException {
//        int i,j,s;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("enter your alphabet");
//        s= Integer.parseInt(br.readLine());
//        i= Integer.parseInt(br.readLine());
//        j= Integer.parseInt(br.readLine());
//        switch (s) {
//            case 1:
//                if (i < j) {
//                    // addition
//                    System.out.println(i + j);
//                }
//                break;
//            case 2:
//            if (i>=j)
//                //subtraction
//            {System.out.println(i-j);}
//            break;
//            default:
//                System.out.println("nothing");
      //  }
        int book;
        System.out.println("enter your book");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        book= Integer.parseInt(br.readLine());
        switch (book){
            case 1:
                System.out.println("java language");
                break;
            case 2:
               System.out.println("ggtm");
               break;
            case 3:
               System.out.println("gulliver");
               break;
            default:
            System.out.println("no book");
        }
//System.out.println("no book");

    }
}

