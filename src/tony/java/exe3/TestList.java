package tony.java.exe3;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList {
	
	
	@Test
	public void testList2(){

		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		list.add(456);
		System.out.println(list.indexOf(456));
		System.out.println(list.lastIndexOf(456));
		System.out.println(list.indexOf(123)==list.lastIndexOf(123));
		System.out.println(list.indexOf(444));
		
	}
	
	
	
	//ArrayList:List的主要实现类
	@Test
	public void testList1(){

		
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		System.out.println(list);
		
		list.add(0, 555);
		System.out.println(list);
		
		System.out.println(list.get(1));
	
		
		
	
	
	}
}
