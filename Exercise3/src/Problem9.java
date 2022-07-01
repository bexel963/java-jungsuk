
public class Problem9 {

	/*
	 * 문자형 변수 ch가 영문자(대,소문자)이거나 숫자일 때만 변수 b의 값이 true가 되게 하는 코드
	 * */
	public static void main(String[] args) {

		char ch = 'G';
		boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9');
		
		System.out.println(b);		
		
	}

}
