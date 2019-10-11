public class Cards{
	private int rank;
	private int suit;
	
	public card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}
	public string toString(){
		//array with string representations of  card suits.
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
		//array with string representation of card value.
		String[] ranks = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		String ss = ranks[this.rank]+ " - "+ suits[this.suit];
		return ss;
		}
		
}
