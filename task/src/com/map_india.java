package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map_india 
{
	public static void main(String[] args) {
	Map<String, String>mh=new HashMap();
	mh.put("pune", "pune");
	mh.put("nasik", "nasik");
	
	Map<String, String>gj=new HashMap();
	gj.put("surat", "surat");
	gj.put("ank", "ank");
	
	Map<String, Map<String, String>>india=new HashMap<String, Map<String,String>>();
	india.put("gujrat", gj);
	india.put("maharashtra", mh);
	
	System.out.println(india);

	india.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v);
		
		v.forEach((city1,city2)->{
			System.out.println(city1);
		//	System.out.println(city2);
		});
	});
	/*
	Set<String>key=india.keySet();
	Iterator<String>itr=key.iterator();
	while(itr.hasNext())
	{
		String s=itr.next();
		Map<String, String>st=india.get(s);
		Set<String>s1=st.keySet();
		
		Iterator<String>itr1=s1.iterator();
		while(itr1.hasNext())
		{
			String s2=itr1.next();
			String cy=st.get(s2);
			System.out.println(cy);
		}
		
	}
	*/
	

	}
	
}
