package variables;

public class TypeTransform {
//	# 타입변환
//	- 데이터 타입을 다른 데이터 타입으로 변환하는 것
//	두가지로 나뉘며 하나는 자동타입변환, 다른 하나는 강제타입변환이다
//		{
//		## 자동타입변환
//		- 실행 도중 자동으로 타입이 변환되는 것
//		큰 크기 타입 = 작은 크기 타입 이있으면 작은크기 타입이 큰크기 타입으로 변환됨
//		- 구분은 메모리 크기로 된다.
//		byte(1)<short(2)<char(2)<int(4)<long(8)<float(4)<double(8)
//		(long보다 float가 더 큰 이유는 표연 범위가 더 크기떄문)
//		ex1) int intValue = 200;
//			double doubleValue = intValue; // 200.0으로 출력
//		
//		ex2) char charValue = 'A';
//			int intValue = charValue; // 65저장됨 유니코드값 저장.
//		// 예외상황	
//		ex3) byte = byteVlaue = 65;
//			char charValue = byteValue; (x) // 컴파일 에러 char의 범위는 0~65535 양수지만 byte의 음수가 있으므로 변환 x
//			char charData = (char) byteData; (o) // 강제 변환
//		}
		public static void promotionExample() {
		byte byteValue = 10;
		int intValue = byteValue;   // int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;       // int <- char
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 500;
		long longValue = intValue;   // long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // double <- int
		System.out.println(doubleValue);
		}
	
	
//		{
//			## 강제타입변환
//			-큰 크기타입은 작은크기타입으로 자동변환 할 수 없다. 
//			하지만 큰 데이터타입을 작은데이터타입으로 쪼개서 저장하는것을 
//			강제변환 (casting)이라고 한다. 강제변환은 (쪼개는 단위)을 사용
//			
//			ex) int intValue = 103029770;
//				byte byteValue = (byte) intValue
//				- intValue는 4byte이므로 (byte)캐스팅연산자를 사용하여 
//				intValue를 1byte씩 쪼개고, 끝에있는 byteValue만 변수에 저장.
//				
//			ex) long longValue = 300;
//			int intValue = (int) longValue; // intvalue는 300이 그대로 저장
//			
//			ex) int intValue = 'A';
//				char charValue = (char) intValue;
//				System.out.println(charValue); // 유니코드에 해당하는 문자가 출력
//				
//			ex) double doubleValue = 3.14;
//				int intValue = (int) doubleValue; // intValue는 정수 부분인 3만 저장됨.
//					
//				 
//		}
	public static void main(String[] args) {
	promotionExample();	

	}

}
