package com.project.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

import com.project.blackjack.shuffle.IShuffle;
import com.project.blackjack.util.FaceValue;
import com.project.blackjack.util.Suit;

public class Deck {

	private ArrayList<Card> deckOfCards;
	private IShuffle shuffleAlgorithm;

	public void setShuffleAlgorithm(IShuffle shuffleAlgorithm) {
		this.shuffleAlgorithm = shuffleAlgorithm;
	}


	public Deck() {
		deckOfCards = new ArrayList<Card>();
		for ( FaceValue order : FaceValue.values() ){
			for (Suit suit : Suit.values()) {
				deckOfCards.add( new Card( order , suit ) );
			}
		}
	}

	
	public void shuffle(){
		shuffleAlgorithm.shuffle( deckOfCards );
	}

	public Card getOneCard(){
		if (deckOfCards.size() > 0 ){
			return deckOfCards.remove( 0 );
		}
		return null;
	}

}
