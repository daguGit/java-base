package cn.edu.bjut.nlp.io._02Stream;
/*
递归：函数的自身调用函数的自身。

递归的使用前提： 必须要有条件的情况下调用。

需求： 算出5的阶乘。 5! = 5*4 *3 * 2*1 

*/
public class _17Recursion {

	public void test(int num){
		int result = 1;
		
		while(num > 0){
			result *= num;
			num --;
		}
		System.out.println(result);
	}
	
	public int test2(int num){
		if (num == 1) {
			return 1;
		}else {
			return num*test2(--num);
		}
		
	}
	public static void main(String[] args) {
		
		//new _17Recursion().test(5);
		System.out.println(new _17Recursion().test2(5));
	}

}
