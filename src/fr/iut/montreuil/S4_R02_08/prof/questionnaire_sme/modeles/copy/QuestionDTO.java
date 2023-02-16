package fr.iut.montreuil.S4_R02_08.prof.questionnaire_sme.modeles.copy;

public class QuestionDTO {
	private int idQuestion, idQuestionnaire, dificulte;
	private String langue, question, reponse,explication, reference;
	
	public QuestionDTO(int idQuestion, int idQuestionnaire, int dificulte, String langue, String question,
			String reponse, String explication, String reference) {
		super();
		this.idQuestion = idQuestion;
		this.idQuestionnaire = idQuestionnaire;
		this.dificulte = dificulte;
		this.langue = langue;
		this.question = question;
		this.reponse = reponse;
		this.explication = explication;
		this.reference = reference;
	}
	
	public int getIdQuestion() {
		return idQuestion;
	}
	
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}
	public int getDificulte() {
		return dificulte;
	}
	public void setDificulte(int dificulte) {
		this.dificulte = dificulte;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getExplication() {
		return explication;
	}
	public void setExplication(String explication) {
		this.explication = explication;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
}
