package com.project.blackjack.shuffle;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.project.blackjack.domain.Card;

public class RandomShuffle implements IShuffle {

	public void shuffle(List<Card> deck) {
		Collections.shuffle( deck, new Random() );
	}

}
