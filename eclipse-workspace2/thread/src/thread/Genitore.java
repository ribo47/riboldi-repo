package thread;

class Genitore implements Runnable {

	Cassetto o;

	public Genitore(int soldi) {
		o = new Cassetto(soldi);
	}

	public void run() {
		
		Thread tFiglio = new Thread(new Figlio(o));
		tFiglio.setName("Figlio");
		tFiglio.start();

		for (;;) {
			if(o.getDeposito()==0) {
				System.out.println("(Genitore) prova a aggiungere");
				try {
					synchronized (o) {
	
						if (o.getDeposito() >= 0) { 
							o.notifyAll();
							o.wait(); 
						}
						
						int soldi = (int) (Math.random() * 101);
	
						if(o.getUltimoPrelievo()==0) {
							o.aggiungi(soldi);
							System.out.println("(Genitore) aggiunge "+soldi+" euro - cassetto: " + o.getDeposito());
							o.notifyAll(); 
						}
						else {
							if(o.getDeposito()!=0) 
								System.out.println("(Cassetto) non è ancora stata prelevata l'ultima paghetta");
							
							System.out.println("(Cassetto) Non è ancora passato un mese dall'ultimo prelievo");
							Thread.sleep(5000);
							System.out.println("(Cassetto) è passato abbastanza tempo ora");

							o.setUltimoPrelievo(0);
						}
						
					}
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				
				try {
					Thread.sleep(1000);
					//System.out.println("(Cassetto) Non è ancora stata prelevata l'ultima paghetta");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}
}