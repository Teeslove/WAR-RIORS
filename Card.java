public class Card{
	private final int rank;
	private final int suit;
	public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"}; //array with string representations of  card suits.
	public static final String[] RANKS = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};//array with string representation of card value.
	
	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){
		 
		return RANKS[this.rank]+ " - "+ SUITS[this.suit];
		}
	public int CompareTo(Card that){
		if(this.rank < that.rank){
			return -1;
		}
		if(this.rank > that.rank){
			return 1;
		}
		return 0;
	}	
	
	public int getRank(){
		return this.rank;
	}
	
	public int getSuit(){
		return this.suit;
	}
	
	
}