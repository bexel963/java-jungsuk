
public class Problem5 {

	/*
	 * num의 값에서 일의 자리를 1로 바꾸는 코드
	 * ex) num=333 -> 331
	 * 	   num=777 -> 771
	 * */
	public static void main(String[] args) {

		int num = 777;
		System.out.println((int)(num/10.0) * 10 + 1);
	}

}
