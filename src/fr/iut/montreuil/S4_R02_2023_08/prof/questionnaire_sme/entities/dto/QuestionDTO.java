package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;

public class QuestionDTO {
	private int idQuestion, idQuestionnaire, dificulte;
	private String langue, question, reponse,explication, reference;
	
/*	public QuestionDTO1(int idQuestionnaire, int idQuestion, String langue,  String question,
			String reponse,int dificulte, String explication, String reference) {
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
	*/
	public QuestionDTO(String[] rawQuestion) {
		this.idQuestionnaire=Integer.parseInt(rawQuestion[0]);
		this.idQuestion=Integer.parseInt(rawQuestion[1]);
        this.langue=rawQuestion[2];
        this.question=rawQuestion[3];
        this.reponse=rawQuestion[4];
        this.dificulte=Integer.parseInt(rawQuestion[5]);
        this.explication=rawQuestion[6];
        this.reference=rawQuestion[7];
        
        }

	public QuestionDTO(int idQuestionnaire2, int idQuestion2, String langue2, String question2, String reponse2,
			int dificulte2, String explication2, String reference2) {
		this.idQuestion = idQuestion2;
		this.idQuestionnaire = idQuestionnaire2;
		this.dificulte = dificulte2;
		this.langue = langue2;
		this.question = question2;
		this.reponse = reponse2;
		this.explication = explication2;
		this.reference = reference2;	
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
	@Override
	public String toString() {
		return "QuestionDTO [idQuestion=" + idQuestion + ", idQuestionnaire=" + idQuestionnaire + ", dificulte="
				+ dificulte + ", langue=" + langue + ", question=" + question + ", reponse=" + reponse
				+ ", explication=" + explication + ", reference=" + reference + "]";
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
