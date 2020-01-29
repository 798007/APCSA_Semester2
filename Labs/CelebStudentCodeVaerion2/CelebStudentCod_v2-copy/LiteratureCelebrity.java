import java.util.*;
/**
 * LiteratureCelebrity Class
 *
 * @author (Emily Greene)
 * @version (128)
 */
public class LiteratureCelebrity extends Celebrity
{
    /**
     * The clue to determine the literature celebrity
     */
    private String clue;
    /**
     * An ArrayList of clues for the literature celebrity
     */
    private ArrayList<String> clueList;
    /**
     * The answer or name of the literature celebrity.
     */
    private String answer;
    
    /**
     * Creates a Literature Celebrity instance with the supplied answer and clue
     * @param answer
     * @param clue
     */
    public LiteratureCelebrity(String answer, String clue)
    {
        super(answer, clue);
        this.clue = clue;
        this.answer = answer;
    }
    
    public LiteratureCelebrity(){
        clue = "";
        answer = "";
    }

    /**
     * Supplies the clue for the celebrity
     * @return
     */
    public String getClue()
    {
        return clue;
    }

    /**
     * Supplies the answer for the celebrity.
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
     * Provides a String representation of the Celebrity.
     */
    @Override
    public String toString()
    {
        return ("The answer is " + answer + " and the clue is " + clue);
    }
    
}
