
public class Problem10 {

	/*
	 * �빮�� -> �ҹ��� ���� �ڵ�
	 * ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
	 * */
	public static void main(String[] args) {

		char ch = 'B';
		
		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
