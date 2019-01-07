package cn.edu.bjut.nlp.strings.systemRuntimeMathDate;

import java.util.Random;

/*
随机数类
Random
需求： 编写一个函数随机产生四位的验证码。

 */
public class _05Random {
	public static void main(String[] args) {
		Random random = new Random();
		int ran = random.nextInt(10)+1;//产生 的 随机数就是1-10之间
		System.out.println("随机数："+ ran);
		code();
	}
	public static void code(){
		char[] arr = {'z','h','k','p','s'};
		StringBuilder sb  = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(arr.length);
			sb.append(arr[index]);
		}
		System.out.println(sb);
		
	}
}
