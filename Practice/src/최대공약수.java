import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 
		 * 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두 정수의 공통으로 있는 약수
		 * 최대 공약수 : 두 정수의 공약수중 가장 큰수
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		*/
		int num1 = 0;
		int num2 = 0;
		int gcd = 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수 입력2 >> ");
		num2 = scan.nextInt();

		max = num1 > num2 ? num2 : num1;
		
		for(int i=1 ; i<=max ; i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.print(i + " ");
				gcd = i;
			}
		}
		System.out.println();
		System.out.println("최대공약수 : " + gcd);
	}

}
