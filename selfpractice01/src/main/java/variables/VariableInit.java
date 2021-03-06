package variables;

public class VariableInit {

//		 #변수
//		
//		 ## 변수의 선언
//		 int score;  // 변수 선언
//		 자바언어에서 =은 우측의 값을 좌측 변수에 저장한다는 의미
//		 변수에 초기값을 주는 행위를 변수의 초기화라고 한다.
//		 score = 90; // 값 저장 -> 변수의 초기화
//		
//		 변수 선언과 초기화는 동시에 가능
//		 소스코드 내에서 직접 입력된 값을 리터럴(literal)이라 한다. 상수의 의미이지만 constant와 구분하기 위해 사용.
//		 int score = 90;
//		
//		 ##정수 리터럴
//		 소수점 없는 정수 리터럴은 10진수로 간주 ex) 0, 75, -100
//		 0으로 시작되는 리터럴은 8진수 ex) 02, -04
//		 0x 또는 0X로 시작, 숫자나 알파벳 대,소문자로 구성된 리터럴은 16진수 ex)0x5 0xa 0xb3 0xac08 
//		 정수 리터럴을 저장할 수 있는 타입은 byte, char, short, int, long
//		
//		 ## 실수 리터럴
//		 소수점이 있는리터럴은 10진수 실수 ex) 0.25 -3.14
//		 대문자 or 소문자 E, e가 있는 리터럴은 10진수 지수와가수로 간주  ex) 5E7 => 5 x 10의7승  | 0.12E-5 x 10의 -5승
//		실수 리터럴 저장 타입은 float, double 등

//		## 문자 리터럴
//		작은 따옴표로 묶은 텍스트는 문자 리터럴 ex) 'g' '한' '\t' '\n'
//		## 이스케이프(escape)
//		역슬레쉬(\)가 붙은 문자 리터럴은 escape 문자 
//		ex)\t: 수평 탭 , \n: 줄바꿈, \r: 리턴, '\"': 큰따옴표, '\'': 작은 따옴표,  '\\': \,
//
//		## 문자열 리터럴
//		""는 문자열 리터럴, 텍스트 없이 ""만 사용되어도 문자열로 간주.
//		ex/ "대한민국", "탭 만큼 이동 \t 합니다", "한줄 내려 쓰기 \n 합니다."
//		문자열 저장 타입은 String
//		
//		## 논리 리터럴
//		true와 false는 논리리터럴
//		저장 타입은 boolean

//		## 변수값 읽기
//		변수는 초기화가 되어야 읽을 수 있다. 
//		ex) int value = 30; - 변수 value가 30으로 초기화 
//			int result = value + 10; - value값을 읽고 10을 더한 값(40)을 result에 저장
//			System.out.println(result); - 변수 result 값을 읽고 콘솔에 출력
//			
//		## 변수 사용 범위
//		 변수는 클래스, 생성자, 메소드의 {} 사이에서 선언됨
//		 메소드 블록 안에서 선언된 변수는 로컬 변수라 한다.
//		 로컬 변수는 메소드 실행이 끝나면 메모리에서 자동으로 없어진다.
//		 조건문(if, for, while)은 제어문이라고 하며, 제어문블록에서
//		 선언된 변수는 해당 블록 내에서만 사용 가능 밖에서 사용 x
//		 변수는 선언 위치를 생각해야한다.
//		 메소드 블록 어떤 위치에서건 사용하게 하려면 첫머리에 선언 할 것.
		 public static void main(String[] args) {
			 int v1 = 15;
			 if(v1>10) {
				 int v2 = v1 - 10;
			 }
	}		// int v3 = v1 + v2 + 5;  v2 변수를 사용할 수 없어 컴파일 에러 발생
}
