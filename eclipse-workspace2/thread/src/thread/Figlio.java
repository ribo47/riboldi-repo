package thread;

class Figlio implements Runnable {
	Cassetto o;

	public Figlio(Cassetto oggetto) {
		o = oggetto;
		
	}

	public void run() {
		for (;;) {
			System.out.println("(Figlio) prova a prelevare");
			try {
				synchronized (o) {
					if (o.getDeposito()<= 0) {
						o.notify(); 
						o.wait(); 
					}
					else {
						int paghetta = o.getDeposito();

						o.preleva(); 
						System.out.println("(Figlio) ha prelevato la paghetta "+ paghetta + ". Il conto contiene ora: " + o.getDeposito());
						o.setUltimoPrelievo(1);
						
						int tempo = (int) (Math.random() * 50);

						System.out.println("(Figlio) aspetta "+tempo+" giorni");

						if(tempo>30) {
							o.setUltimoPrelievo(0);	
						}
						Thread.sleep(2000); 

						
						
						}
			        	
					}
				}
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}