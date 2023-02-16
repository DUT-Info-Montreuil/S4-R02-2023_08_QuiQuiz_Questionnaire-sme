package fr.iut.montreuil.S4_R02_08.prof.questionnaire_sme.modeles;
import java.util.ArrayList;

public class QuestionnaireDTO {
	private ArrayList<QuestionDTO> questions;
	private int idQuestionnaire, nbBonneReponse, nbQuestion;
	
	public QuestionnaireDTO(ArrayList<QuestionDTO> questions, int idQuestionnaire, int nbBonneReponse, int nbQuestion) {
		super();
		this.questions = questions;
		this.idQuestionnaire = idQuestionnaire;
		this.nbBonneReponse = nbBonneReponse;
		this.nbQuestion = nbQuestion;
	}
	
	public ArrayList<QuestionDTO> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<QuestionDTO> questions) {
		this.questions = questions;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}
	public int getNbBonneReponse() {
		return nbBonneReponse;
	}
	public void setNbBonneReponse(int nbBonneReponse) {
		this.nbBonneReponse = nbBonneReponse;
	}
	public int getNbQuestion() {
		return nbQuestion;
	}
	public void setNbQuestion(int nbQuestion) {
		this.nbQuestion = nbQuestion;
	}
	
}
