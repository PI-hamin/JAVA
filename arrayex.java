package java06;

public class arrayex {
	public static void main(String[] args) {
		String a ="a";
		int b=1;
		
		int arrayInt[]= new int[10];// new int[] ��ȣ �ȿ��� �ʱ�ȭ ��ų�� �ִ� ���� �־����. 0~9 �� ���� ����
		for (int i=0; i<arrayInt.length; i++) { // �迭�� ���̸�ŭ ���ƶ� ! 
			System.out.println(i);
		}
		int arrayInt2[]= {1,3,5,7,9};
		for (int i=0; i<arrayInt2.length; i++) {
			System.out.println(i);
		}
		int arrayInt3[]= {1,3,5,7,9};
		for (int i=0; i<arrayInt3.length; i++) {
			System.out.println(arrayInt3[i]); //(arrayInt3[i]) i���� ����Ű�� �ε��� ��� 
		}
		String as[] = {"a","b","c","d","e"};
		for (int i=0; i<as.length;i++) {
			System.out.println(as[i]);
		}
	}
}
