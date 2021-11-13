package java05;

import java.util.Scanner;

public class whileexam {

	public static void main(String[] args) {
		//while 은 초기에 미리 값을 정하는 것이 아니라 값이 부합하는 동안 계속 반복 
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt(); 
		while (i<10) {
			System.out.println(i);
			i++;
		}

	}

}
