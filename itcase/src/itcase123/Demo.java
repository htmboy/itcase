package itcase123;

public class Demo {

	public static void main(String[] args) { // ��ʵ���������һ��new String[0] 
		/**
		 * ����������֮��
		 * 1, ��ʽ�ǹ̶�
		 * 2, ��jvm��ʶ��͵���
		 * 
		 * public ��ΪȨ�ޱ���������
		 * static ����Ҫ�����
		 * void ������û�о���ķ���ֵ
		 * main ������, ���ǹؼ���, ֻ��һ��jvmʶ��Ĺ̶�������
		 * String[] args �����������Ĳ����б�, ��һ���������͵Ĳ���, ����Ԫ�ض����ַ�������
		 * **/ 
		
		System.out.println(args); // [Ljava.lang.String;@3b192d32 �����������
		System.out.println(args.length);
	}

}
