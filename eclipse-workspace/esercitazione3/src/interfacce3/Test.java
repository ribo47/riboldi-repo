package interfacce3;

public class Test {

	public static void main(String[] args) {
		
		Sum sum = new Sum(7, 6);
		Sub sub = new Sub (15, 8);
		Mul mul = new Mul (23.9, 7.5);
		Div div = new Div(14.9, 4);
		
		System.out.println(sum.doSum());
		System.out.println(sub.doSub());
		System.out.println(mul.doMul());
		System.out.println(div.doDiv());


	}

}
