class EvOdd{
public static void main(String[] args){
int[] arr={54,72,-9,65,12,0,-2,-5,0,67,-1,23,70,65,82,56,-10,-43,-31,-9};
for(int i=0; i<arr.length; i++){

//even
if(arr[i]>0 && arr[i]%2==0){
System.out.println(arr[i]);
}

//odd
else if(arr[i]>0 && arr[i]%2!=0){
System.out.println(arr[i]);
}

//positive
else if(arr[i]>0){
System.out.println(arr[i]);
}

//negative
else if(arr[i]<0){
System.out.println(arr[i]);
}

//zero
else if(arr[i]==0){
System.out.println(arr[i]);
}
}
}
}