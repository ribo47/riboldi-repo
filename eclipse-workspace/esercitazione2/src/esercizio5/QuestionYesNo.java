package esercizio5;

public class QuestionYesNo extends Question{

	public QuestionYesNo(String question, String answer, int pts) {
		super(question, answer, pts);
	}
	
	public String getQuestion() {
		System.out.println("\nRispondi alla domanda usando solo si o no: ");
		return this.question;
	}
	
	public int ask(String answer) {
		if(answer.toLowerCase().equals("si")||answer.toLowerCase().equals("no")) {
			if(this.answer.equals(answer.toLowerCase()))
				return this.getPts();
			return 0;
		}
		return -1;
		
	}

}
