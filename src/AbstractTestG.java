import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTestG<T> {
	public List<T> myList = new ArrayList<T>();

	public synchronized List<T> getList() {
		return myList;
	}
}