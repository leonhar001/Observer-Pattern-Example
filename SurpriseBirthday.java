package observer;

public class SurpriseBirthday {

	public static void main(String[] args) {
		
		Girlfriend girlfriend = new Girlfriend();
		Doorman doorman = new Doorman();
		
		/*Adicionar namorada a lista de observadores:
		 * equivalente ao ato de usar o interfone e
		 * pedir para o porteiro avisar da chegada
		 * do namorado*/
		doorman.addBirthdayPersonArrivalObserver(girlfriend);

		doorman.start();
	}

}
