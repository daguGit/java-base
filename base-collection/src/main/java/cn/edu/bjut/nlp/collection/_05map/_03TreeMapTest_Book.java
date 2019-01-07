package cn.edu.bjut.nlp.collection._05map;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

/*
需求： 定义一个TreeMap，键存储的是书对象，值存储的是字符串。 根据书的出版出版日期排序。

 */
class Book{
	
	String name;
	
	String date; //出版日期	

	public Book(String name,String date) {
		this.name = name;
		this.date = date;
		
	}
	@Override
	public String toString() {
		
		return "[name: " + name +" date: " + date+"]";
	}
	
}
class MyComparetor implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.date.compareTo(o2.date) ;
	}
	
}
public class _03TreeMapTest_Book {

	
	public static void main(String[] args) throws InterruptedException {
		TreeMap<Book, String>  map = new TreeMap<Book, String>(new MyComparetor()); 
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		map.put(new Book("1",dateformat.format(new Date())), "1");
		Thread.sleep(1000);
		map.put(new Book("2",dateformat.format(new Date())), "2");
		Thread.sleep(1000);
		map.put(new Book("3",dateformat.format(new Date())), "3");
		System.out.println(map);
		

	}

}
