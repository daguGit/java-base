package cn.edu.bjut.nlp.basic._2object;

/*
构造 代码块要注意的事项：
	1. java编译器编译一个java源文件的时候，会把成员变量的声明语句提前至一个类的最前端。
	2. 成员变量的初始化工作其实都在在构造函数中执行的。
	3. 一旦经过java编译器编译后，那么构造代码块的代码块就会被移动构造函数中执行，是在构造函数之前执行的，构造函数的中代码是最后执行 的。
	4. 成员变量的显示初始化与构造代码块 的代码是按照当前代码的顺序执行的。
*/

public class _0806_Object_ConstructionCodeBlockTest {
	//构造函数
		public _0806_Object_ConstructionCodeBlockTest(){   //构造函数
			i = 300000000;	
		}
			
		//构造代码块   //构造代码块的初始化
		{
			i = 200000000;
		}
		
		int i = 100000000;	 //成员变量的显初始化

		public static void main(String[] args) 
		{
			//利用 javap -c -p -l xxxxx。class 可以进行反编译查看。执行过程如下，先声明变量，后按显初始化和构造代码块实际顺序赋值，最后执行构造函数。
			/*int i
			 i = 2
			 i = 1
			 i = 3;*/
			_0806_Object_ConstructionCodeBlockTest d = new _0806_Object_ConstructionCodeBlockTest();
			System.out.println("i = "+d.i); 
		}

}
