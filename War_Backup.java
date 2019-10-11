import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class War_Backup{
	
	public static Card[] Shuffle(Card[] shaft,int nums[]){
		Random rand = new Random();
		
		
		double shon = 0.00;
		System.out.println(" ");
		System.out.println("These are the original shuffled numbers");
		System.out.println(Arrays.toString(shaft));
		System.out.println(" ");
		
	while(shon <4.00 || shon > 5.00){	
		for(int w = 0; w < 52;w++){
			int z = rand.nextInt(52);
			Card cTemp;
			int iTemp;
			
			cTemp = shaft[w];
			iTemp = nums[w];
			
			shaft[w] = shaft[z];
			nums[w] = nums[z];
			
			shaft[z] = cTemp;
			nums[z] = iTemp;
			
			w++;
	}
			System.out.println("Then the shuffled one here");
			System.out.println(Arrays.toString(shaft));
			shon = ShonnonEn(nums);
			System.out.println(Arrays.toString(shaft));
			System.out.println("shannon entropy: "+shon);
			System.out.println(" ");
	}		
return shaft;
}

public static double ShonnonEn(int[] plac){
		double shonon = 0.00;
		while(true)
		{
			int [] diff= new int[plac.length];
			for(int i = 0;i < plac.length-1;i++)
			{
				diff[i] = plac[i]-plac[i+1]%52;
				if(diff[i] < 0)
				{
					diff[i]+=plac.length;
				}
				else
				{
					continue;
				}	
			}
			for(int j=0;j<diff.length;j++)
			{
				double pro=(double)diff[j]/52.0;
				if(pro>0.0)
				{
					shonon-=(pro*Math.log(pro)/Math.log(2));
				}
				return shonon*10;
			}	 
		}
	}
	// public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Card Value");
	int r = input.nextInt();
	
	System.out.println("Suit number");
	int s = input.nextInt();
	
	
	Card card = new Card(11,1);
	System.out.println(card);
	int[] Nums = new int[52];
	
	for(int i = 1; i < 52;i++){
		Nums[i] = i;
	}
	
	Card[] cards = new Card[52];
	
	int index = 0;
	for(int suit = 0;suit < 4;suit++){
		for(int rank = 1;rank < 14;rank++){
			cards[index] = new Card(rank,suit);
			index++;
		}

		}
	Print all cards
	for(int i = 0; i < cards.length;i++){
		System.out.println(cards[i]);
	}
	Shuffle(cards,Nums);
	}