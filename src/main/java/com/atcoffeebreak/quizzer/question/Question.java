package com.atcoffeebreak.quizzer.question;

import java.util.Date;
import java.util.Objects;

/**
 * Represents a trivia question. This class is immutable and should be created by
 * the builder {@link QuestionBuilder}.
 */
public final class Question {
    private final long id;
    private final String question;
    private final String answerA;
    private final String answerB;
    private final String answerC;
    private final String answerD;
    private final String correctAnswer;
    private final String hint;
    private final Date lastUpdate;

    /**
     * Constructor. Intentionally package scope. This class should be created by
     * the builder {@link QuestionBuilder}.
     *
     * @param id
     * @param question
     * @param answerA
     * @param answerB
     * @param answerC
     * @param answerD
     * @param correctAnswer
     * @param hint
     */
    Question(long id, String question, String answerA, String answerB,
             String answerC, String answerD, String correctAnswer,
             String hint, Date lastUpdate) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.hint = hint;
        this.lastUpdate = lastUpdate;
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getHint() {
        return hint;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return id == question1.id && question.equals(question1.question) && answerA.equals(question1.answerA) && answerB.equals(question1.answerB) && answerC.equals(question1.answerC) && answerD.equals(question1.answerD) && correctAnswer.equals(question1.correctAnswer) && hint.equals(question1.hint) && lastUpdate.equals(question1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answerA, answerB, answerC, answerD, correctAnswer, hint, lastUpdate);
    }
}
