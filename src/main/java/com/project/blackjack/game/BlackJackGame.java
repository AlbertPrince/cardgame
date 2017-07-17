package com.project.blackjack.game;

import java.util.ArrayList;
import java.util.List;

import com.project.blackjack.domain.Card;
import com.project.blackjack.domain.Deck;
import com.project.blackjack.domain.Player;
import com.project.blackjack.shuffle.RandomShuffle;
import com.project.blackjack.util.CardUtil;
import com.project.blackjack.util.Status;

public class BlackJackGame {
	
	private Deck deckOfCards;
	private List<Player> players;
	
	
	public BlackJackGame() {
		CardUtil.faceToValueBlackJack();
		this.deckOfCards = new Deck();
		this.deckOfCards.setShuffleAlgorithm( new RandomShuffle());
		this.players = new ArrayList<Player>();
	}

	
	private void initGame( int numberOfPlayers){
		deckOfCards.shuffle();
		for ( int i = 0; i<numberOfPlayers; i++ ){
			players.add( new Player( Integer.toString(i + 1) ) );
		}
	}
	
	private void dealCards( ){
		for ( Player player : players ) {
			System.out.println( "Player " + player.getName() + " is dealt :" );
			for ( int i=0; i<3; i++ ){
				Card card = deckOfCards.getOneCard();
				System.out.println( card.getValue() +" "+ card.getFaceValue().toString() +" " + card.getSuit().toString() );
				player.addCard(card );
			}
			System.out.println();
		}		
	}
	
	private void takeTurns( ){
		System.out.println( " ************************ " );
		for (Player player : players) {
			if ( player.getStatus().equals( Status.HIT ) )
			{
				Card card = deckOfCards.getOneCard();
				System.out.print( " Player " + player.getName() + " is dealt ");
				System.out.println( card.getValue() +" "+ card.getFaceValue().toString() +" " + card.getSuit().toString() );
				player.addCard( card );
			}
		}
	}
	
	private Player findWinner(){
		Player winner = null;
		int highScore = 0;
		for (Player player : players) {
			if ( player.getStatus().equals( Status.STICK ) )
			{
				if ( player.getValueOfHand() > highScore ){
					winner = player;
					highScore = player.getValueOfHand();
				}
			}
		}
		if ( winner == null ) {
			System.out.println(" All players are bust ");
			winner = players.get( 0 );
		}
		return winner;
	}
	
	private Boolean checkIfSomeoneCanPlay(){
		for (Player player : players) {
			if ( player.getStatus().equals( Status.HIT ) )
			{
				return true;
			}
		}
		return false;
	}
	
	public void playGame( int numberOfPlayers){
		Player winner = null;
		initGame( numberOfPlayers );
		dealCards( );
		while ( winner == null )
		{
			System.out.println();
			printStatusForAll();
			if ( ! checkIfSomeoneCanPlay() ){
				winner = findWinner();
				System.out.println();
				System.out.println( "The winner is Player "+ winner.getName());
				}
			else{
				takeTurns();
			};
		}
	}
	
	private void printStatusForAll(){
		for ( Player player : players ) {
			System.out.println( "Player " + player.getName() + " " +  player.getStatus() );
		}
	}
}
