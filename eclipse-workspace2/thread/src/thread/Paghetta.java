package thread;

import java.util.Scanner;

public class Paghetta {
	public static void main(String[] args) {
		Thread tPadre = new Thread(new Genitore(100));
		tPadre.start();
	}
}
