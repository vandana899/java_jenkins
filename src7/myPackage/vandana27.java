package myPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.IOException;

public class vandana27 {
    public static void main(String[] args) throws IOException {
int day; int ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your day");
        ch= Integer.parseInt(br.readLine());
day= Integer.parseInt(br.readLine());

switch (ch) {
    case 1:
        if (day>=30){
            System.out.println("march");
        }
        break;
    case 2:
        if (day<=17){
            System.out.println("february");
       }
        break;

}
    }
}
