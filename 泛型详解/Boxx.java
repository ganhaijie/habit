package m;

/**
 * 这样我们的Box类便可以得到复用，我们可以将T替换成任何我们想要的类型：
	Box<Integer> integerBox = new Box<Integer>();
	Box<Double> doubleBox = new Box<Double>();
	Box<String> stringBox = new Box<String>();
 */
public class Boxx <T>{
	private T t;
	
	public void set(T t){
		this.t=t;
	}
	
	public T get(){
		return t;
	}
}
