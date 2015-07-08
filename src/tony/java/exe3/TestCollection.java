package tony.java.exe3;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;



import java.util.Iterator;

import org.junit.Test;

/*
 * 1. 存储对象可以考虑：数组 集合
 * 2. 数组存储对象的特点： Student[] stu = new Student[]; 
 * 	> 弊端：a.一旦创建，气长度不可变。 b.真实的数组存放的对象的个数是不可知的
 * 3. 
 * 	Collection 接口
 * 			|----List接口：存储右足的，可以重复的元素
 * 				|---- ArrayList(主要的实现类)， LinkedList， Vector
 * 			|----Set 接口：存储无序的，不可重复的元素
 * 				|---- HashSet, LinkedHashSet, TreeSet
 *
 * 	Map接口: 存储“键-值”对的数据
 * 			|---- HashMap, LinkedHashMap, TreeMap, HashTable(子类：Properties)
 * 
 */
public class TestCollection {
	@Test
	public void TestCollection3(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM", 23));

		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		//10. removeAll(Collection: 从当前集合中删除包含在coll中的元素。
		coll.removeAll(coll1);
		System.out.println(coll);
		//equals(Object obj):
		Collection coll2 = new ArrayList();
		coll2.add(123);
		coll2.add(new String("AA"));
		System.out.println(coll2.equals(coll));
		
		//12.hashCode()
		System.out.println(coll.hashCode());
		
		//13.toArray():集合转化为数组
		System.out.println();
		Object [] obj = coll.toArray();
		for(int i =0; i<obj.length;i++){
			System.out.println(obj[i]);
		}
		System.out.println();
		
		//14. iterator():返回一个Iterator 接口实现类的对象
		Iterator it =  coll.iterator();
		System.out.println(it.next());
		//方式2：不用
//		for(int i = 0; i< coll.size();i++){
//			System.out.println(it.next());
//		}
		
		
		//方式三：使用
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	
	@Test
	public void testCollection2(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM", 23));
		//System.out.println(coll.size());
		
		//6. contains(Object obj):if the collection contains the obj, return true, otherwise return false
		//判断依据：根据元素所在的类的equals()方法进行判断
		//明确：如果存入集合中的元素是自定义类的对象。要求：自定义类要重写equals() 方法！
		boolean b1 = coll.contains(123);
		System.out.println(b1);
		boolean b2 = coll.contains(new Person("MM", 23));
		System.out.println(b2);
		
		//7. containsAll(Collection coll):判断当前集合中时候包含coll中所有的元素
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		boolean b3 = coll.containsAll(coll1);
		System.out.println(coll1);
		System.out.println("#"+b3);
		coll1.add(456);
		//8. retainAll(Collection coll);求当前集合于coll的共有的元素，返回给当前集合
		coll.retainAll(coll1);
		System.out.println(coll);
		
		//9.remove(Object obj):删除集合中的obj元素，若删除成功，返回true，否则，返回false
		boolean b4 = coll.remove("BB");
		System.out.println(b4);
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testCollection1(){
		Collection coll = new ArrayList();
		
		//1.size():return the numbers of elements those in collection
		System.out.println(coll.size());
		//2.add(Object obj): add one object in the collection
		coll.add(123);
		coll.add("aaa");
		coll.add(new Date());
		coll.add("BB");
		System.out.println(coll.size());
		
		//3.addAll(Collection coll): 将形参coll中包含的所有元素添加到当前集合中
		Collection coll1 = Arrays.asList(1,2,3);
		coll.addAll(coll1);
		System.out.println(coll.size());
		//查看集合元素
		System.out.println(coll);
		
		
		//4. isEmpty():
		System.out.println(coll.isEmpty());
		//5. clear(): empty the collction
		coll.clear();
		System.out.println(coll.isEmpty());
		
		
	}
}
