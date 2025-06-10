import java.util.Arrays;
import java.util.Scanner;

public class arrays {
  public static void main(String[] args) {
    //int[] arr=new int[5]; // this create array object in heap and all elements are zeros. null for strings elements
    //System.out.println(arr[0]);
   int[]numbers={2,4,52,6,32};
   for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);

   }

   Arrays.toString(numbers); //string rep
   System.out.println( Arrays.toString(numbers));


  }
}
