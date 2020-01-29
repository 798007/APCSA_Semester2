
/**
 * CartoonCelebrity Class
 *
 * @author (Emily Greene)
 * @version (129)
 */
public class CartoonCelebrity extends Celebrity
{
   /**
     * The clue to determine the celebrity
     */
    private String clue;
    /**
     * The answer or name of the celebrity.
     */
    private String answer;
    
    /**
     * Creates a Cartoon Celebrity instance with the supplied answer and clue
     * @param answer
     * @param clue
     */
    public CartoonCelebrity(String answer, String clue)
    {
        super(answer, clue);
        this.clue = clue;
        this.answer = answer;
    }
    
    public CartoonCelebrity(){
        clue = "";
        answer = "";
    }

    /**
     * Supplies the clue for the cartoon celebrity
     * @return
     */
    public String getClue()
    {
        return clue;
    }

    /**
     * Supplies the answer for the cartoon celebrity.
     * @return
     */
    public String getAnswer()
    {
        return answer;
    }

    /**
     * Updates the clue to the provided String.
     * @param clue The new clue.
     */
    public void setClue(String clue)
    {
       this.clue = clue; 
    }

    /**
     * Updates the answer to the provided String.
     * @param answer The new answer.
     */
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    
    /**
     * Provides a String representation of the Cartoon Celebrity.
     */
    @Override
    public String toString()
    {
        return ("The answer is " + super.getAnswer() + " and the clue is " + super.getClue());
    }
}
