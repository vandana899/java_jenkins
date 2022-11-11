package myPackage;

class vr{
    int r; int n;
    public void sum(){
        System.out.println(r+n );
    }
}
public class differentclass {
    public static void main(String[] args) {
        vr van=new vr();
        van.r=2; van.n=5;
        van.sum();
    }
}
