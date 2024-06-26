package sec03;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		
		//	주어진 pathname 문자열을 추상 경로명으로 변환하여 새 File 인스턴스를 생성합니다. 
		//주어진 문자열이 빈 문자열이면 결과는 빈 추상 경로 이름입니다.
		
		//파일을 만든다는 개념은 그 파일이 들어갈 폴더가 있어야 함
		// 폴더를 만들수도 있고, 기존 폴더를 이용할 수 도 있음
		//1) 폴더를 만드는 경우
		//  폴더를 만들려면 File 객체를 만든 후 mkdir() 메서드 사용
		// 그 안에 파일을 만들어야 함
		//그러면 그 폴더가 있는지 확인하는 절차가 있어야 함
		
		
		File dir=new File("e:/test2");
		System.out.println(dir);
		System.out.println(dir.mkdir());

		System.out.println(dir.exists());
		
		File file1=new File("e:/test2/hi1.txt");
		
		if(dir.exists()) {
			try {
				System.out.println(file1.createNewFile());
			} catch (IOException e) {
				System.out.println("파일 만드는 도중 예외남");
				//e.printStackTrace();
			}
		}
		
		
	}

}
