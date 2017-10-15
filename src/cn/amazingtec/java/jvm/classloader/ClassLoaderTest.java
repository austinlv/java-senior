package cn.amazingtec.java.jvm.classloader;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("sun.boot.class.path"));
		
		ClassLoader cl = Test.class.getClassLoader();
		System.out.println("ClassLoader is:"+cl.toString());
		System.out.println("ClassLoader\'s parent is:"+cl.getParent().toString());
		
		//nullpoint exception
		//System.out.println("ClassLoader\'s grand father is:"+cl.getParent().getParent().toString());

		//System.out.println(Integer.class.getClassLoader().toString());
	}

}
