/*import java.util.Scanner;
 
public class RevWord{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter a sentence: ");
    String str =sc.next();
    str += " ";

    String rev= "";

    while(str.indexOf(" ") != -1){
      int ind = str.indexOf(" ");
      String s1= str.substring(0, ind);
      rev= s1+ " "+ rev;
      str = str.substring(ind+1);
    }

    System.out.println("Reversed sentence is: "+rev);
 
  }
}*/













import java.util.Scanner;
 
public class RevWord{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String str = sc.next();
    str += " ";
    String reversed = "";
    while(str.indexOf(" ") != -1){
  
      int idx = str.indexOf(" ");
      String word = str.substring(0, idx);

      reversed = word + " "+ reversed;

      str = str.substring(idx+1);
    }
   
  
    System.out.println("Reversed sentence is: "+reversed);
    //System.out.println();
  }
}