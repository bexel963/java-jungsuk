
public class Problem7 {

	/*
	 * ȭ��(Fahrenheit) -> ����(Celcius) ��ȯ �ڵ�
	 * ��ȯ ���� : 'C = 5/9 * (F - 32)
	 * ��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø��Ѵ�. (Math.round()�� ������� �ʰ� ó���� ��.)
	 * */
	public static void main(String[] args) {

		int fahrenheit = 100;
		float celcius = (int)(((float)5/9 * (fahrenheit - 32))*100+0.5f)/100.0f;
		
//		celcius = (int)(celcius * 100 + 0.5f);
//		celcius /= 100;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
