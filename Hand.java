public class Hand extends CardCollection{
	public Hand(String label){
		super(label);
	}
		
		public void display(){
		 System.out.println(label+ ": ");
		for(int i = 0; i < size(); i++){
			System.out.println(getCard(i));
		}
		System.out.println();
	}
}