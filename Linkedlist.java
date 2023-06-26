import java.util.LinkedList;
import java.util.List;
public class Linkedlist {
public static void main(String[] args) {
	List<Integer> numbers = new LinkedList();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	System.out.println("List : "+numbers);
	int num = numbers.get(2);
	System.out.println("num is  : "+num);
	int index = numbers.indexOf(2);
	System.out.println("num is : "+index);
	int removed = numbers.remove(3);
	System.out.println(" Removed num is : "+removed);
}
}
