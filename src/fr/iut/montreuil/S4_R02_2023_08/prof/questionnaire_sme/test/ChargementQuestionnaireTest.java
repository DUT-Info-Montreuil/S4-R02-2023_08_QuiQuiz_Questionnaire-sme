package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.impl.QuestionnaireImplementation;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.mock.ServiceQuestionnaireCorrectMock;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.modeles.ServiceQuestionnaire;


class ChargementQuestionnaireTest {

	private QuestionnaireDTO questionnaire, questionnaireTest;
	private QuestionnaireBO questionnaireBO;
	private QuestionDTO question1, question2, question3;
	private ArrayList<QuestionDTO> listeQuestionsTest;


	
	private ServiceQuestionnaire serviceQuestionnaireTest;
	
	@BeforeEach
    public void init(){
		
	        
    }
    
	
	@Test
	void fournirListeQuestionnairesCorrectTest() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions, CsvValidationException, IOException{
		this.question1 = new QuestionDTO(1,1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1,"Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.","https://fr.wikipedia.org/wiki/Matériel_de_golf");
       	this.question2 = new QuestionDTO(1,2,"fr","Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?","Badminton",1,"Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.","https://fr.wikipedia.org/wiki/Badminton");
		this.question3 = new QuestionDTO(1,3,"fr","Combien y a-t-il de joueurs sur le terrain dans une équipe de football ?","Onze",1,"Codifié par les Britanniques à la fin du XIXe siècle, le football s'est doté en 1904 d'une fédération internationale, la FIFA.","https://fr.wikipedia.org/wiki/Football");
		this.listeQuestionsTest = new ArrayList<>();
		this.listeQuestionsTest.add(question1);
		this.listeQuestionsTest.add(question2);
		this.listeQuestionsTest.add(question3);
		this.questionnaireTest = new QuestionnaireDTO(this.listeQuestionsTest, 1);
		this.questionnaireBO = new QuestionnaireBO("testChargementQuestionCorrect.csv", ';');
		assertEquals(this.questionnaireTest.getIdQuestionnaire(), this.questionnaire.getIdQuestionnaire());
		assertEquals(this.questionnaireTest.getQuestions().get(0).getQuestion(), this.questionnaire.getQuestions().get(0).getQuestion());

		//assertEquals(this.questionnaireTest.getIdQuestionnaire(), this.questionnaire.getIdQuestionnaire());
	
	}
	


	@Test
	void fournirListeQuestionnairesIncorrectTest() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions, CsvValidationException, IOException{
		this.question1 = new QuestionDTO(1,0,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?",null,1,"Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.","https://fr.wikipedia.org/wiki/Matériel_de_golf");
       	this.question2 = new QuestionDTO(1,2,"fr",null,null,1,"Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.","https://fr.wikipedia.org/wiki/Badminton");
		this.question3 = new QuestionDTO(1,3,"fr","Combien y a-t-il de joueurs sur le terrain dans une équipe de football ?",null,1,"Codifié par les Britanniques à la fin du XIXe siècle, le football s'est doté en 1904 d'une fédération internationale, la FIFA.","https://fr.wikipedia.org/wiki/Football");
		this.listeQuestionsTest = new ArrayList<>();
		this.listeQuestionsTest.add(question1);
		this.listeQuestionsTest.add(question2);
		this.listeQuestionsTest.add(question3);
		this.questionnaireTest = new QuestionnaireDTO(this.listeQuestionsTest, 1);
		this.questionnaireBO = new QuestionnaireBO("testChargementQuestionIncorrect.csv", ';');
		assertEquals(this.questionnaireTest.getIdQuestionnaire(), this.questionnaire.getIdQuestionnaire());
		assertEquals(this.questionnaireTest.getQuestions().get(0).getQuestion(), this.questionnaire.getQuestions().get(0).getQuestion());
	
	}
	@Test
	void fournirListeQuestionnairesVideTest() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions, CsvValidationException, IOException{
		this.question1 = new QuestionDTO(0, 0, null, null, null, 0, null, null);
		this.question1 = new QuestionDTO(0, 0, null, null, null, 0, null, null);
		this.question3 = new QuestionDTO(0, 0, null, null, null, 0, null, null);
		this.listeQuestionsTest = new ArrayList<>();
		this.listeQuestionsTest.add(question1);
		this.listeQuestionsTest.add(question2);
		this.listeQuestionsTest.add(question3);
		this.questionnaireTest = new QuestionnaireDTO(this.listeQuestionsTest, 1);
		this.questionnaireBO = new QuestionnaireBO("testChargementQuestionVide.csv", ';');
		assertEquals(this.questionnaireTest.getIdQuestionnaire(), this.questionnaire.getIdQuestionnaire());
		assertEquals(this.questionnaireTest.getQuestions().get(0).getQuestion(), this.questionnaire.getQuestions().get(0).getQuestion());
	
	}
	
	@Test
	void fournirUnQuestionnaireTest() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions{
	//	this.questionnaire = new QuestionnaireDTO(null, 0);
		//assertEquals(new QuestionnaireDTO(null, 0), this.questionnaire);
	}
	
	@Test
	void majStatQuestionsTest() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions{
		
	}
	
	@Test
	void fournirStatQuestions() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions{
		/* serviceQuestionnaireTest = new ServiceQuestionnaireCorrectMock();
			QuestionDTO questionCorrect = new QuestionDTO(1, 1, 3,"francais","De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ","Tee", null, null);
	        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
	        listQuestionsCorrect.add(questionCorrect);
	        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
	        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
	        reponseCorrect.add(leQuestionnaireCorrect);
	        List<QuestionnaireDTO> bonnereponse = serviceQuestionnaireTest.fournirListeQuestionnaire();
			this.listeQuestionnaire = new ArrayList<>();
			Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getIdQuestion(),bonnereponse.get(0).getQuestions().get(0).getQuestion());
	        Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getQuestion(),bonnereponse.get(0).getQuestions().get(0).getReponse());
*/
	}

}
