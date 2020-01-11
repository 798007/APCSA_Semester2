import java.util.ArrayList;
/**
 * Homework 1/8/20: Reversing Arrays and ArrayLists
 *
 * @author (Emily Greene)
 * @version (109)
 */
public class Reverse
{
    //instance variables
    ArrayList<String> sl = new ArrayList<String>();
    String[] sa = {"Bob", "James", "Will", "Ryan", "John"};
    //constructor
    public Reverse(){
        sl.add("Bob");
        sl.add("James");
        sl.add("Will");
        sl.add("Ryan");
        sl.add("John");
        reverseList(sl);
        reverseArr(sa);
    }
    //main method
    public static void main(){
        Reverse run = new Reverse();
    }
    //method that takes in an arraylist of strings and reverses the order
    public ArrayList<String> reverseList(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            newList.add(list.get(list.size()-1-i));
        }
        System.out.println("Original arraylist: " +  list);
        System.out.println("Reversed arraylist: " + newList);
        return newList;
    }
    //method that takes in an array of strings and reverses the order
    public String[] reverseArr(String[] list){
        String[] newList = new String[list.length];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[list.length - 1 - i];
        }
        System.out.print("Original array: ");
        for(int i = 0; i < newList.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.print("\nReversed array: ");
        for(int i = 0; i < newList.length; i++){
            System.out.print(newList[i] + ", ");
        }
        return newList;
    }
}
