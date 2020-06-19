package esercizio5;

public class Question {
	
	protected String question;
	protected String answer;
	protected int pts;
	
	public Question(String question, String answer, int pts) {
		this.question = question;
		this.answer = answer;
		this.pts = pts;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion() {
		System.out.println("\nRispondi alla domanda aperta: ");
		return this.question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	
	public int ask(String answer) {
		if(this.answer.equals(answer.toLowerCase()))
			return this.pts;
		return 0;
	}

}
