import java.util.Arrays;

public class SearchInString {
  public static void main(String[] args) {
    String name="Rumanzi";
    //the question is to find if character u is foound in the name and also at what index.
    char target='u';
    System.out.println(search(name,target));
    System.out.println(findIndex(name, target));
    

  }
  public static boolean search(String name,char target){
    
    for(int i=0;i<name.length();i++){
      if(target==name.charAt(i)){
        return true;
      }
     
    }
    return false;

  }
  public static int findIndex(String name,char target){
    for(int i=0;i<name.length();i++){
      if(name.charAt(i)==target){
        return i;
      }
      
    }
    return -1;
  }
  
}
