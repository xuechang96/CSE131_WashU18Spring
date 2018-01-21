package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name=ap.nextString("The name of student");
		double numParticipation=ap.nextInt("The number of participation points you received");
		double numQuiz=ap.nextInt("Your average quiz score");
		double numStudio=ap.nextInt("The number of studio points you received");
		double numLab=ap.nextInt("The number of lab points you received");
		double numExtension=ap.nextInt("The number of extension points you received");
		double numExam1=ap.nextInt("The number of exam one points you received");
		double numExam2=ap.nextInt("The number of exam two points you received");
		double numExam3=ap.nextInt("The number of exam three points you received");
		double totalScore=numParticipation*0.1+numQuiz*0.02+numStudio*0.08+numLab*0.25+numExtension*0.25+(numExam1+numExam2+numExam3)*0.1;
		int totalGrade=(int) totalScore;
		boolean gradeAttachment1=(totalGrade%10>=7);
		boolean gradeAttachment2=(totalGrade%10>=0&&totalGrade%10<7);
		System.out.println(name+": "+"Total score: "+totalScore+"; Grade for this course: "+totalGrade+" Plus: "+gradeAttachment1+" Minus: "+gradeAttachment2);

	}

}
