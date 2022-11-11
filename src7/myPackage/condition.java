package myPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class condition {
    public static void main(String[] args) {
        int age=70;
        if (age>=56){       // >=, <=
            System.out.println("go for gym");
        }
        else if (age<=70){
            System.out.println("cant go for gym");
        }
        else if (age==70){
                System.out.println("anyone can go");
        }
        else {
            System.out.println("default");
        }
    }
}
