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
        Arrays.sort(myArr);
        System.out.println("Sorted from smallest to largest version :");
        for (int num : myArr){
            System.out.print(num+ " ");
        }
    }
}
