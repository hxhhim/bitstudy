package bookex13;

public class Util2 {
	public static <K,V>  V getValue(Pair1<K,V>p1,K k) {
		if (p1.getKey().equals(k)) {
			return p1.getValue();
		}else {
			return null;
		}
	}
	public static <K,V>  V getValue(ChildPair<K,V>p1,K k) {
		if (p1.getKey().equals(k)) {
			return p1.getValue();
		}else {
			return null;
		}
	}
}
