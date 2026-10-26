import javax.print.DocFlavor.STRING;

public class stringpaidrom {
    public static void main(String[] args) {
          
        String str= "racecar";

        String  str1 ="";

        for(int i=str.length()-1;i>=0;i--){

       str1 += str.charAt(i);
     
        }
        if(str.equalsIgnoreCase(str1)){

            System.out.println("my sting is paidrom");
        }else{
            System.out.println("strimn is not paidrom");
        }
    }
}
