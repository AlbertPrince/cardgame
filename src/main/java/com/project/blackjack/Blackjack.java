package com.project.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.project.blackjack.game.BlackJackGame;

public class Blackjack {

	public static void main(String[] args) {
		int numberOfPlayers = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of players ");
		try {
			numberOfPlayers = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		BlackJackGame blackjack = new BlackJackGame();
		blackjack.playGame( numberOfPlayers );
	}

}
