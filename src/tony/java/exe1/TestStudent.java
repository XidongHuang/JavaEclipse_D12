package tony.java.exe1;

public class TestStudent {

}
class Student{
	int id;
	
	public void regist(int id){
		if(id > 0){
			this.id = id;
		} else {
			throw new MyException("Input invalied");
		}
	}
}