package itcase143;

class Fu{ // Ĭ���Ǽ̳�Object, �����˶���
	Fu(){
		super(); // ����Object
		show(); // �����ิд��, ����ִ����zi��show();
		return;
	}
	void show() {
		System.out.println("fu show");
	}
}
class Zi extends Fu{
	int num = 8;
	Zi(){
		super();
		// ͨ��super��ʼ������ʱ, ����ĳ�Ա������δ��ʾ��ʼ��, ��super�����ʼ����Ϻ�, 
		// �Ž�������ĳ�Ա������ʾ��ʼ��
		System.out.println("zi run ..." + num);
		return;
	}
	void show() { // ��д
		System.out.println("zi show..." + num);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show(); // ������������, �Ҳ���, ����������

	}

}
