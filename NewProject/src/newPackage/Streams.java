package newPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("pavan");
		names.add("pavanYadav");
		names.add("Sruthi");
		int count=0;
		
		for (int i=0;i<names.size();i++)
		{
			String listOfNames=names.get(i);
			if(listOfNames.startsWith("p"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		Long c=names.stream().filter(s->s.startsWith("p")).count();
		System.out.println(c);
		
		long d = Stream.of("pavan","pavanYadav","sruthi").filter(s->{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		//Print the arraylist of names 
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		//print the letter which depends on last letter and conver to uppercase
		Stream.of("pavan","pavanYadav","sruthi").filter(s->s.endsWith("i"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print the names wich starts with "P" and sorted
		
		List<String> namesData=Arrays.asList("ant","aa","women" ,"zindagi");
		namesData.stream().filter(s->s.startsWith("a")).sorted()
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two different lists and sorted
		List<String> namesData1=Arrays.asList("pavan","python","selenium","project");
		Stream<String> newStream=Stream.concat(namesData.stream(), namesData1.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
		
		//finding the name should be present in the list or not
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("selenium"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
		//list is collecting to one another list using collector method
		List<String> ls = Stream.of("business","pavan","pavanYadav","sruthi")
				.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(1,9,20,4,1,3);
//		values.stream().distinct().forEach(s->System.out.println(s));
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
	
	
}
 

