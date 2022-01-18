/*
December 17th 2021 Andrew, Cole, Daniel
This is a Quiz class that represents a single quiz for the test
 */
package andrewdanielcoleprojectmanagementproject;


public class Quiz {
    //encapsulating attributes
    private String question;
    private int numQuestion;
    private int answer;
    private int userAnswer = 0;
    private String[] answerOptions = new String[4];
    
    /**
     * primary constructor
     * @param numQuestion - number of the question
     * @param question - the question
     * @param answerOptions - the array of answer options
     * @param answer - the answer number (since it is a MC question)
     */
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer)
    {
        this.numQuestion = numQuestion;
        this.question = question;
        this.answerOptions = answerOptions;
        this.answer = answer;
    }
    
    /**
     * secondary constructor
     * @param numQuestion - number of the question
     * @param question - the question
     * @param answerOptions - the array of answer options
     * @param answer - the answer number (since it is a MC question)
     * @param userAnswer - the user's answer
     */
    public Quiz(int numQuestion, String question, String[] answerOptions, int answer, int userAnswer)
    {
        this(numQuestion, question, answerOptions, answer); //chain constructor
        this.userAnswer = userAnswer;
    }
    
    /**
     * Accessor for the question attribute
     * @return - the question
     */
    public String getQuestion()
    {
        return question;
    }
    
    /**
     * Accessor for the number of the question
     * @return - the number of the question
     */
    public int getNumQuestion()
    {
        return numQuestion;
    }
    
    /**
     * Mutator for the mumber of the question
     * @param numQuestion - new number of the question
     */
    public void setNumQuestion(int numQuestion)
    {
        this.numQuestion = numQuestion;
    }
    
    /**
     * Accessor for the certain answer option
     * @param numOption - the number of the option
     * @return - what is the option
     */
    public String getAnswerOption(int numOption)
    {
        return answerOptions[numOption-1]; //Minus 1 because the number of option is 1~4 but the index of the array is 0~3
    }
    
    /**
     * Accessor for the answer attribute
     * @return integer value that represents the answer of the question
     */
    public int getAnswer()
    {
        return answer;
    }
    
    /**
     * Mutator for the user's answer attribute
     * @param userAnswer - the new User's answer
     */
    public void setUserAnswer(int userAnswer)
    {
        this.userAnswer = userAnswer;
    }
    
    /**
     * Accessor for the user's answer attribute
     * @return - integer value that represent's the user's answer
     */
    public int getUserAnswer()
    {
        return userAnswer;
    }
    
    /**
     * This method checks if the user's answer is the correct answer
     * @return - boolean value whether or not the user is correct
     */
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
    
    /**
     * toString method that contains all attribute of the Quiz instance
     * @return - String value that contains the information of this instance
     */
    public String toString()
    {
        String status = "Correct"; 
        if(this.checkAnswer()) //if the user is correct
        {
            status = "Correct!";
        }
        else //if the user's answer is wrong
        {
            status = "Wrong!";
        }
        
        return "Q" + numQuestion +". " + question + "\nAnswer: " + answer + ". " + answerOptions[answer-1] + "\nYour answer: " + userAnswer + ". " + answerOptions[userAnswer-1] + "\n" + status + "\n";
    }

}
