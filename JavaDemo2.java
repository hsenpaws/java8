
//sum of array
import java.util.List;
import java.util.Arrays;

class JavaDemo2 {

 public static void main(String args[]) 
 {
   List<Integer> values = Arrays.asList(12,20,25,35,46,75);
   
   System.out.println(values.stream().filter(i -> i%5==0).reduce(0,(c,e) -> c+e)); 

   String str = "string";

   int[] data = {2, 3, 4 };
   System.out.println(Arrays.stream(data).reduce((i,j) -> (i*j)));

 }
 


}
