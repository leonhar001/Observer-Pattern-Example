package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Doorman extends Thread{
	
	/*Lista de observadores*/
	private List<BirthdayPersonArrivalObserver> observers = new ArrayList<BirthdayPersonArrivalObserver>();
	
	/*Registra observador*/
	public void addBirthdayPersonArrivalObserver(BirthdayPersonArrivalObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String value = scanner.next();
			/*Se 1 é pressionado, o fulano chegou*/
			if(value.equalsIgnoreCase("1")) {
			/*cria evento passando a data de chegada*/
				BirthdayPersonArrivalEvent event = new BirthdayPersonArrivalEvent(new Date());
			/*Notifica cada um dos observadores, passando o horário
			 * de chegada*/
				for(BirthdayPersonArrivalObserver observer : this.observers) {
					observer.hasArrived(event);
				}
			} else {
				System.out.println("False alarm!");
			}
		}
		
	}
}
