package cn.edu.bjut.nlp.basic._3exception;
class NoIpException extends Exception{
	public NoIpException (String message) {
		super(message);
	}
}
public class _0903_Exception_DefineException {

	public static void main(String[] args) {
	
		_0903_Exception_DefineException define =  new _0903_Exception_DefineException();
		try {
			define.feiQ(null);
		} catch (NoIpException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("马上插上网线！");
		}
		
		
	}
	public void feiQ(String ip) throws NoIpException
	{
		if (ip == null) {
			throw new NoIpException("no IP");
		}
		System.out.println("start");
	}
}
