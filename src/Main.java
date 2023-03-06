import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] createArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the size of your array: ");
        int n = input.nextInt();
        int[] newArray = new int[n];
        return newArray;
    }
    static void smallToLarge(int[] arr ){
        int temp =0 ;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if( (i!=j) && arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        int[] myArr = createArray();
        int counter = myArr.length;
        System.out.println("Size of your array is = "+myArr.length);
        for(int i = 0 ; i<counter;i++){
            Scanner element = new Scanner(System.in);
            System.out.print("Please enter the "+(i+1)+". element:");
            int in = element.nextInt();
            myArr[i] = in;
        }
        smallToLarge(myArr);
    }
}
