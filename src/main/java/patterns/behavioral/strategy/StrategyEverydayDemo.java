package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
	
	 /*
    strategy patterns are good for eleminating conditional statements in the application
    also encapsulates the algorithm options in individual classes that eliminates the conditional statements in the main application
    can also be used when its dificult to add new strategies
    somewhat similar to state

    can be implemented with an interface but normally base class needs to be abstract
    concrete classes are implemented per strategy
    this can help remove if/else conditions
    are normally independent

	pitfalls for a strategy are
	the client must be aware of the strategies and have to be chosen
	can have increased number of classes in an application

    Examples:
    java.util.Comparator
     */

	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
	public static void main(String args[]) {
		Person bryan = new Person("Bryan", "801-555-1212", 39);
		Person mark = new Person("Mark", "801-444-1234", 41);
		Person chris = new Person("Chris", "801-222-5151", 38);
		
		List<Person> people = new ArrayList<Person>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);
		
		System.out.println("Not sorted");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}
				
				if(o1.getAge() < o2.getAge()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		System.out.println("\nSorted by age");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("\nSorted by name");
		printContents(people);
		
	}
}
