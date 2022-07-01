
public class Problem10 {

	/*
	 * 대문자 -> 소문자 변경 코드
	 * 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
	 * */
	public static void main(String[] args) {

		char ch = 'B';
		
		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
