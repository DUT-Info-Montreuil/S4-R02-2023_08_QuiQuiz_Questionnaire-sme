package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;

public class StatsQuestionnaireDTO {
	
	private int idQuestionnaire;
	private int nbPartiesJouees;
	
	public StatsQuestionnaireDTO(int idQuestionnaire, int nbPartiesJouees) {
		super();
		this.idQuestionnaire = idQuestionnaire;
		this.nbPartiesJouees = nbPartiesJouees;
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
