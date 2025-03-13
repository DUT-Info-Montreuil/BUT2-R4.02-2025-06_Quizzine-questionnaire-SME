package org.univ_paris8.iut.montreuil.qdev.tp2025.gr06.jeuQuizz.entities.dtos;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr06.jeuQuizz.utils.enums.Difficulte;

public class QuestionDTO {
    private int numQuestionnaire;
    private String langue;
    private Difficulte difficulte;
    private String question;
    private String reponse;
    private String explication;
    private String reference;

    public QuestionDTO(int numQuestionnaire, String langue, Difficulte difficulte, String question, String reponse,
                       String explication, String reference){
        this.numQuestionnaire = numQuestionnaire;
        this.langue = langue;
        this.difficulte = difficulte;
        this.question = question;
        this.reponse = reponse;
        this.explication = explication;
        this.reference = reference;
    }
}
