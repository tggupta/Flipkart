package Search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Collections01 {

		
	public static void main(String[] args) {
	
		List<Integer> values=new ArrayList<>();
		Random r=new Random();
		
		for(int i=0;i<10;i++)
		{
			values.add(r.nextInt(100));
			System.out.println(values.get(i));
		}
		Collections.sort(values);
		for(int i=0;i<10;i++)
		{
			System.out.println(values.get(i));
		}	
	}
}
