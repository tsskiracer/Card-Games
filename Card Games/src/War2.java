
public class War2
	{
		import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
		public class War {
			static ArrayList<Card> deck = new ArrayList<Card>();
			static ArrayList<Card> userHand = new ArrayList<Card>();
			static ArrayList<Card> computerHand = new ArrayList<Card>();
			
			public static void card()
			{
				deck.add(new Card("1 ", "Hearts", 1));
				deck.add(new Card("2 ", "Hearts", 2));
				deck.add(new Card("3 ", "Hearts", 3));
				deck.add(new Card("4 ", "Hearts", 4));
				deck.add(new Card("5 ", "Hearts", 5));
				deck.add(new Card("6 ", "Hearts", 6));
				deck.add(new Card("7 ", "Hearts", 7));
				deck.add(new Card("8 ", "Hearts", 8));
				deck.add(new Card("9 ", "Hearts", 9));
				deck.add(new Card("Jack ", "Hearts", 10));
				deck.add(new Card("Queen ", "Hearts", 10));
				deck.add(new Card("King ", "Hearts", 10));
				deck.add(new Card("Ace ", "Hearts", 11));
				deck.add(new Card("1 ", "Spades", 1));
				deck.add(new Card("2 ", "Spades", 2));
				deck.add(new Card("3 ", "Spades", 3));
				deck.add(new Card("4 ", "Spades", 4));
				deck.add(new Card("5 ", "Spades", 5));
				deck.add(new Card("6 ", "Spades", 6));
				deck.add(new Card("7 ", "Spades", 7));
				deck.add(new Card("8 ", "Spades", 8));
				deck.add(new Card("9 ", "Spades", 9));
				deck.add(new Card("Jack ", "Spades", 10));
				deck.add(new Card("Queen ", "Spades", 10));
				deck.add(new Card("King ", "Spades", 10));
				deck.add(new Card("Ace ", "Spades", 11));
				deck.add(new Card("1 ", "Clubs", 1));
				deck.add(new Card("2 ", "Clubs", 2));
				deck.add(new Card("3 ", "Clubs", 3));
				deck.add(new Card("4 ", "Clubs", 4));
				deck.add(new Card("5 ", "Clubs", 5));
				deck.add(new Card("6 ", "Clubs", 6));
				deck.add(new Card("7 ", "Clubs", 7));
				deck.add(new Card("8 ", "Clubs", 8));
				deck.add(new Card("9 ", "Clubs", 9));
				deck.add(new Card("Jack ", "Clubs", 10));
				deck.add(new Card("Queen ", "Clubs", 10));
				deck.add(new Card("King ", "Clubs", 10));
				deck.add(new Card("Ace ", "Clubs", 11));
				deck.add(new Card("1 ", "Diamonds", 1));
				deck.add(new Card("2 ", "Diamonds", 2));
				deck.add(new Card("3 ", "Diamonds", 3));
				deck.add(new Card("4 ", "Diamonds", 4));
				deck.add(new Card("5 ", "Diamonds", 5));
				deck.add(new Card("6 ", "Diamonds", 6));
				deck.add(new Card("7 ", "Diamonds", 7));
				deck.add(new Card("8 ", "Diamonds", 8));
				deck.add(new Card("9 ", "Diamonds", 9));
				deck.add(new Card("Jack ", "Diamonds", 10));
				deck.add(new Card("Queen ", "Diamonds", 10));
				deck.add(new Card("King ", "Diamonds", 10));
				deck.add(new Card("Ace ", "Diamonds", 11));
				
				Collections.shuffle(deck);

			}

			
			public static void hands()
			{
				
				for (int i=0; i<52; i++)
				{
					
					if (i%2==0)
					{
						userHand.add(deck.get(i));
					}
					else
					{
						computerHand.add(deck.get(i));
					}
					
				}
			}	
				
			
			public static void main(String[] args)
			{
				card();
				hands();
				
				Scanner userInitiate=new Scanner(System.in);
				
				int userAmount=26;
				boolean keepPlaying=true;
				do
				{
				
					
					for (int i=0; i<userHand.size(); i++)
						{
							System.out.println("Your card is the "+userHand.get(i).getRank()+ "of " + userHand.get(i).getSuit()+ ". ");
							System.out.println("Your opponents card is "+computerHand.get(i).getRank()+"of" + computerHand.get(i).getSuit() + ". ");
							
							if (userHand.get(i).getValue()>computerHand.get(i).getValue())
							{
								userAmount++;
								userHand.add(computerHand.get(i));
							}
							if (userHand.get(i).getValue()<computerHand.get(i).getValue())
							{
								userAmount--;
								computerHand.add(userHand.get(i));
							}
							if (userHand.get(i).getValue()==computerHand.get(i).getValue())
							{
								if (userHand.get(i+1).getValue()>computerHand.get(i+1).getValue())
									{
										userAmount++;
										userHand.add(computerHand.get(i));
									}
								if (userHand.get(i+1).getValue()<computerHand.get(i+1).getValue())
									{
										userAmount--;
									}
							}
							System.out.println("You have " + userAmount + " cards.");
						}
								String war=userInitiate.nextLine();
					System.out.println("Hello! Welcome to the game of war. Please type 'war' to start a round. Press q to quit the game.");
					war=war.toLowerCase();
					if(war.equals("q"))
						{
						keepPlaying=false;
						System.out.println("Thank you for playing!");
						}

				if (userAmount==52)
				{
					System.out.println("Congratulations you won!");
				}
				else if (userAmount==0)
				{
					System.out.println("Sorry you lost.");
				}
			
				}
			while (war.equals("war") && userAmount>0 && userAmount<52);
			}	
		}
	}
