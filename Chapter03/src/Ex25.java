import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.> ");
		
		String input = scan.nextLine();
		ch = input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
	}

}