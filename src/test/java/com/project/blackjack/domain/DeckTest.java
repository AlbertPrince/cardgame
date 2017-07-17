package com.project.blackjack.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.project.blackjack.util.CardUtil;

public class DeckTest {
	
	private Deck deckOfCards;
	
	@Before
	public void init(){
		CardUtil.faceToValueBlackJack();
		deckOfCards = new Deck();
	}
	
	@Test
	public void initDeck(){
		
		Card card = deckOfCards.getOneCard();
		Assert.assertNotNull( card );
	}
	
//	@Test
//	public void shuffleTest(){
//		Card cardBefore = deckOfCards.getOneCard();
//		
//		deckOfCards.shuffle();
//		Card cardAfter = deckOfCards.getO
//	}


}
