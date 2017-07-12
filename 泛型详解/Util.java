package m;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
		return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
	}

	// 除了short, int, double, long, float, byte, char 不能使用操作符 >
	/*
	 * public static<T> int countGreaterThan(T[] anArray,T elem){ int count=0;
	 * for(T e:anArray){ if(e > elem){ ++count; }
	 * 
	 * }
	 * 
	 * return count; }
	 */

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray) {
			if (e.compareTo(elem) > 0) {
				++count;
			}
		}
		return count;
	}

}
