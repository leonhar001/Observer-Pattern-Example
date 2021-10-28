package observer;

import java.util.Date;

/*Dados pertinentes do evento*/
public class BirthdayPersonArrivalEvent {
	
	private final Date arrivalTime;

	public BirthdayPersonArrivalEvent(Date arrivalTime) {
		super();
		this.arrivalTime = arrivalTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}
	
	
}
