package com.atcoffeebreak.quizzer.question;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Builder class for the {@link Question} class.
 */
public class QuestionBuilder {
    private long id;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;
    private String hint;
    private Date lastUpdated;

    public QuestionBuilder() {
        // empty
    }

    /**
     * Builder for {@link Question}
     *
     * @return a {@link Question} instance.
     */
    public Question build() {
        if ((id < 0)
                || ("".equals(this.question) || this.question.trim().isEmpty())
                || ("".equals(this.answerA) || this.answerA.trim().isEmpty())
                || ("".equals(this.answerB) || this.answerB.trim().isEmpty())
                || ("".equals(this.answerC) || this.answerC.trim().isEmpty())
                || ("".equals(this.answerD) || this.answerD.trim().isEmpty())
                || ("".equals(this.correctAnswer) || this.correctAnswer.trim().isEmpty())
                || ("".equals(this.hint) || this.hint.trim().isEmpty())
                || (this.lastUpdated == null)
        ) {
            throw new IllegalStateException("Question builder not in buildable state.");
        }

        return new Question(
                this.id,
                this.question,
                this.answerA,
                this.answerB,
                this.answerC,
                this.answerD,
                this.correctAnswer,
                this.hint,
                this.lastUpdated
        );
    }

    /**
     * Setter for {@link QuestionBuilder#id}
     *
     * @param id the unique id for the {@link Question}
     * @return
     */
    public QuestionBuilder id(long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id can't be less than 0");
        }
        this.id = id;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#question}
     *
     * @param question the  question for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder question(String question) {
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Question cannot be null or empty.");
        }
        this.question = question;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#answerA}
     *
     * @param answerA the first possible answer for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder answerA(String answerA) {
        if (answerA == null || answerA.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer A cannot be null or empty.");
        }
        this.answerA = answerA;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#answerB}
     *
     * @param answerB the second possible answer for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder answerB(String answerB) {
        if (answerB == null || answerB.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer B cannot be null or empty.");
        }
        this.answerB = answerB;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#answerC}
     *
     * @param answerC the unique id for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder answerC(String answerC) {
        if (answerC == null || answerC.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer C cannot be null or empty.");
        }
        this.answerC = answerC;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#answerD}
     *
     * @param answerD the unique id for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder answerD(String answerD) {
        if (answerD == null || answerD.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer D cannot be null or empty.");
        }
        this.answerD = answerD;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#correctAnswer}
     *
     * @param correctAnswer the correct answer for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder correctAnswer(String correctAnswer) {
        if (correctAnswer == null || correctAnswer.trim().isEmpty()) {
            throw new IllegalArgumentException("Correct answer cannot be null or empty.");
        }
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        if (!set.contains(correctAnswer)) {
            throw new IllegalArgumentException("Correct answer must be 'A', 'B', 'C' or 'D'.");
        }
        this.correctAnswer = correctAnswer;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#hint}
     *
     * @param hint the hint for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder hint(String hint) {
        if (hint == null || hint.trim().isEmpty()) {
            throw new IllegalArgumentException("Hint cannot be null or empty.");
        }
        this.hint = hint;
        return this;
    }

    /**
     * Setter for {@link QuestionBuilder#lastUpdated}
     *
     * @param lastUpdated the date the question was last updated for the {@link Question}
     * @return a {@link QuestionBuilder} instance
     */
    public QuestionBuilder lastUpdated(Date lastUpdated) {
        if (lastUpdated == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }
        this.lastUpdated = lastUpdated;
        return this;
    }
}
