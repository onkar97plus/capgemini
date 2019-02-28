package com.cg.mynew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Maphash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map= new HashMap<>();
		
		map.put("Harvey",1);
		map.put("Jessica",2);
		map.put("Louis",3);
		
		/*Only keys to be shown from the hashMap into arraylist using iterator*/
		ArrayList<String> keys=new ArrayList<String>();
		Iterator<String> itr=map.keySet().iterator();
		
		while(itr.hasNext()){
			keys.add(itr.next());
		}
		System.out.println(keys);
		
		
		/*Only values to be shown from the hashMap into arraylist using iterator*/
		ArrayList<Integer> value=new ArrayList<Integer>();
		Iterator<Integer> itr1=map.values().iterator();
		
		while(itr1.hasNext()){
			value.add(itr1.next());
		}
		System.out.println(value);
		
		/*Only keys to be shown from the hashMap into arraylist*/
		List<String> keys1=new ArrayList<>(map.keySet());
		System.out.println(keys1);
		
		/*Only values to be shown from the hashMap into arraylist*/
		List<Integer> value1=new ArrayList<>(map.values());
		System.out.println(value1);

	}

}
