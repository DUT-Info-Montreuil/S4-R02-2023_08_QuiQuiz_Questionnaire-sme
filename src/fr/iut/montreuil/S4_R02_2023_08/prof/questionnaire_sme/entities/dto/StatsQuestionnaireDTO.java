package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class StatsQuestionnaireDTO {
	
	private int idQuestionnaire;
	private int nbPartiesJouees;
	private List<StatsQuestionDTO> statsQuestions;
	

	
	public List<StatsQuestionDTO> getStatsQuestions() {
		return statsQuestions;
	}

	public void setStatsQuestions(List<StatsQuestionDTO> statsQuestions) {
		this.statsQuestions = statsQuestions;
	}

	public StatsQuestionnaireDTO(int idQuestionnaire,List<StatsQuestionDTO> statsQuestions) {
		super();
		this.idQuestionnaire = idQuestionnaire;
		this.nbPartiesJouees = 0;
		this.statsQuestions = statsQuestions;
	}
	
	public StatsQuestionnaireDTO(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
		this.nbPartiesJouees = 0;
		this.statsQuestions = new ArrayList<>();
	}

	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}

	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}

	public int getNbPartiesJouees() {
		return nbPartiesJouees;
	}

	public void setNbPartiesJouees(int nbPartiesJouees) {
		this.nbPartiesJouees = nbPartiesJouees;
	}




}
