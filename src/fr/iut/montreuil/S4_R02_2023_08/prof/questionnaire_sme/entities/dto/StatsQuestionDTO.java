package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto;

public class StatsQuestionDTO {
	
	private int idQuestion;
	private int nbBonnesReponses;
	private int nbMauvaisesReponses;
	private int nbReponsesNulles;
	
	public StatsQuestionDTO(int idQuestion, int nbBonnesReponses, int nbMauvaisesReponses, int nbReponsesNulles) {
		super();
		this.idQuestion = idQuestion;
		this.nbBonnesReponses = nbBonnesReponses;
		this.nbMauvaisesReponses = nbMauvaisesReponses;
		this.nbReponsesNulles = nbReponsesNulles;
	}
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public int getNbBonnesReponses() {
		return nbBonnesReponses;
	}
	public void setNbBonnesReponses(int nbBonnesReponses) {
		this.nbBonnesReponses = nbBonnesReponses;
	}
	public int getNbMauvaisesReponses() {
		return nbMauvaisesReponses;
	}
	public void setNbMauvaisesReponses(int nbMauvaisesReponses) {
		this.nbMauvaisesReponses = nbMauvaisesReponses;
	}
	public int getNbReponsesNulles() {
		return nbReponsesNulles;
	}
	public void setNbReponsesNulles(int nbReponsesNulles) {
		this.nbReponsesNulles = nbReponsesNulles;
	}



}
