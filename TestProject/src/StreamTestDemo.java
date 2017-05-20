import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamTestDemo {

	public static void main(String[] args) {
List<Integer> myList=new ArrayList<>();
myList.addAll(Arrays.asList(100,20,30));
 Optional<Integer> ss = myList.stream().reduce((a,b)->
a*b);
System.out.println(ss);
OptionalDouble ss1 = myList.stream().mapToInt(Integer::new).average();

System.out.println(ss1.toString());
int[] intArray= {10,20,30};
System.out.println(Arrays.stream(intArray).sum());

String[] myArray = { "this", "is", "a", "sentence" };
StringBuilder sb=new StringBuilder();
 Arrays.stream(myArray).forEach(value->{
	 sb.append(value.toUpperCase() +" ");
});

System.out.println(sb.toString());
	}

}
