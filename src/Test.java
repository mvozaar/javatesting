import java.util.ArrayList;
import java.util.List;

public class Test<T> extends AbstractTestG<T>{
	
	public synchronized List<T> getList() {
		return new ArrayList<T>();	}
	
}
