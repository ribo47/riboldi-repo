package esercitazione1_1;

public class esercizio3 {
	
	private static final int limite=50;
	
	public static void main (String[] args)
	{
		long[] last2 = {0, 1}; 
		long temp=0;
		int i=0;
		System.out.println("serie di fibonacci");
		while(i<limite)
		{
			temp=last2[0]+last2[1];
			System.out.println(temp);
			last2[0]=last2[1];
			last2[1]=temp;
			i++;
		}
		

	}

}
