public class missnum {
public static void main(String[] args) {

     int arr[] = {1,2,3,5};
    
    int   missnumber= miss(arr,
         5) ;
         System.out.println(missnumber);
}
  
 public static int  miss(int arr[],int n){

 int   total= n*(n+1)/2;
int sum=0;
    for(int i=0;i<arr.length;i++){

     sum= sum+arr[i];

    }
     return   total-sum;
 }
}
