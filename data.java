package java02;

public class data {
	public static void main (String[] args) {
		//문자열
		char var1 = '양'; // 문자를 한글자 입력 가능 ''로 입력 , 데이터 절약을 위해 사용
		String var2 = "안녕하세요"; // 여러 문자열 가능
		//정수형
		byte var3 = 7; // -128 ~ +127 까지 입력 가능
		short var4 = -32768; // 2byte 사용 -32768 ~ 32760 까지 입력 가능  
		int var5 = 9999; //-21억 ~ +21억 까지 가능
		long var6 = 999999999;// 8byte 사용, 여러숫자 입력 가능  
		
		//실수형 (소수점)
		float var7 =0.5f;// 4byte 이용, float 를 이용할때는 뒤에 f 를 붙여줘야됨.
		double var8=0.5; //8byte 이용 
		
		//boolean형
		boolean isStart =  false; // true or false 를 입력하여 조건식에서 많이 사용 
		
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
