
public class Problem6 {

	/*
	 * 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드.
	 * ex) num=24	-> 30 -> 30-24 -> 6
	 * 	   num=81	-> 90 -> 90-81 -> 9
	 * */
	public static void main(String[] args) {

		int num = 24;
		System.out.println(10-(num%10));
	}

}
