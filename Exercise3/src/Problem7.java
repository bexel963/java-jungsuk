
public class Problem7 {

	/*
	 * 화씨(Fahrenheit) -> 섭씨(Celcius) 변환 코드
	 * 변환 공식 : 'C = 5/9 * (F - 32)
	 * 변환 결과값은 소수점 셋째자리에서 반올림한다. (Math.round()를 사용하지 않고 처리할 것.)
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
