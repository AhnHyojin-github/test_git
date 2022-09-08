package jv.exam10;

public class Test_1 {

	public static void main(String[] args) {

		for(int i=2; i < 10; i++) {
			System.out.println(i + "단 출력");
            
			for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}	
	}

}
