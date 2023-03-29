package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.modeles.ServiceQuestionnaire;

public class QuestionnaireImplementation implements ServiceQuestionnaire {
	private QuestionnaireBO questionnaireBO;
	private ArrayList<QuestionnaireDTO> questionnaires;

   


    public QuestionnaireImplementation(QuestionnaireBO qBO) {
        questionnaires = new ArrayList<QuestionnaireDTO>();
        for(int i = 0; i < qBO.getNbQuestionnaires(); i++) {
            questionnaires.add(new QuestionnaireDTO(qBO, i + 1));
        }
    }

   

	@Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire() { // donne la liste de question du questionnaire
        return questionnaires;
    }

    @Override
    public QuestionnaireDTO FournirUnQuestionnaire(int i) { // donne une question du questionnaire
        return questionnaires.get(i);
    }

    @Override
    public List<StatsQuestionDTO> maJStatQuestion(QuestionnaireDTO qDTO) {
		return null;
    }

    

    @Override
    public void ajouterQuestionnaire(QuestionnaireBO qBO, int index) {
        questionnaires.add(new QuestionnaireDTO(qBO, index));
    }

    @Override
    public List<StatsQuestionDTO> fournirStatQuestion(QuestionnaireDTO qDTO) {
    	List<StatsQuestionDTO> statsQuestions = new ArrayList<StatsQuestionDTO>();
    	for(QuestionDTO question : qDTO.getQuestions()) {
    		StatsQuestionDTO stats = new StatsQuestionDTO(question.getNumQuestion());
    		statsQuestions.add(stats);
    	}
    	return statsQuestions;
        
    }
    
	


	
}
