import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTest<T> {
	public List<T> myList = new ArrayList<T>();

	public synchronized List<T> getList() {
		return myList;
	}
}
