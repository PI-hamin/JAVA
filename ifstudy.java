package java03;

public class ifstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String crimson = "안녕하세요?";
		int a= 1;
		
		if(crimson=="안녕") {// 만약에 () 라면 .......<중괄호 안에것을 실행>
			System.out.print("반갑습니다.");
		} //else {// if문에서 제외한 모든 상황을 실행 
			//System.out.print("무슨소리인지 모르겠어요");}
		else if (crimson=="안녕하세요") {
			System.out.print("반갑습니다.");
		}
		else if (crimson=="안녕하세요?") {
			System.out.print("아니요.");
		}
	if (a==0) {
		System.out.print("a=0입니다.");
		}else if (a==1) {
			System.out.print("a는 1입니다.");
		}
	// and or 연산자 
	if (a==0&&a==1) {// and, or 연산자는 조건을 두개 설정 가능  
		System.out.print("hello");
	}
	if (a==0||a==1) {//or 연산자 
		System.out.print("he");
	}
	} 

}
