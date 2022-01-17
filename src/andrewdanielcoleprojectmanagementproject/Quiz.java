/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrewdanielcoleprojectmanagementproject;

import java.util.*;

/**
 *
 * @author kyw40
 */
public class Quiz {
    
    private String question;
    private int numQuestion;
    private int answer;
    private String ansDescription;
    private String[] answerOptions = new String[4];
    
    
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer)
    {
        this.numQuestion = numQuestion;
        this.question = question;
        this.answerOptions = answerOptions;
        this.answer = answer;
    }
    
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer, String ansDescription)
    {
        this(numQuestion, question, answerOptions, answer);
        this.ansDescription = ansDescription;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public int getNumQuestion()
    {
        return numQuestion;
    }
    
    public void setNumQuestion(int numQuestion)
    {
        this.numQuestion = numQuestion;
    }
    
    public String getAnswerOption(int index)
    {
        return answerOptions[index-1];
    }
    
    public int getAnswer()
    {
        return answer;
    }
    
    public void setAnsDescription(String ansDescription)
    {
        this.ansDescription = ansDescription;
    }
    
    public String getAnsDescription()
    {
        return ansDescription;
    }
    
    public boolean checkAnswer(int userAnswer)
    {
        if(userAnswer == answer)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        return "Question: " + question + "\nQuestion #" + numQuestion + "\nAnswer: " + answer + "." + answerOptions[answer-1] + "\nAnswer Description: " + ansDescription;
    }

}
