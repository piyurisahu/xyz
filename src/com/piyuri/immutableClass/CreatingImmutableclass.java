package com.piyuri.immutableClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class  CreatingImmutableclass {
	private final String name;
	private final int id;
	private final HashMap<String, String> testmap;
	
	

	public String getName() {
		return name;
	}



	public int getId() {
		return id;
	}



	public HashMap<String, String> getTestmap() {
		return (HashMap<String, String>) testmap.clone();
	}



	public CreatingImmutableclass(String name, int id, HashMap<String, String> testmap) {
		super();
		this.name = name;
		this.id = id;
		HashMap<String, String> copy=new HashMap<>();
		
		Iterator itr=testmap.keySet().iterator();
		String key;
		while(itr.hasNext())
		{
			key=(String) itr.next();
			copy.put(key, testmap.get(key));
			
		}
		this.testmap = copy;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		String name="origna reeeeel";
		System.out.println("method call");
		HashMap<String, String> hm=new HashMap<>();
		hm.put("1", "first");
		hm.put("2", "second");
		CreatingImmutableclass test=new CreatingImmutableclass(name, i, hm);
		System.out.println(test.getId());
		System.out.println(test.getName());
		System.out.println(test.getTestmap());
		
		System.out.println("After value is modified/n");
		i=11;
		System.out.println(test.getId());
		name="priya";
		System.out.println(test.getName());
		hm.put("3", "thrid");
		System.out.println(test.getTestmap());
		
		
	}

}
