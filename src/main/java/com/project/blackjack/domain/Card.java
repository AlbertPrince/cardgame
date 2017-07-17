package com.project.blackjack.domain;

import com.project.blackjack.util.CardUtil;
import com.project.blackjack.util.FaceValue;
import com.project.blackjack.util.Suit;

public class Card {
	
	private int value;
	private FaceValue faceValue;
	private Suit suit;
	
	public Card( FaceValue faceValue , Suit  suit) {
		super();
		this.suit = suit;
		this.faceValue = faceValue;
		this.value = CardUtil.cardFaceValue.get( faceValue );
	}

	public int getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	public FaceValue getFaceValue() {
		return faceValue;
	}
	
}
