package chap17;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
	
	public static void main(String[] args) {
		 List<Member> mList=Arrays.asList(new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26)
				);
		 
		 
		 double avg=mList.stream().mapToDouble((x)->{return x.getAge();}).average().getAsDouble();
		 System.out.println(avg);
	}

}
