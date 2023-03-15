package fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.bo;

import java.util.ArrayList;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.exceptions.FichierVideExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class QuestionnaireBO {
	private String nomFichier; // les fichiers doivent être placés dans ce répertoire src/fr/iut/montreuil/S04_R02_2023_08/prof/questionnaire_sme/resources/
    private ArrayList<ArrayList<String[]>> listQuestionnaires = new ArrayList<>();
    private int nbQuestionnaires = 0;

    public QuestionnaireBO(String nomFichier, char separateur) throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions, CsvValidationException, IOException {
        this.nomFichier = nomFichier;

        CSVParser parser = new CSVParserBuilder().withSeparator(separateur).build();
		CSVReader reader = new CSVReaderBuilder(new FileReader("src/fr/iut/montreuil/S04_R02_2023_08/prof/questionnaire_sme/resources/" + nomFichier))
		        .withCSVParser(parser)
		        .build();

		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) { // nextLine[] est un tableau des valeurs de la ligne
		    int questionnaireIndex = returnCleanNumber(nextLine[0]);
		    while(listQuestionnaires.size() < questionnaireIndex) {
		        listQuestionnaires.add(new ArrayList<>());
		    }
		    listQuestionnaires.get(questionnaireIndex - 1).add(nextLine);

		    if(questionnaireIndex > nbQuestionnaires) {
		        nbQuestionnaires = questionnaireIndex;
		    }
		}
    }

    private int returnCleanNumber(String index){ // prend le premier numéro trouvé à partir du premier index car des caractères bizarres sont parfois trouvés dans le fichier
        for(int i = 0; i < index.length(); i++){
            if(Character.isDigit(index.charAt(i))){
                return Integer.parseInt(index.substring(i));
            }
        }
        return -1;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    @Override
    public String toString() {
        return "FichierQuestionnairesBO{" +
                "nomFichier='" + nomFichier + '\'' +
                ", listQuestionnaires=" + listQuestionnaires +
                ", nbQuestionnaires=" + nbQuestionnaires +
                '}';
    }

    public ArrayList<ArrayList<String[]>> getRawQuestionnaires() {
        return listQuestionnaires;
    }

    public int getNbQuestionnaires() {
        return nbQuestionnaires;
    }
}
