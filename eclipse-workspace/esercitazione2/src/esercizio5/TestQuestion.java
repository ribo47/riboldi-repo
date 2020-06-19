package esercizio5;

import java.util.InputMismatchException;
import java.util.Scanner;

import esercizo1.Employee;

import java.util.Random;

public class TestQuestion {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] multipleAnswer1 = {"1", "2", "3"};
		String[] multipleAnswer2 = {"3", "5", "7"};
		
		Question[] questions=new Question[10];

		questions[1] = new Question("Capitale della spagna?", "madrid", 5);
		questions[5] = new Question("Capitale della francia?", "parigi", 4);
		questions[6] = new Question("Capitale della germania?", "berlino", 6);
		questions[7] = new Question("Capitale del portogallo?", "porto", 5);
		questions[2] = new QuestionYesNo("Capitale della spagna è madrid?", "si", 3);
		questions[3] = new QuestionNumeric("Quante regioni ci sono in Italia?", "20", 2);
		questions[4] = new MultipleQuestion("Numeri positivi prima del 4", multipleAnswer1, 6);
		questions[8] = new QuestionYesNo("Si può votoare a 16 anni?", "no", 2);
		questions[9] = new QuestionNumeric("Quanti metri ci sono in un km?", "1000", 4);
		questions[0] = new MultipleQuestion("I processori Intel possono essere i...?", multipleAnswer2, 2);

		
		String answer;
		int answerInt, i;
		boolean answerCorrect=false;
		i=random.nextInt(10);

		do {
			System.out.println(questions[i].getQuestion());
			answer = scanner.nextLine();
			answerInt=questions[i].ask(answer);
			if(answerInt==-1) 
				System.out.println("Devi rispondere solo con si o no");
			else if(answerInt==-2) 
				System.out.println("Devi rispondere con un numero");
			else {
				System.out.println("Punteggio "+answerInt);
				answerCorrect=true;
				i=random.nextInt(10);
			}
		}while(true);
		
		
		/*
		
		System.out.println("Rispondi alla domanda: ");
		
		System.out.println(questions[random.nextInt(10)].getQuestion());
		answer = scanner.nextLine();
		
		System.out.println(q1.ask(answer));
		
		do {
			System.out.println("Rispondi alla domanda con si o no: ");
			System.out.println(q2.getQuestion());
			answer = scanner.nextLine();
			answerInt=q2.ask(answer);
			if(answerInt==-1) 
				System.out.println("Devi rispondere solo con si o no");
			else {
				System.out.println("Punteggio "+answerInt);
				answerCorrect=true;
			}
		}while(answerCorrect==false);
		
		answerCorrect=false;
		do {
			System.out.println("Rispondi alla domanda con un numero: ");
			System.out.println(q3.getQuestion());
			answer = scanner.nextLine();
			answerInt=q3.ask(answer);
			if(answerInt==-1) 
				System.out.println("Devi rispondere con un numero");
			else {
				System.out.println("Punteggio "+answerInt);
				answerCorrect=true;
			}
			
		}while(answerCorrect==false);
		
		answerCorrect=false;
		do {
			
			System.out.println("Rispondi alla domanda con un numero (ci sono più risposte corrette) ");
			System.out.println(q4.getQuestion());
			answer = scanner.nextLine();
			answerInt=q4.ask(answer);
			if(answerInt==-1) 
				System.out.println("Devi rispondere con un numero");
			else {
				System.out.println("Punteggio "+answerInt);
				answerCorrect=true;
			}
			
		}while(answerCorrect==false);*/
		

		
	}

}
