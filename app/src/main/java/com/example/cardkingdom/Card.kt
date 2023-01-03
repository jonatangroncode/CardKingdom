package com.example.cardkingdom

import android.media.Image
import android.widget.ImageView
import java.util.stream.Collectors.toList

class Card(val cardsuit: String = "", var cardValue: Int = 0, val cardImage: Int) {


}

// Min kortlek
public var allCards = listOf<Card>(
    Card("clubs", 1, R.drawable.ace_of_clubs),
    Card("diamonds", 1, R.drawable.ace_of_diamonds),
    Card("hearts", 1, R.drawable.ace_of_hearts),
    Card("spades", 1, R.drawable.ace_of_spades2),
    Card("clubs", 2, R.drawable.two_of_clubs),
    Card("diamonds", 2, R.drawable.two_of_diamonds),
    Card("hearts", 2, R.drawable.two_of_hearts),
    Card("spades", 2, R.drawable.two_of_spades),
    Card("clubs", 3, R.drawable.three_of_clubs),
    Card("diamonds", 3, R.drawable.three_of_diamonds),
    Card("hearts", 3, R.drawable.three_of_hearts),
    Card("spades", 3, R.drawable.three_of_spades),
    Card("clubs", 4, R.drawable.four_of_clubs),
    Card("diamonds", 4, R.drawable.four_of_diamonds),
    Card("hearts", 4, R.drawable.four_of_hearts),
    Card("spades", 4, R.drawable.four_of_spades),
    Card("spades", 5, R.drawable.five_of_spades),
    Card("clubs", 5, R.drawable.five_of_clubs),
    Card("hearts", 5, R.drawable.five_of_hearts),
    Card("diamonds", 5, R.drawable.five_of_diamonds),
    Card("clubs", 6, R.drawable.six_of_clubs),
    Card("diamonds", 6, R.drawable.six_of_diamonds),
    Card("hearts", 6, R.drawable.six_of_hearts),
    Card("spades", 6, R.drawable.six_of_spades),
    Card("clubs", 7, R.drawable.seven_of_clubs),
    Card("diamonds", 7, R.drawable.seven_of_diamonds),
    Card("hearts", 7, R.drawable.seven_of_hearts),
    Card("spades", 7, R.drawable.seven_of_spades),
    Card("clubs", 8, R.drawable.eight_of_clubs),
    Card("hearts", 8, R.drawable.eight_of_hearts),
    Card("spades", 8, R.drawable.eight_of_spades),
    Card("diamonds", 8, R.drawable.eight_of_diamonds),
    Card("clubs", 9, R.drawable.nine_of_clubs),
    Card("diamonds", 9, R.drawable.nine_of_diamonds),
    Card("hearts", 9, R.drawable.nine_of_hearts),
    Card("spades", 9, R.drawable.nine_of_spades),
    Card("clubs", 10, R.drawable.ten_of_clubs),
    Card("diamonds", 10, R.drawable.ten_of_diamonds),
    Card("hearts", 10, R.drawable.ten_of_hearts),
    Card("spades", 10, R.drawable.ten_of_spades),
    Card("clubs", 11, R.drawable.jack_of_clubs2),
    Card("diamonds", 11, R.drawable.jack_of_diamonds2),
    Card("hearts", 11, R.drawable.jack_of_hearts2),
    Card("spades", 11, R.drawable.jack_of_spades2),
    Card("clubs", 12, R.drawable.queen_of_clubs2),
    Card("diamonds", 12, R.drawable.queen_of_diamonds2),
    Card("hearts", 12, R.drawable.queen_of_hearts2),
    Card("spades", 12, R.drawable.queen_of_spades2),
    Card("clubs", 13, R.drawable.king_of_clubs2),
    Card("diamonds", 13, R.drawable.king_of_diamonds2),
    Card("hearts", 13, R.drawable.king_of_hearts2),
    Card("spades", 13, R.drawable.king_of_spades2)

)



