import java.util.*;

// i will write the logic in comments
public class ShuffleArray {

	public static void main(String[] args) {

		        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};// declare array withh 7 elements 1-7.
		        
		        List<Integer> list = Arrays.asList(arr); // declare a list using collection framework
		        // pass the array into list using asList method.
		        Collections.shuffle(list);  //shuffle method is used for shuffling the elements in list
		        
		        System.out.println(Arrays.toString(list.toArray())); 
		        // to string method which is declared in object class is called to print the Array object as string 
		    


	}

}
