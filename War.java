//OFFICIAL PROJECT BY MISS CHITSA,MR KLAAS AND MISS PHUNGULA 
import java.util.Scanner;
public class War{
	private Player one;
	private Player two;
	private Hand discard;
	private Scanner in;
	
	public War(){
		Deck deck = new Deck("Deck");
		deck.shuffle();
		
		int handSize = 26;
		one = new Player("Tee-Cee");
		deck.deal(one.getHand(),handSize);
		one.getHand().display();
		
		two = new Player("Ayanda");
		deck.deal(two.getHand(),handSize - 1);
		 two.getHand().display();
		
		discard = new Hand("Discards");
		deck.deal(discard,1);
		
		in = new Scanner(System.in);
	}
	
	public boolean isDone(){
		return one.getHand().empty() || two.getHand().empty(); 
	}
	
	public Player nxtPlayer(Player curr){
		if(curr == one){
			return two;
			
		}else{
			return one;
		}
	}
	
	public void displayState(){
		discard.display();
		System.out.println("On the board: "+ discard.size()+" cards");
	}
	
	public void waitforuser(){
		System.out.println("Press [Enter]");
		in.nextLine();
	}
	
	public void takeTurn(Player player){
		
		Card prev = discard.last();
		Card next = player.play(this,prev);
		discard.addCard(next);
		System.out.println(player.getName() + " plays " + next);
		if(discard.size() % 2 == 0){
			if(prev.CompareTo(next) == 1){
				two.hand.addCard(prev);
				two.hand.addCard(next);
				one.hand.Remove();
				two.hand.shuffle();
				System.out.println(two.getName()+ " takes the cards");
			}
			if(prev.CompareTo(next) == -1){
				one.hand.addCard(prev);
				one.hand.addCard(next);
				two.hand.Remove();
				one.hand.shuffle();
				System.out.println(one.getName()+ " takes the cards");
			}
			if(prev.CompareTo(next) == 0){
				System.out.println("WAR has been declared; \n         This means that your cards will be returned and reshuffled");
				one.hand.addCard(next);
				two.hand.addCard(prev);
				one.hand.shuffle();
				two.hand.shuffle();
				
			}
			discard.Remove();
			discard.Remove();	
		}
		System.out.println(one.getName()+"`s turn");
		discard.addCard(nxtPlayer(player).drawCard());
		System.out.println();
	}
	
	public void playGame(){
		Player player = one;
		while( !isDone() && discard.size() <52){
			displayState();
			waitforuser();
			takeTurn(player);
			player = nxtPlayer(player); 
		}
	}
}