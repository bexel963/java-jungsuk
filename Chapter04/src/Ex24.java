
public class Ex24 {

	public static void main(String[] args) {

		int i = 11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(long j=0 ; j<4_000_000_000L ; j++) {
				;
			}
		}
		System.out.println("GAME OVER!");
	}

}