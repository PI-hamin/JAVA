package java03;

public class ifstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String crimson = "�ȳ��ϼ���?";
		int a= 1;
		
		if(crimson=="�ȳ�") {// ���࿡ () ��� .......<�߰�ȣ �ȿ����� ����>
			System.out.print("�ݰ����ϴ�.");
		} //else {// if������ ������ ��� ��Ȳ�� ���� 
			//System.out.print("�����Ҹ����� �𸣰ھ��");}
		else if (crimson=="�ȳ��ϼ���") {
			System.out.print("�ݰ����ϴ�.");
		}
		else if (crimson=="�ȳ��ϼ���?") {
			System.out.print("�ƴϿ�.");
		}
	if (a==0) {
		System.out.print("a=0�Դϴ�.");
		}else if (a==1) {
			System.out.print("a�� 1�Դϴ�.");
		}
	// and or ������ 
	if (a==0&&a==1) {// and, or �����ڴ� ������ �ΰ� ���� ����  
		System.out.print("hello");
	}
	if (a==0||a==1) {//or ������ 
		System.out.print("he");
	}
	} 

}
