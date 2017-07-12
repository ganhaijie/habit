package m;

import java.util.ArrayList;
import java.util.List;

import a.b.c.A;

public class GenericWriting {
	static List<Apple> apples=new ArrayList<Apple>();
	static List<Fruit> fruit=new ArrayList<Fruit>();
	
	static<T> void writeExact(List<T> list,T item){
		list.add(item);
	}
	
	
	static void f1(){
		writeExact(apples,new Apple());
		writeExact(fruit,new Fruit());
	}
	
	static<T> void writeWithWildcar(List<? super T> list,T item){
		list.add(item);
	}
	
	static void f2(){
		writeWithWildcar(apples,new Apple());
		writeWithWildcar(fruit,new Apple());
	}
	
	
	
	
}
