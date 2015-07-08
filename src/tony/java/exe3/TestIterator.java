package tony.java.exe3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class TestIterator {

	//面试题：
	@Test
	public void testFor3(){
		String[] str =  new String []{"AA","BB","CC"};
		for(String s : str){//s是局部变量，将str赋给s，然后再在方法内使用s
			s = s+"";
		}
		
		for(int i = 0; i<str.length;i++){
			System.out.println(str[i]);
		}
		
	}
	
	
	
	@Test
	public void testFor2(){
		String[] str =  new String []{"AA","BB","CC"};
		for(int i = 0; i<str.length;i++){
			str[i] = i+"";
		}
		
		for(int i = 0; i<str.length;i++){
			System.out.println(str[i]);
		}
		
	}
	
	
	
	
	
	//使用增强for循环实现数组的遍历
	@Test
	public void testFor1(){
		String [] strings = new String []{"AA","BB","CC"};
		
		for(String i:strings){
			System.out.println(i);
		}
	}
	
	
	
	
	//使用增强for循环
	@Test
	public void testFor(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM", 23));
		
		
		for(Object i:coll){
			System.out.println(i);
		}
		
		
	}
	
	//正确的写法，使用迭代
	@Test
	public void test1(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM", 23));
		
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
	
}
