package myPackage;

public class proparray {
    public static void main(String[] args) {
        int[] i={2,3,4,1,7};
        int prod=1;
        for (int j=0; j<i.length; j++){
            prod=prod*i[j];
        }
        System.out.println(prod);

    }
}
