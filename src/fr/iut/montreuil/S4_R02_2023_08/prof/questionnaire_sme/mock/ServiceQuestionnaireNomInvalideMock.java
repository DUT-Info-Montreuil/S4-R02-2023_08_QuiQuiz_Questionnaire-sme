package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.modeles.ServiceQuestionnaire;

public class ServiceQuestionnaireNomInvalideMock implements ServiceQuestionnaire {
	public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
        return null;
    }

    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }

	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionnaireDTO FournirUnQuestionnaire(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void maJStatQuestion(QuestionDTO q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fournirStatQuestion(QuestionDTO q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterQuestionnaire(QuestionnaireBO bo, int index) {
		// TODO Auto-generated method stub
		
	}
}
