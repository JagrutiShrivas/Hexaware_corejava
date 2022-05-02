
//In this Program, we first split the given string into substrings using split() method. 
The substrings are stored in an String array words. The program then reverse each word of the substring using a reverse for loop.


public class RevSent
{
   public void reverse(String str)
   {
	
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	RevSent obj = new RevSent();
	obj.reverse("Java is a platform independent language");

   }
}