package itcase339;

/*
 * װ�����ģʽ
 * ��һ�����Ĺ��ܽ�����ǿʱ, �Ϳ���ʹ�ø�ģʽ����������
 * 
 * װ��ģʽ�ͼ̳ж���ʵ��һ�����ص�: ���й��ܵ���չ. 
 * װ��ģʽ�ͼ̳е�����
 * ������һ���̳���ϵ
 * writer
 * 		|--textwriter: ���ڲ����ı�
 * 		|--mediawriter: ���ڲ���ý��
 * 
 * ��Ҫ�Բ����Ķ�������Ч�ʵ����
 * �����������, ����ͨ���̳жԾ���Ľ��й��ܵ���չ
 * Ч�������Ҫ���뻺�弼��
 * writer
 * 		|--textwriter: ���ڲ����ı�
 * 			|--bufferedtextwriter: �����˻��弼���Ĳ����ı�����
 * 		|--mediawriter: ���ڲ���ý��
 * 			|--bufferedmediawriter: �����˻��弼���Ĳ���ý��
 * 
 * ������ͽ�����. ����������������������
 * ��������ϵ���й�����չ, �ֶ���������
 * ��ô�����Ҫ���Ч��, �ǲ���ҲҪ�����������, ��, ��ʱ�ͻᷢ��ֻΪ��߹���, ���еļ̳�
 * ���¼̳���ϵԽ��Խӷ��, �������;
 * ��Ȼ����Ķ���ͬһ�ּ��� -- ����
 * */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
//		p.chifan();
		
		// ���ģʽ
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2(p);
		p2.chifan();
	}

}

// ����Ҫ�Ķ�ԭ��Ĵ���
class Person {
	void chifan() {
		System.out.println("�Է�");
	}
}

// �����ĳ�����Ϊ����ǿPerson�����ֵ�
class NewPerson {
	private Person p;
	NewPerson(Person p) {
		this.p = p;
	}
	
	public void chifan() {
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
	}
}

class NewPerson2 extends Person {
	public void chifan() {
		System.out.println("��θ��");
		super.chifan();
		System.out.println("���");
	}
}