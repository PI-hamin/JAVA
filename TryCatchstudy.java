package java07;

public class TryCatchstudy {

	public static void main(String[] args) {
		int intArray []=new int [5]; // intArray ��� ������ 5�� ���� ��ŭ �迭�� ���� (0,1,2,3,4) 
		try 
		{
			intArray[3]=10; //3���� ������ 10 ���� 
			intArray[6]=1;
		}
		
		catch(Exception e) // try ������ ���ܻ����� catch ���� �����Ѵ�. e�� �ַ����� ����
		{
			System.out.println("�迭 ���� �ʰ�");
			System.out.println(e);
			e.printStackTrace(); //������ ���
			
		}
		System.out.println("���α׷��� �������");
	}

}
