package com.atcoffeebreak.quizzer.question;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QuestionBuilderTest {
    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        QuestionBuilder instance = new QuestionBuilder();
        Date currentDate = new Date();
        Question result = instance
                .id(1)
                .question("What was the first toy advertised on television?")
                .answerA("The Rubix Cube")
                .answerB("Mr. Potato Head")
                .answerC("Barbie")
                .answerD("A hula hoop")
                .correctAnswer("B")
                .hint("Use your head on this one")
                .lastUpdated(currentDate)
                .build();
        assertNotNull(" question build failed.", result);
        assertEquals("Ids do not match after build.", 1, result.getId());
        assertEquals("Questions do not match after build.",
                "What was the first toy advertised on television?", result.getQuestion());
        assertEquals("Answer A does not match after build.", "The Rubix Cube", result.getAnswerA());
        assertEquals("Answer B does not match after build.", "Mr. Potato Head", result.getAnswerB());
        assertEquals("Answer C does not match after build.", "Barbie", result.getAnswerC());
        assertEquals("Answer D does not match after build.", "A hula hoop", result.getAnswerD());
        assertEquals("Correct answer does not match after build.", "B", result.getCorrectAnswer());
        assertEquals("Hint does not match after build.", "Use your head on this one", result.getHint());
        assertEquals("Last updated does not match after build.", currentDate, result.getLastUpdate());
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildIdFail() {
        (new QuestionBuilder())
                .id(-1)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildQuestionFail() {
        (new QuestionBuilder())
                .question(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerAFail() {
        (new QuestionBuilder())
                .answerA(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerBFail() {
        (new QuestionBuilder())
                .answerB(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerCFail() {
        (new QuestionBuilder())
                .answerC(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerDFail() {
        (new QuestionBuilder())
                .answerD(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildHintFail() {
        (new QuestionBuilder())
                .hint(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildCorrectAnswerFail() {
        (new QuestionBuilder())
                .correctAnswer(null)
                .build();
    }

    /**
     * Test of build method, of class QuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildLastUpdatedDateFail() {
        (new QuestionBuilder())
                .lastUpdated(null)
                .build();
    }
}