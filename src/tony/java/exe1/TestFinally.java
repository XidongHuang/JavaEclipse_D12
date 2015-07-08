package tony.java.exe1;

public class TestFinally {

	
	public static void main(String[] args) {
		int i = method1();
		System.out.println(i);
	}
	
	public static int method1(){
		try{
			return 1;
		}catch (Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("I am finally");
			return 2;
		}
	}
}



