package operateEx;

public class LogicalOperatorEx {

	public static void main(String[] args) {

		// 논리연산자 &&(그리고) || (또는)

		// 명제(참/거짓인 문장) && 명제(참/거짓인 문장) : 두 문장이 모두 참인경우에만 참, 나머진 거짓

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("========================");

		// 명제(참/거짓인 문장) || 명제(참/거짓인 문장) : 두 문장 중 하나만 참이면 참, 나머진 거짓

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("========================");
		
		// 논리연산자 !(논리 부정, not)  ^(xor)		
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("========================");
		
		// 명제(참/거짓인 문장) ^(청개구리 연산자) 명제(참/거짓인 문장) : 두 문장의 결과가 다르면 참, 나머진 거짓
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		

	}

}
