package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.modeles.ServiceQuestionnaire;

public abstract class ServiceQuestionnaireVideMock implements ServiceQuestionnaire{
	 public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
		 	QuestionDTO questionCorrect = new QuestionDTO(1,0,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?",null,1,"Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.","https://fr.wikipedia.org/wiki/Matériel_de_golf");

	        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
	        listQuestionsCorrect.add(questionCorrect);
	        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
	        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
	        reponseCorrect.add(leQuestionnaireCorrect);
	        return reponseCorrect;
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
		public List<StatsQuestionDTO> maJStatQuestion(QuestionnaireDTO qDTO) {
			// TODO Auto-generated method stub
			return null;
		}

		

		@Override
		public void ajouterQuestionnaire(QuestionnaireBO bo, int index) {
			// TODO Auto-generated method stub
			
		}
}
