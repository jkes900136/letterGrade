package letterGrade;
import java.util.Scanner;
import java.io.*;
public class LetterGrade {
	public static char letterGrade(int score) {
		char grade;
		if (score <0 || score > 100)
			grade = 'X';
		else if (score>=90 && score <=100)
			grade = 'A';
		else if (score>=80 && score <90)
			grade = 'B';
		else if (score>=70 && score <80)
			grade = 'C';
		else if (score>=60 && score <70)
			grade = 'D';
		else
			grade ='F';
		return grade;
	}
	public static void main(String[] args) {
		getBoundIntegerFromUser(System.in, System.out);
		
	}
	public static char getBoundIntegerFromUser(InputStream in,PrintStream out) {
		int score=0;
		char result;
		Scanner scanner = new Scanner(in);
		out.println("Please enter a number score:");
		score=scanner.nextInt();
		result=letterGrade(score);
		out.println(result);
		scanner.close();
		return result;
	}
}
