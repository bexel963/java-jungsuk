
public class Problem2 {
/*
 *  ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ�.
 *  ex) ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�
 *  	13���� �ٱ��ϰ� �ʿ���.
 * */
	public static void main(String[] args) {

		int numOfApples = 123;
		int sizeOfBuket = 10;
		
		int numOfBuket = (int)Math.ceil(numOfApples/(double)sizeOfBuket);
		
		int numOfBuket2 = 
				numOfApples/sizeOfBuket + (numOfApples%sizeOfBuket>0 ? 1 : 0);
		
		System.out.println("�ʿ��� �ٱ��� �� : " + numOfBuket);
		System.out.println("�ʿ��� �ٱ��� �� : " + numOfBuket2);
	}

}
