package org.univ_paris8.iut.montreuil.qdev.tp2025.gr06.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr06.jeuQuizz.entities.dtos.QuestionnaireDTO;

public interface QuestionnaireService {
    public QuestionnaireDTO ChargerQuestionnaire(String urlCSV);
}
