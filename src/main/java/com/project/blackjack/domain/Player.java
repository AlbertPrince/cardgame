package com.project.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

import com.project.blackjack.util.Status;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private Status status = Status.HIT;
	private int valueOfHand = 0;
	private String name = "";
	
	public int getValueOfHand() {
		return valueOfHand;
	}

	public String getName() {
		return name;
	}

	public Status getStatus() {
		return status;
	}
	
	public void addCard( Card card ){
		hand.add( card );
		valueOfHand += card.getValue();
		evaluateStatus();
	}
	
	public void evaluateStatus(){
		status = (valueOfHand <17) ?  Status.HIT : Status.STICK;
		if ( valueOfHand > 21 ){
			status = Status.GO_BUST;
		}
	}

	public Player(String name) {
		super();
		this.name = name;
	}
	
}
