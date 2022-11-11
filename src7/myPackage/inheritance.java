package myPackage;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//class van1 {
//
//    public int cal2(int x, int y) {
//        return x-y;
//    }
//}
//class van extends van1 {
//    public int cal (int x,int y){
//        return x*y;
//    }
//}
//class vandana extends van {
//    public int cal3 (int x,int y){
//        return x+y;
//    }
//
//}
//public class inheritance {
//    public static void main(String[] args) throws IOException{
//        int x; int y;
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        x=Integer.parseInt(br.readLine());
//        y=Integer.parseInt(br.readLine());
//        vandana v=new vandana();
//        v.cal2(x,y);
//        v.cal(x,y);
//        v.cal3(x,y);
//        System.out.println( v.cal2(x,y));
//        System.out.println(v.cal(x,y));
//        System.out.println( v.cal3(x,y));
//
//    }
//}
class van3 {                              //parent class van3 is parent class
    public int cal3(int x, int y){
        return x*y;
    }
        }
class van2 extends van3 {                     //van2 is child class and van 3 is parent class
    public int cal2(int x, int y){
        return x-y;
    }
}
class van extends van2 {                      //van is child class van2 is parent class
    public int cal1(int x, int y ){
        return x+y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        van v=new van();
        v.cal1(5,6);
        System.out.println(v.cal1(5,6));

    }
}
