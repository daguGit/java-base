package cn.edu.bjut.nlp.collection._02list;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/*
需求： 使用LinkedList存储一副扑克牌，然后实现洗牌功能。

	52张
	
	一张扑克牌： 花色  点数。  梅花6
*/
//扑克类
class Poker{
	
	String color;
	String num;
	public Poker(String color,String num){
		this.color = color;
		this.num = num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color+" "+this.num ;
	}
} 
public class _04LinkedListTest2_Pocker {
	//扑克类的集合
	LinkedList<Poker> pokers = new LinkedList<Poker>(); 
	String[] colors = {" ","A","B","C","D"};
	//构造一整副牌
	public void init(){
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 14; j++) {
				pokers.add(new Poker(colors[i],j+""));
			}
		}
	}
	//洗牌
	public void wash(){
		Random random = new Random();
		ListIterator iterator = pokers.listIterator();
		int key = random.nextInt(52);
		for (int i = 0; i <key; i++) {
			iterator.next();
		}
		Poker p = (Poker) iterator.next();
		pokers.remove(p);
		pokers.push(p);
	}
	public void wash2(){
		Random random = new Random();
		
		int random1 = random.nextInt(52);
		int random2 = random.nextInt(52);
		Poker poker1 = pokers.get(random1);
		Poker poker2 = pokers.get(random2);
		pokers.set(random1,poker2);
		pokers.set(random2,poker1);

		
	}
	//打印
	public void print(){
		for (int i = 0; i <pokers.size(); i++) {
			System.out.print(pokers.get(i)+",  ");
			if(i%10==9)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		_04LinkedListTest2_Pocker test = new _04LinkedListTest2_Pocker();
		test.init();
		for (int i = 0; i < 100; i++) {
			test.wash2();
		}
		
		test.print();
		System.out.println(test.pokers.size());
	}

}
