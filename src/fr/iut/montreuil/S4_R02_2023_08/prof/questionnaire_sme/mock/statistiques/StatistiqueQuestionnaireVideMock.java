package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock.statistiques;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;

public class StatistiqueQuestionnaireVideMock {
	
	private List<StatsQuestionDTO> listStatQuestionDTO;
	private StatsQuestionnaireDTO statistiquesQuestionnaireDTO;
	private StatsQuestionDTO statQuestion1, statQuestion2, statQuestion3;
	
	public List<StatsQuestionDTO> fournirStatsQuestions(QuestionnaireDTO q){
		/*this.listStatQuestionDTO = new ArrayList<>();
		this.statQuestion1 = new StatQuestionDTO(0, 0);
		this.statQuestion2 = new StatQuestionDTO(1, 0);
		this.statQuestion3 = new StatQuestionDTO(2, 0);
		this.listStatQuestionDTO.add(statQuestion1);
		this.listStatQuestionDTO.add(statQuestion2);
		this.listStatQuestionDTO.add(statQuestion3);*/
		return this.listStatQuestionDTO;
    	
    }

	public StatistiqueQuestionnaireVideMock() {
		super();
		this.listStatQuestionDTO = new ArrayList<>();
		this.statistiquesQuestionnaireDTO = new StatsQuestionnaireDTO(0);

	}

	public List<StatsQuestionDTO> majStatQuestions(QuestionnaireDTO q){
		return null;
		
	}
}
