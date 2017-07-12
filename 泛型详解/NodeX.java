package m;

public class NodeX<T extends Comparable<T>> {
	private T data;
	private NodeX<T> next;
	
	public NodeX(T data,NodeX<T> next){
		this.data=data;
		this.next=next;
	}
	
	public T getData(){
		return data;
	}
	
	
	/**
	public class NodeX {
    	private Comparable data;
    	private NodeX next;
    	public NodeX(Comparable data, NodeX next) {
        	this.data = data;
        	this.next = next;
    	}
    	public Comparable getData() { return data; }
	 */
	
	
}
