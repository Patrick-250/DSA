public class LinearSearchAlgorithm {
  public static void main(String[] args) {
      int[]numbers={18,12,9,14,77,50};
  //question is to find the index of 14  in array 
  int target=50;
  
  System.out.println(linearSearch(numbers, target));
  
}
static int linearSearch(int[]numbers,int target){
  if(numbers.length==0){
      return -1;
    }
  for(int i=0;i<numbers.length;i++){
    
    if( target==numbers[i]){
      return i;
    }

  }

  
  return -1;

}

}
