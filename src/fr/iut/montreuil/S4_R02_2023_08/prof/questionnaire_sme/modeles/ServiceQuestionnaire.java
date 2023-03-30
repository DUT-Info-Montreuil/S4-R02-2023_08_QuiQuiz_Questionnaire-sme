package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.modeles;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierVideExceptions;

public interface ServiceQuestionnaire {
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire ();
    public QuestionnaireDTO FournirUnQuestionnaire (int i);
    public List<StatsQuestionnaireDTO> maJStatQuestion (int idQuestionnaire);
    public List<StatsQuestionnaireDTO> fournirStatQuestion(int idQuestionnaire);
    public void ajouterQuestionnaire(QuestionnaireBO bo, int index);
	
	
}
