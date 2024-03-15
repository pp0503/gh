package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class india 
{
	public static void main(String[] args) {
		
		List<String>mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set<String>gj=new HashSet<String>();
		gj.add("Surat");
		gj.add("Vadodara");
		
		Map india=new TreeMap<>();
		india.put("m",mh);
		india.put("g", gj);
		
		india.forEach((k,v)->{
			if(v instanceof Set)
			{
				Set s=(Set)v;
				System.out.println(s);
				s.forEach(City->{
					System.out.println(City);
				});
			}
			if(v instanceof List)
			{
				List s=(List)v;
				System.out.println(s);
				s.forEach(City->{
					System.out.println(City);
				});
			}
		});
	}

}
