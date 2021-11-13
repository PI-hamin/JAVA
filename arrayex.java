package java06;

public class arrayex {
	public static void main(String[] args) {
		String a ="a";
		int b=1;
		
		int arrayInt[]= new int[10];// new int[] 괄호 안에는 초기화 시킬수 있는 값이 있어야함. 0~9 의 수를 담음
		for (int i=0; i<arrayInt.length; i++) { // 배열의 길이만큼 돌아라 ! 
			System.out.println(i);
		}
		int arrayInt2[]= {1,3,5,7,9};
		for (int i=0; i<arrayInt2.length; i++) {
			System.out.println(i);
		}
		int arrayInt3[]= {1,3,5,7,9};
		for (int i=0; i<arrayInt3.length; i++) {
			System.out.println(arrayInt3[i]); //(arrayInt3[i]) i값이 가리키는 인덱스 출력 
		}
		String as[] = {"a","b","c","d","e"};
		for (int i=0; i<as.length;i++) {
			System.out.println(as[i]);
		}
	}
}
