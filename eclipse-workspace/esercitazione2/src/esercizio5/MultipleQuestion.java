package esercizio5;

public class MultipleQuestion extends QuestionNumeric {
	
	private static final int nAnswer = 3;
	private String[] answers = new String[nAnswer];

	public MultipleQuestion(String question, String[] multipleAnswer, int pts) {

		super(question, null, pts);
		this.answers=multipleAnswer;
	
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	
	public String getQuestion() {
		System.out.println("\nRispondi alla domanda usando solo numeri: ");
		return this.question;
	}
	
	public int ask(String answer) {
		
		int tempPts=0;

		try {
			for(int i=0; i<nAnswer; i++) {
	
				if(Integer.parseInt(this.answers[i])==Integer.parseInt(answer.toLowerCase())) {
					tempPts+=this.pts;
				}
			}
		}
		catch(NumberFormatException e) {
			return -2;

		}
		return tempPts;

}

}
