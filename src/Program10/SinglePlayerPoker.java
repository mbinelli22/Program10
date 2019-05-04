package Program10;
//Michael Binelli
import java.util.Scanner;
public class SinglePlayerPoker {
	public static void main(Sting[] args) {
		
	}
	
	public static void sortHand(int[] hand){
		for (int i = 0; i < hand.length; ++i){
			int maxLoc = i;
			for (int j = i+1; j < hand.length; ++j)
				if (cardValue(hand[j]) > cardValue(hand[maxLoc]))
					maxLoc = j;
					int tmp = hand[i];
					hand[i] = hand[maxLoc];
					hand[maxLoc] = tmp;
		}
	}
	
}
