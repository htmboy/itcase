package itcase024;

public class Demo {

	public static void main(String[] args) {
		int x = 3; 
		x = x + 5;
		
		byte b = 3;
		// b = b + 4; // 4 �� 4���ֽ� b��һ���ֽ� ����� b�����Զ����� �ٸ�ֵ�� 1���ֽڵ�b���� �ᱨ��
		b = (byte)(b + 4); // ǿ��ת������ ���ᱨ��
		
		System.out.println(b);

	}

}
