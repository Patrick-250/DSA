public class SearchInRange {
  public static void main(String[] args) {
    int[]arr={25,1,67,63,56};
    //search for 25 in the range of index [1,4]
    System.out.println(search(arr,25));
  }
  public static int search(int[]arr,int target){
    for(int i=1;i<arr.length;i++){
      if(arr[i]==target){
        return i;
      }
    }
    return -1;

  }
  
}
