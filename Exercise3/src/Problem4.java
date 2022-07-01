
public class Problem4 {

	/*
	 * 변수 num의 값 중에서 백의 자리 이하를 버리는 코드
	 * ex) num=456 -> 400
	 * 	   num=111 -> 100
	 * */
	public static void main(String[] args) {

		int num = 111;
		System.out.println((int)(num/100.0) * 100);
	}

}
