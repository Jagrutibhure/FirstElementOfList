package Firstelemnt1;

import java.util.Arrays;
import java.util.List;

public class FirstElementOfList {
public static void main(String args[]) {
	List<Integer>myList = Arrays.asList(15,16,20,22,14,12,13,5,9,7,3,2);
	myList.stream().findFirst().ifPresent(System.out::println);
}
}
