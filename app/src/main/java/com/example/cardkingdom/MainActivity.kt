package com.example.cardkingdom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

        lateinit var imageView: ImageView
        lateinit var button: Button
        lateinit var imageViewHeart: ImageView
        lateinit var imageViewClubs: ImageView
        lateinit var imageViewDiamond: ImageView
        lateinit var imageViewSpade: ImageView


        var valor = ""
        var poang = 0
        var rundor = 0




    lateinit var tvGeneratedCard: TextView
    lateinit var textView: TextView
    lateinit var poangen: TextView
    lateinit var textViewvaldvalor: TextView
    lateinit var textViewrunda: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            imageView= findViewById(R.id.imageView);
            button= findViewById(R.id.newcard);
            imageViewHeart=(findViewById(R.id.imageViewHeart))
            imageViewClubs=(findViewById(R.id.imageViewClubs))
            imageViewDiamond=(findViewById(R.id.imageViewDiamond))
            imageViewSpade=(findViewById(R.id.imageViewSpade))

            tvGeneratedCard =findViewById(R.id.textViewGenerateCard)
            poangen =findViewById(R.id.textView2)
            textViewvaldvalor =findViewById(R.id.textViewValdValor)
            textViewrunda =findViewById(R.id.textViewrundor)
            textView=findViewById(R.id.textruta)

               // Nytt kort knappen
                button.setOnClickListener {
                genereraNyttKort()
            }

        // Beroende på vilken immageview som trycks på så tilldelas ett specifikt värde till valor
        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.imageViewHeart -> valor = "hearts"
                R.id.imageViewClubs -> valor = "clubs"
                R.id.imageViewDiamond -> valor = "diamonds"
                R.id.imageViewSpade -> valor = "spades"
            }
            // Uppdaterar så man vet vilken valör man har valt
            valdValor()
        }

        imageViewHeart.setOnClickListener(clickListener)
        imageViewClubs.setOnClickListener(clickListener)
        imageViewDiamond.setOnClickListener(clickListener)
        imageViewSpade.setOnClickListener(clickListener)



        }

    // genererar random kort
    fun genereraNyttKort() {
        // Körs endast om man valt en valör
        if (valor!=="") {

            val r = Random //Skapar ett objekt
            val n = r.nextInt(allCards.size) // Tilldelar en random siffra beroende på antal kort
            val card = allCards[n] // Hämtar elementet på plats n och tilldelar de till variablen
            imageView.setImageResource(card.cardImage)
            tvGeneratedCard.text = "Kortvärde: ${card.cardValue}" //Skriver ut kortvärdet
            rundor++  // Ökar variabel med 1
            textViewrunda.text= "Antal kort $rundor" //Skriver ut antal kort som dragits


            // tilldelar poäng om man gissat rätt valör
            if (card.cardsuit.contains(valor)) {
                poang++
                nyPoang() //uppdaterar

                //Kontrollerar om man vunnit (fått 10 poäng) och nollställer
                if (poang == 10) {

                    textView.text = "Du vann på $rundor försök!"
                    poang = 0
                    nyPoang()
                    rundor = 0
                }

            }
        }


    }

// Skriver ut vilken valör som är vald
    fun valdValor (){
        textViewvaldvalor.text="Vald valör: $valor"

    }
// Skriver ut hur många poäng man har
    fun nyPoang (){
        poangen.text = "Poäng: $poang"

    }



}