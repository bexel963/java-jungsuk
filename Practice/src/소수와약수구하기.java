import java.util.Scanner;

public class �Ҽ��;�����ϱ� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		int count = 0;
		
		System.out.print("���� �Է� >> ");
		num = scan.nextInt();
		
		System.out.print(num + "�� ����� : ");
		for(int i=1 ; i<=num ; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		if(count==2) {
			System.out.println(num + "�� �Ҽ�");
		}else {
			System.out.println(num + "�� �Ҽ� �ƴ�");
		}
		
	}

}
