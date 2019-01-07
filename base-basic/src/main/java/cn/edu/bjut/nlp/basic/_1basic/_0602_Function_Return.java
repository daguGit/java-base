package cn.edu.bjut.nlp.basic._1basic;
/*
函数： 

函数的作用： 为了提高功能代码的复用性。

函数的定义格式:
	
	修饰符  返回值类型  变量名(形式参数){
		函数体
	}

函数的特点：
	1. 函数是把一个功能的代码 封装起来以达到提高功能 代码的复用性。
	2. 函数定义好之后，需要调用才能执行的。
	3. 如果一个函数没有返回值类型，那么就使用void关键字表示。

需求: 定义一个函数判断分数的等级，然后返回分数对应的等级。
	

	"a等级"

*/
/*
注意： 如果一个函数的返回值类型是具体的数据类型，那么该函数就必须要保证在任意情况下都保证有返回值。（除了返回值类型是void以外）

return 关键字的作用：
	1. 返回数据给函数的调用者。
	2. 函数一旦执行到了return关键字，那么该函数马上结束。 (能结束一个函数)

注意：一个函数的返回值类型 是void，那么也可以出现return关键字，但是return关键字的后面不能有数据。

break关键字与return关键字的区别：
	1.break关键字是结束一个循环。
	2. return关键字是结束一个函数。


*/
public class _0602_Function_Return {
	public static void main(String[] args){
		String grade = new _0602_Function_Return().getGrade(75);
		System.out.println(grade);
		new _0602_Function_Return().test();
	}
	//测试return和break区别。
	public void test(){
		for(int i = 1;i< 5;i ++){
			System.out.println();
			return ;
		}
		System.out.println("llaj");
	}
	public String getGrade(int score){
		String grade = "";
		if (score>=90 && score<=100) {
			grade = "Congratulation A!";
		}else if (score >= 80) { 
			grade = "good B!";
		}else if (score >= 70) {
			grade = "just soso C!";
		}else if (score >= 60 ) {
			grade = "workhard D!";
		}else if(score <= 60&& score >= 0 ){
			grade = "Bad!";
		}
		return grade;
	}
	
	// 错误注意： 如果一个函数的返回值类型是具体的数据类型，那么该函数就必须要保证在任意情况下都保证有返回值。（除了返回值类型是void以外）
	/*public String getGrade2(int score){
		if (score>=90 && score<=100) {
			return "Congratulation A!";
		}else if (score >= 80) { 
			return "good B!";
		}else if (score >= 70) {
			return"just soso C!";
		}else if (score >= 60 ) {
			return "workhard D!";
		}else if(score <= 60&& score >= 0 ){
			return "Bad!";
		}
		
	}*/
}
