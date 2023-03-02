package Mcq;

import java.util.ArrayList;

public class FinalClass {
	public static void main (String args[]) {
		System.out.println("      Welcome to the Java MCQ test\n");
		DefaultQuestions defObj = new DefaultQuestions();
		
		//Questions and answers list
		
		String a1[] = {"int","byte","short","long"};
		defObj.Questions("Which of the following is smallest integer data type ?", a1, "byte");
		
		String a2[] = {"byte","enum","short","int"};
		defObj.Questions("Which of the following is not a primitive data type", a2, "enum");
		
		String a3[] = {"array","loop","function","exception"};
		defObj.Questions("A __________ statement allows us to execute a statement or group of statements multiple times", a3, "loop");
		
		String a4[] = {"for","do-while","while","None of the above"};
		defObj.Questions("A __________ loop statement in Java programming language repeatedly executes a target statement as long as a given condition is true.", a4, "while");
		
		String a5[] = {"TRUE","FALSE","Can be true or false","Can not say"};
		defObj.Questions("A for loop is useful when you know how many times a task is to be repeated.", a5, "TRUE");
		
		//Print the result
		defObj.printResultDefault();
	}
}
