public class searchforelemenetin2Darray {
  public static void main(String[] args) {
    //find the element example 78 in the array and return its index.
    int [][]twoDimArr={
      {2,4,46,2447,},
      {235,32,4,3,35,13},
      {3,346,78}


    };
  }
  static int findTarget(int[][]twoDimArr,int target){
    for(int row=0;row<twoDimArr.length;row++){
      for(int col=0;col<twoDimArr[row].length;col++){
        if(twoDimArr[row][col]==target){
          return 

        }
      }

    }
    
  }
}
