package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock.statistiques.StatistiqueQuestionnaireRempliMock;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock.statistiques.StatistiqueQuestionnaireVideMock;

class StatistiqueQuestionnaireTest {

	private List<StatsQuestionDTO> listStatQuestionDTO;
	private StatsQuestionnaireDTO statistiquesQuestionnaireDTO;
	private StatsQuestionDTO statQuestion1, statQuestion2, statQuestion3;
	private StatistiqueQuestionnaireVideMock statistiqueQuestionnaireVideMock;
	private StatistiqueQuestionnaireRempliMock statistiqueQuestionnaireRempliMock;
	
	@Test
	void fournirStatsQuestionsVideTest() {
		this.listStatQuestionDTO = new ArrayList<>();
		this.statistiqueQuestionnaireVideMock = new StatistiqueQuestionnaireVideMock();

		
		assertEquals(this.listStatQuestionDTO, this.statistiqueQuestionnaireVideMock.fournirStatsQuestions(null));

	}

	@Test
	void fournirStatsQuestionsRempliTest() {
		this.statistiqueQuestionnaireRempliMock = new StatistiqueQuestionnaireRempliMock();
		this.listStatQuestionDTO = new ArrayList<>();
		this.statQuestion1 = new StatsQuestionDTO(0);
		this.statQuestion2 = new StatsQuestionDTO(1);
		this.statQuestion3 = new StatsQuestionDTO(2);
		this.listStatQuestionDTO.add(statQuestion1);
		this.listStatQuestionDTO.add(statQuestion2);
		this.listStatQuestionDTO.add(statQuestion3);
		assertEquals(this.listStatQuestionDTO.get(0).getIdQuestion(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(0).getIdQuestion());
		assertEquals(this.listStatQuestionDTO.get(0).getNbBonnesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(0).getNbBonnesReponses());
		assertEquals(this.listStatQuestionDTO.get(0).getNbMauvaisesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(0).getNbMauvaisesReponses());
		assertEquals(this.listStatQuestionDTO.get(0).getNbReponsesNulles(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(0).getNbReponsesNulles());

		assertEquals(this.listStatQuestionDTO.get(1).getIdQuestion(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(1).getIdQuestion());
		assertEquals(this.listStatQuestionDTO.get(1).getNbBonnesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(1).getNbBonnesReponses());
		assertEquals(this.listStatQuestionDTO.get(1).getNbMauvaisesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(1).getNbMauvaisesReponses());
		assertEquals(this.listStatQuestionDTO.get(1).getNbReponsesNulles(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(1).getNbReponsesNulles());
		
		assertEquals(this.listStatQuestionDTO.get(2).getIdQuestion(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(2).getIdQuestion());
		assertEquals(this.listStatQuestionDTO.get(2).getNbBonnesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(2).getNbBonnesReponses());
		assertEquals(this.listStatQuestionDTO.get(2).getNbMauvaisesReponses(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(2).getNbMauvaisesReponses());
		assertEquals(this.listStatQuestionDTO.get(2).getNbReponsesNulles(), this.statistiqueQuestionnaireRempliMock.fournirStatsQuestions().get(2).getNbReponsesNulles());
	}
}
