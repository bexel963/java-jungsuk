
public class Problem9 {

	/*
	 * ������ ���� ch�� ������(��,�ҹ���)�̰ų� ������ ���� ���� b�� ���� true�� �ǰ� �ϴ� �ڵ�
	 * */
	public static void main(String[] args) {

		char ch = 'G';
		boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9');
		
		System.out.println(b);		
		
	}

}
