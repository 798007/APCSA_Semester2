import java.util.ArrayList;
/**
 * Homework 1/8/20
 *
 * @author (Emily Greene)
 * @version (109)
 */
public class Reverse
{
    //instance variables
    
    //constructor
    public Reverse()
    {
    }
    //method that takes in an arraylist of strings and reverses the order
    public ArrayList<String> reverseList(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            newList.add(list.get(list.size()-1-i));
        }
        return newList;
    }
    //method that takes in an array of strings and reverses the order
    public String[] reverseArr(String[] list){
        String[] newList = new String[list.length];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[list.length - 1 - i];
        }
        return newList;
    }
}
