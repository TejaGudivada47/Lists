import java.util.ArrayList;
import java.util.List;
public class Arraylist {
public static void main(String[] args) {
	List<Integer> num = new ArrayList();
	num.add(1);
	num.add(2);
	num.add(3);
	System.out.println("List : "+num);
	int getnumber = num.get(2);
	System.out.println("num : "+getnumber);
	int removedNumber = num.remove(1);
	System.out.println("num : "+removedNumber);
	System.out.println("List : "+num);
}
}
