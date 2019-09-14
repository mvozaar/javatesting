class Java {
	Integer cislo;
}

class JavaInterview extends Interview<Java> {
	
}
	
public class Tester {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer> test = new Test<Integer>();
		JavaInterview ji = new JavaInterview();
		ji.getInterviews();
		
		
		System.out.println("Test: " + test);
		System.out.println("JavaInterview: " + ji);

	}

}
