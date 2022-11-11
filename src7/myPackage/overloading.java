package myPackage;

public class overloading {
    public static void cal1(){
        System.out.println("van");
    }
    public static void cal1(int v){
        System.out.println(v*4);
    }
    public static void cal1(String str){
        System.out.println(str.length());}

    public static void main(String[] args) {
        overloading m=new overloading();
        m.cal1();
        m.cal1( 6);
        m.cal1("baba");
    }
}
