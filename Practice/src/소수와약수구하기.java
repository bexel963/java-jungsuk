import java.util.Scanner;

public class 소수와약수구하기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		int count = 0;
		
		System.out.print("정수 입력 >> ");
		num = scan.nextInt();
		
		System.out.print(num + "의 약수는 : ");
		for(int i=1 ; i<=num ; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		if(count==2) {
			System.out.println(num + "은 소수");
		}else {
			System.out.println(num + "은 소수 아님");
		}
		
	}

}
