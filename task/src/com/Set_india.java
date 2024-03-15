package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_india 
{
	public static void main(String[] args) 
	{
		Set<String> mh=new HashSet<String>();
		mh.add("pune");
		mh.add("mumbai");
		
		
		Set<String> gj=new HashSet<String>();
		gj.add("surat");
		gj.add("vapi");
		
		Set<Set<String>> india=new HashSet<Set<String>>();
		india.add(mh);
		india.add(gj);
		
		System.out.println(india);
		
		Iterator<Set<String>>itr=india.iterator();
		while(itr.hasNext())
		{
			Set<String>sta=itr.next();
			System.out.println(sta);
			
		
		Iterator<String>itr1=sta.iterator();
		while(itr1.hasNext())
		{
			String cty=itr1.next();
			System.out.println(cty);
	
		}
		}
	}
}

