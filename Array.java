import java.util.Arrays;

public class Array {
  static int numbers[]={1,4,5,7,8};
  static int numbers2[]={3,5,65,12};
  public static void main(String[] args) {
    //access elements by index
    System.out.println(numbers[0]);
    //check if 2 arrays are the same...contain same elements.

    Arrays.equals(numbers,numbers2); //this return a boolean
    System.out.println(Arrays.equals(numbers,numbers2));

    //string representation..
    Arrays.toString(numbers); 
    System.out.println(Arrays.toString(numbers));
    //fill elements in array

    Arrays.fill(numbers2, 100);// this fills the whole array with values 100;
    System.out.println(Arrays.toString(numbers2));
    

    
  }
  
}
