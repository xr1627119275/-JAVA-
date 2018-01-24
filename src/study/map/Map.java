package study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	private static final int String = 0;

	public static void main(String[] args) {
		HashMap<String, String> javase = new HashMap<String, String>();
		HashMap<String, String> javaee = new HashMap<String, String>();

		javase.put("001", "锟斤拷锟斤拷");
		javase.put("002", "锟斤拷锟斤拷");
		javaee.put("001", "锟斤拷锟斤拷");
		javaee.put("002", "锟斤拷锟斤拷");
		
		HashMap<String, HashMap<String,String>> map = new HashMap<String, HashMap<String,String>>();
		map.put("锟斤拷锟斤拷锟斤拷", javase);
		map.put("锟斤拷业锟斤拷", javaee);
//		keySet(map);
		MapEntry(map);
	}

	private static void MapEntry(HashMap<String, HashMap<String, String>> map) {
		// TODO Auto-generated method stub
		Set<java.util.Map.Entry<String, HashMap<String, String>>> set = map.entrySet(); 
		Iterator<Entry<String, HashMap<String, String>>> it = set.iterator();
		while (it.hasNext()) {
			Set<java.util.Map.Entry<String,String>> set2=it.next().getValue().entrySet();
			Iterator<java.util.Map.Entry<String, String>> it2=set2.iterator();
			while(it2.hasNext()) {
				Entry<String, String> entry= it2.next();
				System.out.println(entry.getKey()+"=="+entry.getValue());
			}
			
		}
	}

	private static void keySet(HashMap<String, HashMap<String,String>> map) {
		// TODO Auto-generated method stub
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String ClassName = it.next();
			HashMap<String,String> classmap =  map.get(ClassName);
			Set<String> classset = classmap.keySet();
			Iterator<String> classit = classset.iterator();
			while(classit.hasNext()) {
				String id = classit.next();
				System.out.println(id+" "+classmap.get(id));
			}
		}
	}
	
	
}
