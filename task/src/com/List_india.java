package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_india 
{
	public static void main(String[] args) {
		
		List<String>mh=new ArrayList<String>();
		mh.add("pune");
		mh.add("mumbai");
		
		List<String>gj=new ArrayList<String>();
		gj.add("surat");
		gj.add("bharuch");
		
		List<List<String>>india=new ArrayList<List<String>>();
		india.add(mh);
		india.add(gj);
		
		System.out.println(india);
		
	Iterator<List<String>>itr=india.iterator();
	while(itr.hasNext())
	{
		List<String> st=itr.next();
		System.out.println(st);
		
		Iterator<String>itr1=st.iterator();
		while(itr1.hasNext())
		{
			String cy=itr1.next();
			System.out.println(cy);
			}
	}
	}
}
