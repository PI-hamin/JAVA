package java02;

public class data {
	public static void main (String[] args) {
		//���ڿ�
		char var1 = '��'; // ���ڸ� �ѱ��� �Է� ���� ''�� �Է� , ������ ������ ���� ���
		String var2 = "�ȳ��ϼ���"; // ���� ���ڿ� ����
		//������
		byte var3 = 7; // -128 ~ +127 ���� �Է� ����
		short var4 = -32768; // 2byte ��� -32768 ~ 32760 ���� �Է� ����  
		int var5 = 9999; //-21�� ~ +21�� ���� ����
		long var6 = 999999999;// 8byte ���, �������� �Է� ����  
		
		//�Ǽ��� (�Ҽ���)
		float var7 =0.5f;// 4byte �̿�, float �� �̿��Ҷ��� �ڿ� f �� �ٿ���ߵ�.
		double var8=0.5; //8byte �̿� 
		
		//boolean��
		boolean isStart =  false; // true or false �� �Է��Ͽ� ���ǽĿ��� ���� ��� 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(isStart);
		
		
	}
}
