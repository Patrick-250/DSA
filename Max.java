public class Max {
  public static void main(String[] args) {
    int[]numbers={4,54,4,64,4135,5163,32};
    System.out.println(findMax(numbers));
   
}
public static int findMax(int[]numbers){
  int max_value=numbers[0];
  for(int i=0;i<numbers.length;i++){
    if(numbers[i]>max_value){
      max_value=numbers[i];
    }
  }
  return max_value;

}

}