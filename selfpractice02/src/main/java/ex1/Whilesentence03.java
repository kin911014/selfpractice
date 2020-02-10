package ex1;

public class Whilesentence03 {

	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		 
        int output = 0;
        while(true)
        {
               output += input ;
               input--;
               if(input == 0) {
					  break;
				      }	
        }
        System.out.println(output);
	}
}
//		for (int i = 0; i < 5; i++){
//			for (int j = 0; j <= i; j++){
//				System.out.print("X");
//			}
//			System.out.println();
//		}
//	}
