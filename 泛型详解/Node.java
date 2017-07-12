package m;


//类型擦除
public class Node <T> {
	private T data;
	
	private Node<T> next;
	
	public Node(T data,Node<T> next){
		this.data=data;
		this.next=next;
	}
	
	public T getData(){
		return data;
	}
	
}

//编译完成后代码被转换成============>
/**
 public class Node{
 	private Object data;
 	private Node next;
 	
 	public Node(Object date,Node next){
 		this.data=data;
		this.next=next;
 	}
 
 	public T getData(){
		return data;
	}
 } 
 这意味着不管我们声明Node<String>还是Node<Integer>，
 到了运行期间，JVM统统视为Node<Object>。有没有什么办法可以解决这个问题呢？
 这就需要我们自己重新设置bounds了   
 */




