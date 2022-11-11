package myPackage;

public class arraylistdyn {
    public static int add(int ...numbers){    // varchar   int[] numbers={2,4,5,4,5}


        int sum=0;
        for (int j=0; j<numbers.length; j++){   // o,1,2,3,4
            sum=sum+numbers[j];
        }return sum;
    }

    public static void main(String[] args) {

        arraylistdyn cw=new arraylistdyn();
        // I want product of any 3 three numbers. 23,34,45

        System.out.println( cw.add(1,2,3,4,5,6));   // aray and array list // statuc and other one is dynamic


    }
}

