package cn.amazingtec.java.jvm.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DiskClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �����Զ���classloader����
		DiskClassLoader diskLoader = new DiskClassLoader("D:\\lib");
		try {
			// ����class�ļ�
			Class c = diskLoader.loadClass("com.frank.test.Test");

			if (c != null) {
				try {
					Object obj = c.newInstance();
					Method method = c.getDeclaredMethod("say", null);
					// ͨ���������Test���say����
					method.invoke(obj, null);
				} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
						| IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}