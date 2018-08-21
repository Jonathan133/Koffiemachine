package Main;

public class Koffiegetter {
	public static void main (String args []){
		Werknemer werknemer1 = new Werknemer();
		werknemer1.id="John";
		werknemer1.geld=0;
		KoffieMachine machine =new KoffieMachine();
		werknemer1.koffiehalen(machine);
		
		Werknemer 	werknemer2 = new Werknemer();
		werknemer2.geld=6;
		werknemer2.id="Peter";
		werknemer2.koffiehalen(machine);
		
	}

}

class Werknemer{
	String id;
	int geld =0;
	Koffie kopjekoffie;
	void koffiehalen(KoffieMachine machine) {
		machine.maakKoffie(geld,id);
		this.kopjekoffie =machine.schenkKoffie();
		
	}
	
	
}
class KoffieMachine {
	
	boolean betaalt =false;
	int koffiebonen;
	void maakKoffie(int geld,String id) {
		if(geld<2) {
			System.out.println("Geen geld, Geen koffie "+id);
		} else {
			this.betaalt=true;
			System.out.println("Geniet van je koffie "+id);
		}
		
	}
	Koffie schenkKoffie() {
		if(betaalt) {
		Koffie newkoffie = new Koffie();
		return newkoffie;
	} else {
		return null;
	}
	
	

}
}
class Koffie {
	
	int temperature=55;

	
	
}
