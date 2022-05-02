//package practice;
import java.util.*;

// find smallest and largest in array

class Second{
static int getSec(int[] arr, int n){
int t;
for(int i=0; i<n; i++){
for(int j=i+1; j<n; j++){
if(arr[i]>arr[j]){

t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
return arr[n-2];
}
}


class Number{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in an array: ");
int sm, lg;
int n=sc.nextInt();
int arr[]=new int[n]; 
System.out.print("Enter the element: ");
for(int i=0; i<n; i++){

   arr[i]=sc.nextInt();
   }
   sm=arr[0];
   lg=arr[0];
   for(int i=0; i<n; i++){
     if(arr[i]<sm){
       sm=arr[i];
     }
     
     if(arr[i]>lg){
       lg=arr[i]; 
     }
   }
   System.out.println("The smallest value is: "+sm);
   System.out.println("The largest value is: "+lg);
   System.out.println("The second largest value is: "+Second.getSec(arr, n));
  
}
}