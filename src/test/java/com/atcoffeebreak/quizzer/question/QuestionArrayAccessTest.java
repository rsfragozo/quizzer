package com.atcoffeebreak.quizzer.question;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class QuestionArrayAccessTest {
    /**
     * Test of getQuestion method, of class QuestionArrayAccess.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        long index = 1;
        QuestionArrayAccess instance = new QuestionArrayAccess();
        Question expResult = (new QuestionBuilder())
                .id(1)
                .question("What was the first toy advertised on television?")
                .answerA("The Rubix Cube")
                .answerB("Mr. Potato Head")
                .answerC("Barbie")
                .answerD("A hula hoop")
                .correctAnswer("B")
                .hint("Use your head on this one")
                .lastUpdated(new java.util.Date())
                .build();
        Question result = instance.getQuestionById(index);
        assertEquals(" questions 1 do not match in ::getQuestion().", expResult.getId(), result.getId());
    }

    /**
     * Test of getRandomQuestion method, of class QuestionArrayAccess.
     */
    @Test
    public void testGetRandomQuestion() {
        System.out.println("getRandomQuestion");
        QuestionArrayAccess instance = new QuestionArrayAccess();
        Question result = instance.getRandomQuestion();
        assertNotNull("A random question was not returned in ::getRandomQuestion().", result);
    }

    /**
     * Test of getQuestionList method, of class QuestionArrayAccess.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        long offset = 0L;
        QuestionArrayAccess instance = new QuestionArrayAccess();
        List<Question> result = instance.getQuestionList(offset);

        assertNotNull(" question list not returned in ::getQuestionList.", result);
        assertEquals(10, result.size());
    }

    /**
     * Test of getQuestionListSize method, of class QuestionArrayAccess.
     */
    @Test
    public void testGetQuestionListSize() {
        System.out.println("getQuestionListSize");
        QuestionArrayAccess instance = new QuestionArrayAccess();
        long expResult = 11;
        long result = instance.getQuestionListSize();
        assertEquals("There should only be 11  questions in ::getQuestionListSize.", expResult, result);
    }

    @Test
    public void getQuestionsBySpecifiedList() {

        QuestionArrayAccess instance = new QuestionArrayAccess();

        List<Question> questionList = instance.getSpecifiedQuestionList(0L, 1L, 2L);

        List<Long> actual = questionList.stream()
                .map(Question::getId)
                .collect(Collectors.toList());

        List<Long> expected = Arrays.asList(0L, 1L, 2L);
        assertTrue(actual.containsAll(expected));
    }

}