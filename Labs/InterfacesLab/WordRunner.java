//© A+ Computer Science
// www.apluscompsci.com

//comparable example one

import java.util.*;

public class WordRunner
{
    public static void main ( String[] args )
    {
        Word x = new Word("dog");
        Word y = new Word("cat");
        System.out.println( x.compareTo(y) );
        
        //make a list of Word
        //call Collections.sort() and sort the list
        //print the list
        
        Word[] wl = new Word[5];
        wl[0] = new Word("hamster");
        wl[1] = new Word("dolphin");
        wl[2] = new Word("puppy");
        wl[3] = new Word("elephant");
        wl[4] = new Word("monkey");
        Arrays.sort(wl);
        for(int i = 0; i < wl.length; i++){
          System.out.print(wl[i] + ", ");
        }
  }
}