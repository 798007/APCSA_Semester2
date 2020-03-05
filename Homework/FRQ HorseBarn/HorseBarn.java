
/**
 * HorseBarn
 *
 * @author (Emily Greene)
 * @version (304)
 */
public class HorseBarn
{
    public HorseBarn()
    {
    }
    
    private Horse[] spaces;
    
    public int findHorseSpace(String name){
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null && spaces[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    public void consolidate(){
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] == null){
                for(int j = i + 1; j < spaces.length; j++){
                    if(spaces[j] != null){
                        spaces[i] = spaces[j];
                        spaces[j] = null;
                        j = spaces.length;
                    }
                }
            }
        }
    }
}
