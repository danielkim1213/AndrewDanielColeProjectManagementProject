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
    private int userAnswer = 0;
    private String[] answerOptions = new String[4];
    
    
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer)
    {
        this.numQuestion = numQuestion;
        this.question = question;
        this.answerOptions = answerOptions;
        this.answer = answer;
    }
    
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer, int userAnswer)
    {
        this(numQuestion, question, answerOptions, answer);
        this.userAnswer = userAnswer;
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
    
    public void setUserAnswer(int userAnswer)
    {
        this.userAnswer = userAnswer;
    }
    
    public int getUserAnswer()
    {
        return userAnswer;
    }
    
    public boolean checkAnswer()
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
        String status = "Correct";
        if(this.checkAnswer())
        {
            status = "Correct!";
        }
        else
        {
            status = "Wrong!";
        }
        
        return "Q" + numQuestion +". " + question + "\nAnswer: " + answer + ". " + answerOptions[answer-1] + "\nYour answer: " + userAnswer + ". " + answerOptions[userAnswer-1] + "\n" + status + "\n";
    }

}
