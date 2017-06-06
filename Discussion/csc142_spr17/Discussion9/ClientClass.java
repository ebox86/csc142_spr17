package csc142_spr17.Discussion9;

public class ClientClass {
	public static void main(String[] args){
		Hedgehog hp = new Hedgehog();
	
		Animal ap = hp;
	
		Mammal mp = hp;
	
		//Hedgehog g = new Mammal();  // cannot convert from Mammal to Hedgehog
	
		Animal a = new Mammal();
		
		
		
		hp.walk();
	
		//ap.walk();
	
		ap.dance();
	
		ap.sneeze();
	
		//mp.walk(3.0);
	
		((Hedgehog)mp).walk(3.0);
	
		hp.sneeze();
	
		a.dance();
	
		//((SeaUrchin)a).sting();
	}
}
