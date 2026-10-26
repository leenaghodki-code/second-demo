public class arrysreves{


public static void main(String[] args) {

    int arr []= {12,23,50,56,70,78,90,56,34,36,78,30};
             
    arrysreves.revers(arr);
      for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
      }
      }
      public static void revers(int arr []){
      int first = 0;
      int last= arr.length-1;
      while (first<last){
      int temp;
         temp = arr[last];
         arr[last] = arr[first];
         arr[first]= temp;
       first++;
       last--;

        
      }
        
      }
    }
      



