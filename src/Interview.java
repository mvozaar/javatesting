import java.util.ArrayList;
import java.util.List;

//abstract class Interview implements IInterview<T>{
//	static List<T> myList = new List<>();
//	
//	@Override public synchronized List<T> getInterviews() {
//		return myList;
//	}
//}
//

abstract class Interview<T> implements IInterview<T>{
//static List<T> myList = new List<>();
	// static because ...
	// change List to concrete class (not interface)
	// add public or private access specifier
	List<T> myList = new ArrayList<>();
	public static <T> List<T> list = new ArrayList<T>(); 
//	public static List<T> queue = new ArrayList<T>();
//
//@Override public synchronized List<T> getInterviews() {
	public synchronized List<T> getInterviews(){
		return myList;
	}
	 
	public static <T> List<T> list () {
		return new ArrayList<T>();
	}


}
