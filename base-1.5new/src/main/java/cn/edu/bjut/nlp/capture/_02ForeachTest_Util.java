package cn.edu.bjut.nlp.capture;

import java.util.Iterator;

class MyList implements Iterable<String>{ 
	Object[] arr = new Object[10];
	int size = 0;
	
	public void add(Object object){
		arr[size] = object;
		size++;
	}
	public int size(){
		return size;
	}
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int cursor = 0;
			@Override
			public boolean hasNext() {
				return cursor < size;
			}

			@Override
			public String next() {
				return (String)arr[cursor++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
public class _02ForeachTest_Util {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyList myList = new MyList();
		

		myList.add("a");
		myList.add("a");
		myList.add("a");
		for (String item : myList) {
			System.out.println(item);
		}

	}

}
