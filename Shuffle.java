import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Shuffle {
	public static String[] Shuffle(String [] shaft){
		String [] first= new int[shaft.length/2];
		String [] second= new int[shaft.length/2];
		
		// System.out.println("How many times you want to shufle");
		// Scanner in=new Scanner(System.in);
		// int runs = in.nextInt();
		System.out.println(" ");
		System.out.println("These are the original shuffled numbers");
		System.out.println(Arrays.toString(shaft));
		System.out.println(" ");
		int z = 10000 ;
		while( z > 0)
		{
			for(int i=0;i<first.length;i++)
			{
				first[i]=shaft[i];
				second[i]=shaft[51-i];
			}
			int q=0;
			for(int j=first.length-1;j>0;j--)
			{
				shaft[q]=first[j];
				shaft[q+1]=second[j];
				q++;
			}
			System.out.println("Then the shuffled one here");
			System.out.println(Arrays.toString(shaft));
			double shon = ShonnonEn(shaft);
			System.out.println("shannon entropy: "+shon);
			System.out.println(" ");
			z--;
		}
		return shaft;
}

public static double ShonnonEn(int [] plac){
		double shonon=0.00;
		while(true)
		{
			int [] diff=new int[plac.length];
			for(int i=0;i<plac.length-1;i++)
			{
				diff[i]=plac[i]-plac[i+1]%52;
				if(diff[i]<0)
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
}