package cn.edu.bjut.nlp.basic._1basic;
/*
三元运算符(三目运算符)

格式;
	布尔表达式？值1:值2  ;

三元运算符要注意的细节：
	使用三元运算符的时候，一定要使用该表达式返回的结果，或者是定义一个变量接收该表达式返回的结果。

*/
public class _0407_Operator_ThreeParamsOperator {
	public static void main(String[] args) {
		
		int age = 26;
		String result = age>=18?"成年人":"未成年人";
		System.out.println(result);
		

	}
}
