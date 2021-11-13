package java07;

public class TryCatchstudy {

	public static void main(String[] args) {
		int intArray []=new int [5]; // intArray 라는 변수에 5의 공간 만큼 배열로 선언 (0,1,2,3,4) 
		try 
		{
			intArray[3]=10; //3번쨰 공간에 10 저장 
			intArray[6]=1;
		}
		
		catch(Exception e) // try 에서의 예외사항을 catch 에서 실행한다. e에 애러사항 저장
		{
			System.out.println("배열 범위 초과");
			System.out.println(e);
			e.printStackTrace(); //에러문 출력
			
		}
		System.out.println("프로그램이 끝났어요");
	}

}
