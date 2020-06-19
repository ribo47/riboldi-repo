package esercizio5;

import esercizo1.Car;
import esercizo1.Motorcycle;

public class QuestionNumeric extends Question{

	public QuestionNumeric(String question, String answer, int pts) {
		super(question, answer, pts);
	}
	
	public String getQuestion() {
		System.out.println("\nRispondi alla domanda usando solo numeri: ");
		return this.question;
	}

	public int ask(String answer) {
		try {
			
			if(Integer.parseInt(this.answer)==Integer.parseInt(answer.toLowerCase()))
				return this.pts;
		}catch(NumberFormatException e) {
			return -2;
		}
			
		return 0;

	}

}
