// find length of a string

import java.util.*;

class Length{
public static void main(String[] args){
System.out.println("Enter a String: ");
Scanner sc= new Scanner(System.in);
String str= sc.next();

char[] ch= str.toCharArray();
int c=0;
for(int i=0;i<ch.length; i++){
c++;
}
System.out.println("Length of String is: "+c);
}
}