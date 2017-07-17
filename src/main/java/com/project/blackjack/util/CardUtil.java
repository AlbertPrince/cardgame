package com.project.blackjack.util;

import java.util.HashMap;

public class CardUtil {
	
	public static HashMap< FaceValue, Integer > cardFaceValue = new HashMap< FaceValue, Integer>();
	
	public static void faceToValueBlackJack(){
		cardFaceValue.put( FaceValue.TWO, 2);
		cardFaceValue.put( FaceValue.THREE, 3);
		cardFaceValue.put( FaceValue.FOUR, 4);
		cardFaceValue.put( FaceValue.FIVE, 5);
		cardFaceValue.put( FaceValue.SIX, 6);
		cardFaceValue.put( FaceValue.SEVEN, 7);
		cardFaceValue.put( FaceValue.EIGHT, 8);
		cardFaceValue.put( FaceValue.NINE, 9);
		cardFaceValue.put( FaceValue.TEN, 10);
		cardFaceValue.put( FaceValue.JACK, 10);
		cardFaceValue.put( FaceValue.QUEEN, 10);
		cardFaceValue.put( FaceValue.KING, 10);
		cardFaceValue.put( FaceValue.ACE, 11);
	}
}
