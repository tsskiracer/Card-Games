import java.util.ArrayList;
import java.util.Scanner;
public class Players {
	private int bank;
	private int bet;
	static ArrayList<Card> hand = new ArrayList<Card>();
	
	public Players(int b, int bt)
	{
	bank=b;
	bet=bt;
	}
	
	public int getBank()
		{
			return bank;
		}

	public void setBank(int bank)
		{
			this.bank = bank;
		}

	public int getBet()
		{
			return bet;
		}

	public void setBet(int bet)
		{
			this.bet = bet;
		}

	public static void playerHand()
	{
		Scanner userBet=new Scanner(System.in);
		int bet=userBet.nextInt();
		hand.add(new Card(deck[]));
		
	}

	public static void main(String[] args) {
		

	}

}