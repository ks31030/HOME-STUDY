package exam01;


public class HelloJava {	
	//파스칼 표기법 사용 : 대문자로 시작, 이후 음절의 시작을 대문자. ex) HelloJavaWorld
	public static void main(String[] args) {
		
		//정수형 타입 선언
		int nt = 10;
		byte bt = 20;
		//실수
		double dbl = 30.3111;
		float flt = 33.12f;
		//문자
		char chr = 'A';
		//문자열
		String str = "함다민 사랑해";
		//논리형
		boolean bln = true;
		
		//문장이 끝나고 줄이 바뀌는 명령
		System.out.println(nt);
		System.out.println(bt);
		System.out.println(dbl);
		System.out.println(flt);
		System.out.println(str);
		System.out.println(bln);
	}

}
