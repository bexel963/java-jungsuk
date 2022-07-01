
public class Ex31_InnerClass {

	class InstanceInner {
		int iv = 100;
//		static int cv = 100;	-> static 변수를 선언할 수 없다.
		final static int CONST = 100;
	}
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static멤버들 정의를 할 수 있다.
	}
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;	-> static 변수를 선언할 수 없다.
			final static int CONST = 300;
		}
	}
	public static void main(String[] args) {

		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
