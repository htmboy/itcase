package itcase025;

public class Demo {

	public static void main(String[] args) {

		// �ַ����Բ�������
		// ��������ʱ, �Ὣ�ַ�ת����ascii��, Ȼ������
		// ������charǿ��ת����ascii��Ӧ���ַ�
		System.out.println('a' + 1);
		System.out.println((char)('a' + 1));
		
		byte b = 4; // 4��int���͵ĳ��� ���������ж��Ƿ���byte��Χ��, ����ھ��Զ�ǿ��ת����byte����
		b = 3 + 7; // �ұ��ǳ���, ������ж��Ƿ���byte��Χ��, Ȼ���Զ�ǿת, �ٸ�ֵ;
		byte b1 = 3;
		byte b2 = 7;
		// b = b1 + b2; // b1 �� b2 �Ǳ���, ֵ�ǻ�仯��, �����ж��Ƿ���byte��Χ��, ���Բ��ܸ�ֵ
		int x;
		int x1 = Integer.MAX_VALUE; // int���͵����ֵ 2147483647
		int x2 = 2;
		x = x1 + x2; // ������Χ, �ײ���Զ�������λ
		
		System.out.println(x);
	}

}
