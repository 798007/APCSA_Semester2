
/**
 * Shuffles a deck of cards randomly
 *
 * @author (Emily Greene)
 * @version (204)
 */
public class Shuffle
{
    public Shuffle(int[] s)
    {
      
    }
    public static void main(){
        int[] nums = new int[52];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }
        for(int i = 0; i < nums.length; i++){
            int r = (int)(Math.random()*(nums.length));
            int temp = nums[r];
            nums[r] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        Shuffle s = new Shuffle(nums);
    }
}
