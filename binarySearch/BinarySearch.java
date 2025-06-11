package binarySearch;

//use binary search to find target
//with this code we already knew the array is sorted in ascending order


public class BinarySearch {
  
  public static void main(String[] args) {
  int[] arr={12,14,176,187,256,325};
  int target=187;
  int ans=binarySearch(arr,target);
  System.out.println(ans);
    
  }
  static int binarySearch(int[]arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(target<arr[mid]){
        end=mid-1;

      }
      else if(target>arr[mid]){
        start=mid+1;
      }
      else{
        return mid; // this is the same as else if (target == arr[mid])
      }
    }
    return -1;
  }
  
}
