package CursUEF;

import CursUEF.entities.Lutador;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		Lutador[] l = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
		l[1] = new Lutador("Putscript", "Brasil ", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.0f, 13, 2, 1);
		l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UFO Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.3f, 12, 2, 4);
		
		l[3].apresentar();
		l[3].status();
		
	}

}
