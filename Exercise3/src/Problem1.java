/*
 * 이항연산자는 피연산자가 int보다 작은 타입(byte, short, char)인 경우 int로 변환한 다음에 연산을 수행한다.
 * 이항연산자는 연산을 위해 '피연산자 스택'을 사용하는데 이 과정에서 형변환이 발생하는 것이다.
 * 단항연산자는 '피연산자 스택'을 사용하지 않기 때문에 int보다 작은 타입이라도 형변환을 하지 않는다.
 * 
 * */
public class Problem1 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);
		System.out.println(y>=5 || x<0 && x>2);		// true
		System.out.println(y += 10 - x++);			// 13
		System.out.println(x += 2);					// 5
		System.out.println(!('A'<=c && c<='Z'));	// false
		System.out.println('C' - c);				// 2
		System.out.println('5' - '0');				// 5
		System.out.println(c + 1);					// 66
		System.out.println(++c);					// B
		System.out.println(c++);					// B
		System.out.println(c);						// C
	}

}
