package cn.edu.bjut.nlp.collection._05map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
在现实生活中有些数据是以映射关系存在的，也就是成对存在的，比如： 
	
	民政局 ：
		键                    值
		
		老公                老婆
		身份证            人
		一把要锁       锁
 双列集合：
-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map接口的方法：
 	
 	添加：
 		put(K key, V value) //如果之前没有该键，返回null。如果以前存在，就返回以前该键的值。
 		putAll(Map<? extends K,? extends V> m) 
  	删除
 		remove(Object key) 
 		clear() 
 	获取：
 		get(Object key) 
 		size() 
 	判断：
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 
	迭代：
		keySet() 
		values() 
		entrySet() 
 
 */
public class _01Map {


	public static void main(String[] args) {
		Map<String, String>  map = new HashMap<String,String>(); 
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		// 如果之前没有存在该键，那么返回的是null，如果之前就已经存在该键了，那么就返回该键之前对应 的值。
		System.out.println(map.put("c", "5"));
		
		/*//添加
		Map<String, String>  map2 = new HashMap<String,String>(); 
		map2.put("e", "5");
		map2.put("f", "6");
		map.putAll(map2);//把map2的元素添加到map集合中。
		*/
		
		/*//删除
		System.out.println("删除的数据是:"+map.remove("a")) ;  //根据键删除一条map中的数据，返回的是该键对应 的值。
		map.clear(); //清空集合中的所有数据。
	    */		

		/* //获取
		System.out.println("根据指定 的键获取对应的值:"+ map.get("a"));
		System.out.println("获取map集合键值对个数："+map.size());
		*/
		
		/*//判断
		System.out.println("判断map集合是否包含指定的键："+ map.containsKey("a"));
		System.out.println("判断map集合中是否包含指定 的值："+ map.containsValue("2"));
		map.clear();
		map.put(null, null);
		System.out.println("判断map集合是否为空元素："+ map.isEmpty());
		*/
		
		/*//迭代
		 //map集合中遍历方式一： 使用keySet方法进行遍历        缺点： keySet方法只是返回了所有的键，没有值。 
		Set<String> keys = map.keySet();  //keySet() 把Map集合中的所有键都保存到一个Set类型 的集合对象中返回。
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key+" "+ map.get(key));
		}
		
		 //map集合的遍历方式二： 使用values方法进行 遍历   缺点： values方法只能返回所有 的值，没有键。
		Collection<String>  c = map.values(); //values() 把所有的值存储到一个Collection集合中返回。
		Iterator<String> iterator = values.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		//map集合的遍历方式三： entrySet方法遍历。
		Set<Map.Entry<String,String>> sets = map.entrySet();
		Iterator<Map.Entry<String,String>> iterator = sets.iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey()+ entry.getValue());
		}
		System.out.println(map);
	}

}
