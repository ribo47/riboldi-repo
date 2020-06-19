package test_esercizio1;

import esercizo1.Employee;

public class TestEmployee {
	
	private static final int numberEmployee=3;
	
	public static void main (String[] args) {
		
		Employee[] employee=new Employee[numberEmployee];
		Employee temp=new Employee();
		boolean changes;
		int i=0;

		
		employee[0] = new Employee ("aaa", "aaa", "aaa", "aaaaaa90aaa", 10, 3000);
		employee[1] = new Employee ("bbb", "bbb", "bbb", "bbbbbb92bbb", 20, 12000);
		employee[2] = new Employee ("ccc", "ccc", "ccc", "cccccc91ccc", 30, 34000);

		
		while(i<numberEmployee-1) {
			changes=false;
			if(!employee[i].gainsMore(employee[i+1])) {
				temp=employee[i];
				employee[i]=employee[i+1];
				employee[i+1]=temp;
				temp=null;
				changes=true;
				i=0;
			}
			else
				i++;
			
		}
		
		for(i=0; i<numberEmployee; i++)
		{
			employee[i].visualize();
		}
		
	


		
	}

}
