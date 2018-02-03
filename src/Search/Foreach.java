package Search;

import java.util.List;	
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Foreach {
	
	@Test
	public void test()
	{
		List<String> list2=new ArrayList<>(Arrays.asList("apple","Samsung","Sony","Nokia"));
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		System.out.println("************************");
		for(String a:list2)
		{
			System.out.println(a);
		}
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("************Iterator************");
		Iterator itr=list2.iterator();
		while(itr.hasNext())
		{
			//System.out.println("jsfsfsd");
			System.out.println(itr.next());
			
		}
	}

}
