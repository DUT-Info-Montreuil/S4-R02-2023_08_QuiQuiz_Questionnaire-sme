package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;
import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;

public class QuestionnaireDTO {
	private ArrayList<QuestionDTO> questions;
	private int idQuestionnaire, nbBonneReponse, nbQuestion;
	
	public QuestionnaireDTO(ArrayList<QuestionDTO> questions, int idQuestionnaire) {
		super();
		this.questions = questions;
		this.idQuestionnaire = idQuestionnaire;
	
	}
	 public QuestionnaireDTO (QuestionnaireBO o, int questionnaireID) {
	        if(questionnaireID > o.getNbQuestionnaires() || questionnaireID < 0)
	            throw new IllegalArgumentException("Le numero de questionnaire n'existe pas");

	        questions = new ArrayList<QuestionDTO>();
	        ArrayList<ArrayList<String[]>> questionnaires = o.getRawQuestionnaires();
	        for(String[] rawQuestion : questionnaires.get(questionnaireID - 1)) {
	            questions.add(new QuestionDTO(rawQuestion));
	        }
	    }
	public QuestionnaireDTO(List<QuestionDTO> listQuestionsCorrect) {
		// TODO Auto-generated constructor stub
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
