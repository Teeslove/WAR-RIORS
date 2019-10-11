public class Player{
	private String name;
	public Hand hand;
	
	public Player(String name){
		this.name = name;
		this.hand = new Hand(name);
	
	}
	
	public Card play(War war,Card top){
		Card card = drawCard();
		return card;
	}
	
	public Card drawCard(){
		int i = hand.size() - 1;
		return hand.getCard(i);
	}
	
	public boolean match(Card card1,Card card2){
		if(card1.getRank() == card2.getRank()){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return this.name;
	}
	public Hand getHand(){
		return this.hand;
		
		}

	}
