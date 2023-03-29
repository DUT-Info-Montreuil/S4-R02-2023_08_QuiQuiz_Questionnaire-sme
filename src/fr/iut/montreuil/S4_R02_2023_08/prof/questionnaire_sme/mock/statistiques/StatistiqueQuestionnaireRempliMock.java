package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock.statistiques;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;

public class StatistiqueQuestionnaireRempliMock {
	
	private List<StatsQuestionDTO> listStatQuestionDTO;
	private StatsQuestionnaireDTO statistiquesQuestionnaireDTO;
	private StatsQuestionDTO statQuestion1, statQuestion2, statQuestion3;
	
	public StatistiqueQuestionnaireRempliMock() {
		super();
		this.listStatQuestionDTO = new ArrayList<>();
		this.statistiquesQuestionnaireDTO = new StatsQuestionnaireDTO(0);
		//this.statistiquesQuestionnaireDTO = statistiquesQuestionnaireDTO;
		
	}

	public List<StatsQuestionDTO> fournirStatsQuestions(){
		
		this.statQuestion1 = new StatsQuestionDTO(0);
		this.statQuestion2 = new StatsQuestionDTO(1);
		this.statQuestion3 = new StatsQuestionDTO(2);
		this.statistiquesQuestionnaireDTO.getStatsQuestions().add(statQuestion1);
		this.statistiquesQuestionnaireDTO.getStatsQuestions().add(statQuestion2);
		this.statistiquesQuestionnaireDTO.getStatsQuestions().add(statQuestion3);
		/*
		this.listStatQuestionDTO.add(statQuestion1);
		this.listStatQuestionDTO.add(statQuestion2);
		this.listStatQuestionDTO.add(statQuestion3);
		//this.statistiquesQuestionnaireDTO = new StatistiquesQuestionnaireDTO(0);
		return this.listStatQuestionDTO;*/
		return this.statistiquesQuestionnaireDTO.getStatsQuestions();
    	
    }

	public List<StatsQuestionDTO> majStatQuestions(QuestionnaireDTO q){
		return null;
		
	}
}
