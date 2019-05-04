package Program10;
//Michael Binelli
import java.util.Scanner;
public class SinglePlayerPoker {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int []	deck = new int[36];
		String player1;
		int chip;
		double chipValue = 1.00;
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
	
	public static void displayHand(int[] hand) {
		
	}
	
	public static int getBet(Scanner stdIn, int bank) {
		
	}
	
	public static boolean isQuad(int[] hand) {
		
	}
	
	public static boolean isStraightFlush(int[] hand) {
		
	}
	
	public static boolean isFlush(int[] hand) {
		
	}
	
	public static boolean isStraight(int[] hand) {
		
	}
	
	public static boolean isTrip(int[] hand) {
		
	}
	
	public static boolean is2Pair(int[] hand) {
		
	}

	public static boolean isPair(int[] hand) {
		
	}
	
	public static void report(int nHands, int nWins, int nLosses, int bank) {
		
	}
	
	
	
	
	
	
	
}
