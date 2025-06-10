public class Calculate{
  public static void main(String[] args) {
    long startTime=System.currentTimeMillis();
    for(int i=1;i<5;i++){
      System.out.println(i);
    }
    long endTime=System.currentTimeMillis();
    long timeTaken=endTime-startTime;
    System.out.println("it took "+timeTaken+" millisecs for this program to run");
    
  }
}