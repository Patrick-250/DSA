public class findMinMax {
  public static void main(String[] args) {

    //the question is to print min and max on 2 separate lines.
    int[]arr={13,35,76,46,368,68,245,24,9};
    System.out.println(findMax(arr));
    System.out.println(findMin(arr));
  }
  static int findMax(int[]arr){
    int maxNumber=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>maxNumber){
        maxNumber=arr[i];
      }

    }
    return maxNumber;
  }
   static int findMin(int[]arr){
    int minNumber=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<minNumber){
        minNumber=arr[i];
      }

    }
    return minNumber;
  }
  
}
