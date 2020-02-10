package variables;

public class Variable_Datatype {

//		# 데이터타입
//		모든 변수에는 타입이 있고, 타입에 따라 저장할 수 있는 값의 종류와 범위가 다르다.
//		변수 선언 시 주어진 타입은 사용 도중에는 변경할 수 없다.
//		
//		{
//			## 기본(primitive)타입
//			정수,실수,문자,논리리터럴을 직접 저장하는 타입
//			정수- byte /1byte/ 8bit/ -128~127
//			   - char /2byte/ 16bit/ 0~2의 16승-1 
//			   - short /2byte/ 16bit/ -32,768~32,767
//			   - int /4byte/ 32bit/ -2의 31승 ~ (2의31승-1)
//			   - long /8byte/ 64it/ -2의 63승 ~ (2의승-1)
//			 
//			실수 - float /4byte/ 32bit/
//			   - double / 8byte / 64bit
//			
//			논리 - boolean 1byte / 8byte / true, false
//			
//			메모리에는 0과 1을 저장하는 최소 기억 단위인 비트가 있다.
//			8개의 비트를 묶어 바이트라고 하며 기본타입은 메모리크기(바이트크기)로 값을 저장.
//			바이트 크기가 클수록 표현값의 범위가 크다.
//		}
//		{
//			## 정수타입
//			자바는 기본적으로 int 타입으로 정수연산 수행
//			byte short는 메모리크기가 작아 메모리 절약은 가능하나 연산시 범위초과로 잘못된 결과를 얻는다.
//			
//			### byte타입
//			색상정보 및 파일 또는 이미지 등의 이진(바이너리)데이터를 처리할 때 사용
//			양수가 2의 7승 -1인 이유는 0이 포함되었기 떄문
//			2진수의 01111111 = 십진수의 127에서 0은 양의 정수, 1은 음의 정수를 의미

//		}

		public static void byteType() {
			// byte type 변수
			byte var1 = -128;
			byte var2 = -30;
			byte var3 = 0;
			byte var4 = 127;
			// byte var5 = 128; - 컴파일 에러
	
			System.out.println(var1);
			System.out.println(var2);
			System.out.println(var3);
			System.out.println(var4);
			// System.out.println(var5); - 에러
	
			// byte type 변수 2
			byte v1 = 125;
			int v2 = 125;
			for (int i = 0; i < 5; i++) {
				// byte변수는 127을 넘어서는 순간 최소값인 -128부터 다시저장
				v1++;
				v2++;
				System.out.println("v1: " + v1 + "\t" + "v2: " + v2);
				// 결과 v1: -128 v2: 128
				// v1: -127 v2: 129
				// v1: -126 v2: 130
			}
		}
	
//		{
//			## char 타입
//			유니코드로 처리, 문자를 코드표로 정한 국제 표준 규약.
//		}
	
		public static void charType() {
			char c1 =  'A'; 	 // 문자를 직접 저장
			char c2 =  65; 		 // 10진수로 저장
			char c3 =  '\u0041'; // 16진수로 저장
			
			int uniCode = c1;
			
			char c4 = '가';
			char c5 = 44032;
			char c6 = '\uac00';
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);
			System.out.println(c6);
			System.out.println(uniCode);
			
		}
//		{ 
//			## short 타입
//			2byte 16bit로 표현되는 정수값을 저장하는 데이터타입.
//			c언어와 호환을 위해 사용되며 자바에서는 잘 사용 x
//		}
//		
//		{
//			# int 타입
//			4byte 32bit로표현되는 정수값을 저장하는 데이터타입
//			-2의31승~ 2의31승-1
//			메모리가 크게 부족하지 않다면 int로 코드를 짜자
//		}
		public static void intType() {
			int v1= 10; // 10진수로 저장
			int v2= 012; // 8진수로 저장
			int v3= 0xA; // 16진수로 저장
			
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);
			// 결과 모두 10
		}
//		{
//			## long 타입
//			8byte 64bit로 표현되는 정수값을 저장하는 데이터타입
//			수치가 큰 데이터를 다루는 프로그램에서는 long타입이 필수사용(은행 및 우주관련프로그램)
//			long 타입의 변수를 초기화 할 때 정수값 뒤에 L, l을 붙인다.(일반적으로 L사용)
//			int타입의 저장범위를 넘어서기 때문에 필수로 붙여준다. 
//		}
		public static void longType() {
			long v1 = 10;
			long v2 = 20L;
		//	long v3 = 100000000000000; - 에러 
			long v4 = 100000000000000L;
			
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v4);
			
		}
//		{
//			## 실수타입 (float, double)
//			실수는 정수와 달리 소수점방식으로 저장
//			높은 정밀도를 요구하는계산은 double사용
//		}
		public static void doubleType() {
			double v1 = 3.14;
		//	float v2 = 3.14; - 컴파일에러 
			float v3 = 3.14f;
			
			int v4 = 3000000; // 3000000
			double v5 = 3e6; // 3000000
			float v6 = 3e6f; // 3000000
			double v7 = 2e-3; // 0.002
			
		}
		
//		{
//			## 논리타입(boolean)
//			1byte 8bit로 표현되는 논리값 저장 데이터 타입
//		}
		
	public static void booleanType(){
		// if는 true가 실행, else는 false가 실행한다.
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다.");
		}
	}
	public static void main(String[] args) {
		byteType();
		charType();
		intType();
		longType();
		doubleType();
		booleanType();
	}

	
}
