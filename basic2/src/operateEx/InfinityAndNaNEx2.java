package operateEx;

public class InfinityAndNaNEx2 {

	public static void main(String[] args) {
		
		
		int x=5;
		double y = 0.0;
		
		double z = x % y;
		
		System.out.println(z);
		
		System.out.println(z+2);
		
		
		// if(true){
		//}
		
		//z가 NaN인지 확인하는 코드가 필요, 이다. is
		
		// 접두사가 is인경우 결과값은 논리형(true,false)
		
		System.out.println(Double.isNaN(z));
		
		if(Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
		

	}

}