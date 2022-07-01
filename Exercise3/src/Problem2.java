
public class Problem2 {
/*
 *  사과를 담는데 필요한 바구니의 수를 구하는 코드.
 *  ex) 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면
 *  	13개의 바구니가 필요함.
 * */
	public static void main(String[] args) {

		int numOfApples = 123;
		int sizeOfBuket = 10;
		
		int numOfBuket = (int)Math.ceil(numOfApples/(double)sizeOfBuket);
		
		int numOfBuket2 = 
				numOfApples/sizeOfBuket + (numOfApples%sizeOfBuket>0 ? 1 : 0);
		
		System.out.println("필요한 바구니 수 : " + numOfBuket);
		System.out.println("필요한 바구니 수 : " + numOfBuket2);
	}

}
