import java.util.Scanner;

public class �ִ����� {

	public static void main(String[] args) {
		/* 
		 * �� ���� num1�� num2�� �Է¹ް� �� ������ �ִ� ������� ����ϴ� ����
		 * ����� : �� ������ �������� �ִ� ���
		 * �ִ� ����� : �� ������ ������� ���� ū��
		 * 8�� 12�� ����� : 1 2 4
		 * 8�� 12�� �ִ����� : 4
		*/
		int num1 = 0;
		int num2 = 0;
		int gcd = 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�1 >> ");
		num1 = scan.nextInt();
		System.out.print("���� �Է�2 >> ");
		num2 = scan.nextInt();

		max = num1 > num2 ? num2 : num1;
		
		for(int i=1 ; i<=max ; i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.print(i + " ");
				gcd = i;
			}
		}
		System.out.println();
		System.out.println("�ִ����� : " + gcd);
	}

}
