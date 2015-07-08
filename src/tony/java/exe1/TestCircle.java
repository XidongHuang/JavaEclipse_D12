package tony.java.exe1;
/*
 * 1. 手动的抛出一个异常的例子
 * 2. 抛出的异常类型： 若是RuntimeException, 可以不显式地处理
 *    若是一个Exception， 必须要显式地处理
 */
import javax.management.RuntimeErrorException;

public class TestCircle {

}


class Circle{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//比较两个原的半径的大小
	public int CompareTo(Object obj){
		if(this == obj){
			return 0;
		} else if (obj instanceof Circle){
			Circle c = (Circle)obj;
			
			if(this.radius > c.radius){
				return 1;
			} else if(this.radius == c.radius){
				return 0;
			} else {
				return -1;
			} 
		
			
			
			
		}
		else{
				throw new RuntimeException( "It is wrong");
			}
		
	}
	
	
}