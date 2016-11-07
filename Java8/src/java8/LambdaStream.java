package java8;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class LambdaStream
{
  public static void main(String[] args)
  {
	List<Integer> values = Arrays.asList(1,2,3,4,5,6);

	//1.External Iteration
	
	//Using normal/pre java8 method
/*	for(int i=0;i<6;i++) 
	{
	  System.out.println(values.get(i));
	}
*/
	//Using Iterator
/*	Iterator<Integer> i = values.iterator();
	while(i.hasNext())
	{
	  System.out.println(i.next());
	}
*/
	//You can use enached for loop also (for i : values0

	//2. Internal Iterations - Stream API
	//forEach was introuduced in java 1.8
	System.out.println("Using forEach");
	values.forEach((i) -> System.out.println(i));
	

	//MEthod Reference - Passing Method as parameter i.e. call by method
	System.out.println("Using Method Reference");
	values.forEach(System.out::println);

	//
	List<Integer> listValues = new ArrayList<>();
	for(int i=0; i <=100; i++)
	{
		listValues.add(i);
	}
	System.out.println("Using parallel Stream");
	listValues.parallelStream().forEach(System.out::println);
	

   }
}