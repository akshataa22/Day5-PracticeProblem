package Day5;
import java.util.Random;
public class CoinFlipPercentage {
        public static void main(String[] args) {
            int numOfFlips = 100, heads = 0,tails = 0;     //initialising the values
            for (int i = 0; i < numOfFlips; i++) {
                int side = new Random().nextInt(2);   //randomly generates 0 or 1
                if (side == 0) {
                    heads++;
                } else {
                    tails++;
                }
            }

            double perHeads = (double) heads / numOfFlips * 100;    //percentage of heads
            double perTails = (double) tails / numOfFlips * 100;     //percentage of tails
            System.out.println("Heads: " + heads + " times" + " (" + perHeads + "%)");
            System.out.println("Tails: " + tails + " times" + " (" + perTails + "%)");
        }
}
