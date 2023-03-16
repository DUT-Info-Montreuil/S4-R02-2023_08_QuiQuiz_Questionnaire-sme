package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;

public class QuestionDTO {
	private int numQuestion, idQuestionnaire, dificulte;
	private String langue, libelleQuestion, reponse,explication, reference;
	
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
	public QuestionDTO(String[] questions) {
		this.idQuestionnaire=Integer.parseInt(questions[0]);
		this.numQuestion=Integer.parseInt(questions[1]);
        this.langue=questions[2];
        this.libelleQuestion=questions[3];
        this.reponse=questions[4];
        this.dificulte=Integer.parseInt(questions[5]);
        this.explication=questions[6];
        this.reference=questions[7];
        
        }

	public QuestionDTO(int idQuestionnaire2, int idQuestion2, String langue2, String question2, String reponse2,
			int dificulte2, String explication2, String reference2) {
		this.numQuestion = idQuestion2;
		this.idQuestionnaire = idQuestionnaire2;
		this.dificulte = dificulte2;
		this.langue = langue2;
		this.libelleQuestion = question2;
		this.reponse = reponse2;
		this.explication = explication2;
		this.reference = reference2;	
	}

	public int getNumQuestion() {
		return numQuestion;
	}
	
	public void setNumQuestion(int idQuestion) {
		this.numQuestion = idQuestion;
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
	public String getLibelleQuestion() {
		return libelleQuestion;
	}
	public void setLibelleQuestion(String question) {
		this.libelleQuestion = question;
	}
	public String getReponse() {
		return reponse;
	}
	@Override
	public String toString() {
		return "QuestionDTO [idQuestion=" + numQuestion + ", idQuestionnaire=" + idQuestionnaire + ", dificulte="
				+ dificulte + ", langue=" + langue + ", question=" + libelleQuestion + ", reponse=" + reponse
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
