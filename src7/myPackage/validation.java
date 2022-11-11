package myPackage;

class ed{    // parent
    public int cal(int x, int y){
        return x+y;
    }
}

class ed1 extends ed{      //child
    public int cal_adv(int x, int y){
        return x-y;
    }
}
public class validation {
    public static void main(String[] args) {
        ed1 a=new ed1();   // object of child
        System.out.println(a.cal(2,5));
    }
}