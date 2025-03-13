package org.univ_paris8.iut.montreuil.qdev.tp2025.gr06.jeuQuizz.entities.dtos;

import java.util.ArrayList;

public class QuestionnaireDTO {
    private ArrayList<QuestionDTO> listeQuestions;

    public QuestionnaireDTO(ArrayList<QuestionDTO> listeQuestions){
        this.listeQuestions = listeQuestions;
    }
}
