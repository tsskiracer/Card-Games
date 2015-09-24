import java.util.*;
public class Card
	{
		
		private String suit;
		private int value;
		private String rank;
		static ArrayList<Card> deck = new ArrayList<Card>();
		public Card(String r, String s, int v)
		{
			suit=s;
			value=v;
			rank=r;
		}
		
		public String getcType()
			{
				return suit;
			}

		public void setcType(String cType)
			{
				this.suit = cType;
			}

		public int getcNumber()
			{
				return value;
			}

		public void setcNumber(int cNumber)
			{
				this.value = cNumber;
			}

		public static void main(String[] args)
			{
				deck.add(new Card("1", "Hearts", 1));
				deck.add(new Card("2", "Hearts", 2));
				deck.add(new Card("3", "Hearts", 3));
				deck.add(new Card("4", "Hearts", 4));
				deck.add(new Card("5", "Hearts", 5));
				deck.add(new Card("6", "Hearts", 6));
				deck.add(new Card("7", "Hearts", 7));
				deck.add(new Card("8", "Hearts", 8));
				deck.add(new Card("9", "Hearts", 9));
				deck.add(new Card("Jack", "Hearts", 10));
				deck.add(new Card("Queen", "Hearts", 10));
				deck.add(new Card("King", "Hearts", 10));
				deck.add(new Card("Ace", "Hearts", 11));
				deck.add(new Card("1", "Spades", 1));
				deck.add(new Card("2", "Spades", 2));
				deck.add(new Card("3", "Spades", 3));
				deck.add(new Card("4", "Spades", 4));
				deck.add(new Card("5", "Spades", 5));
				deck.add(new Card("6", "Spades", 6));
				deck.add(new Card("7", "Spades", 7));
				deck.add(new Card("8", "Spades", 8));
				deck.add(new Card("9", "Spades", 9));
				deck.add(new Card("Jack", "Spades", 10));
				deck.add(new Card("Queen", "Spades", 10));
				deck.add(new Card("King", "Spades", 10));
				deck.add(new Card("Ace", "Spades", 11));
				deck.add(new Card("1", "Clubs", 1));
				deck.add(new Card("2", "Clubs", 2));
				deck.add(new Card("3", "Clubs", 3));
				deck.add(new Card("4", "Clubs", 4));
				deck.add(new Card("5", "Clubs", 5));
				deck.add(new Card("6", "Clubs", 6));
				deck.add(new Card("7", "Clubs", 7));
				deck.add(new Card("8", "Clubs", 8));
				deck.add(new Card("9", "Clubs", 9));
				deck.add(new Card("Jack", "Clubs", 10));
				deck.add(new Card("Queen", "Clubs", 10));
				deck.add(new Card("King", "Clubs", 10));
				deck.add(new Card("Ace", "Clubs", 11));
				deck.add(new Card("1", "Diamonds", 1));
				deck.add(new Card("2", "Diamons", 2));
				deck.add(new Card("3", "Diamonds", 3));
				deck.add(new Card("4", "Diamonds", 4));
				deck.add(new Card("5", "Diamonds", 5));
				deck.add(new Card("6", "Diamonds", 6));
				deck.add(new Card("7", "Diamonds", 7));
				deck.add(new Card("8", "Diamonds", 8));
				deck.add(new Card("9", "Diamonds", 9));
				deck.add(new Card("Jack", "Diamonds", 10));
				deck.add(new Card("Queen", "Diamonds", 10));
				deck.add(new Card("King", "Diamonds", 10));
				deck.add(new Card("Ace", "Diamonds", 11));
				
				

			}

	}
