package exam18;

public class ncs_18 {

	public static void main(String[] args) {
		
	String[] object = {"이름", "국어", "영어", "수학", "합계", "평균"};
	String[] student_name = {"손흥민", "조규성", "이강인"};
	
	int[][] score = {{100, 93, 97}, {85, 79, 89}, {91, 81, 86}};
	int array[] = new int[3];
	
	for(String t:object) {
		System.out.print(t+"\t");
	}
	System.out.println();
	for(int i=0; i<31; i++) {
		System.out.print("ㅡ");
	}
	System.out.println();
	for(int i=0; i<score.length; i++) {
		System.out.print(student_name[i]+"\t");
		for(int j=0; j<score[i].length; j++) {
			System.out.print(score[i][j]+"\t");
			array[j] += score[i][j];
		}
		int sum_value=0;
		for(int j=0; j<score[i].length; j++) {
			sum_value+=score[i][j];
		}
		System.out.print(sum_value+"\t");
		int average_value=0;
		for(int j=0; j<score[i].length; j++) {
			average_value+=score[i][j];
		}
		System.out.print(average_value/3+"\t");
		System.out.println();
	}
	for(int m=0; m<31; m++) {
		System.out.print("ㅡ");
	}
	System.out.println();
	System.out.print("\t");
	for(int r=0; r<3; r++)
		System.out.print(array[r] + "\t");
	}
}