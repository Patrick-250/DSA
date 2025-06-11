public class digits {
  public static void main(String[] args) {

    //question is to find how many numbers in the array contains even number of digits.
    int []arr={12,4,56,351,64,32};
System.out.println(evenfinder(arr));
    
  }
  static int evenfinder(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int digits = String.valueOf(arr[i]).length();
      if (digits % 2 == 0) {
        count++;
      }
    }
    return count;
  }
  
}
