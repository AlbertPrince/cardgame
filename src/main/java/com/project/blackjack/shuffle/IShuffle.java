package com.project.blackjack.shuffle;

import java.util.List;

import com.project.blackjack.domain.Card;

public interface IShuffle {
	public void shuffle( List<Card> deck );
}
