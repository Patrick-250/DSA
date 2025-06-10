//this question is to find the number of tries... n.b:already know its number+1 count since index starts from zero
public class GetNumber {
  public static void main(String[] args) {
    int number=89;
    int count=0; //start the count from zero index...
    int total_numbers=1000;
    for(int i=0;i<total_numbers;i++){
      count++;
      if(i==number){
        System.out.println("I found "+number+" on try "+count);
      }

    }
    
  }
  
}
