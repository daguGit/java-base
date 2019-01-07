package cn.edu.bjut.nlp.basic._3exception;
/*
需求：模拟你去吃木桶饭，如果带钱少于了10块，那么就抛出一个没有带够钱的异常对象，
如果带够了，那么就可以吃上香喷喷的地沟油木桶饭.

*/

//定义没钱的异常
class NoMoneyException extends Exception{
	public NoMoneyException(String info){
		super(info);
	}
}
public class _0903_Exception_DefineExceptionTest {

	public static void main(String[] args) {
	
		_0903_Exception_DefineExceptionTest define =  new _0903_Exception_DefineExceptionTest();
		try {
			define.eat(5);
		} catch (NoMoneyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
	
		}
		
		
	}
	public void eat(int money) throws NoMoneyException
	{
		if (money < 10) {
			throw new NoMoneyException("Nomoney");
		}else{
			System.out.println("welcome");
		}
	}
}
