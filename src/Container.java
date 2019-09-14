import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Container<i1, i2, i3> {
	i1 item1;
	i2 item2;
	List<i3> queue = new ArrayList<i3>();
	
	public i1 getItem1() {
		return item1;
	}
	public void setItem1(i1 item1) {
		this.item1 = item1;
	}
	public i2 getItem2() {
		return item2;
	}
	public void setItem2(i2 item2) {
		this.item2 = item2;
	}
	public List<i3> getQueue() {
		return queue;
	}
	public void setQueue(List<i3> queue) {
		this.queue = queue;
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E>set2) {
		Set<E> result = new HashSet<E>(set1);
		
		return result;
		
	}

}
