package itcase233;

/*
 * String��
 * �ַ�����һ������Ķ���
 * �ַ���һ����ʼ���Ͳ����Ա��ı�
 * */

public class Demo {
	
	public static void main(String[] args) {
		
//		stringDemo1();
		stringDemo2();
	}
	
	private static void stringDemo2() {
		String s = "abc"; // ���ַ���������, �������ַ�abc ���ѵ�ַ����s
		String s1 = new String("abc"); // �ڶ��ڴ洴����һ������, ���캯������abc�ַ���
		System.out.println(s == s1);
		System.out.println("s=" + s);
		System.out.println("s1=" + s1);
	}
	
	/*
	 * �ַ�������ĵ�һ�ַ�ʽ, ��ȷ�ַ��������ص��ص�
	 * 
	 * */
	private static void stringDemo1() {
		
		String str = "abc"; // abc �洢���ַ�����������
//		str = "nba";
		String s1 = "abc";
		System.out.println(str == s1);
		System.out.println("str=" + str);
	}
}
