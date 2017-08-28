* This game is configurable for two or more players. There is a input.txt file, where you can define name of players.
Main program reads input from *input.txt* file.



# GameEngine class
## Package - com.experis.nwea.game.engine

- This class is responsible to create a game strategy.

#SimpleWarGameStrategy
##Package - com.experis.nwea.game.engine.strategy

- This class contains the simple rule to play the game. Rules are
 -- Among n number of players if 1 player loose the game, which remaining cards 0 or the least, game will be finished and
 winner with maximum number of cards left, will be declared the winner.
 -- If there is a tie between winner, we are not considering further logic and picking up one of them and declare him/her winner


#Application class (driver class)
##Package: com.experis.nwea.game

- Driver class, contains main() method. To execute the game, we need to run main() method in this class


#Dealer class (computer will be the dealer)
##Package - com.experis.nwea.game.bootstrap

- main program will create Dealer object.

- Dealer will be a singleton object.

- Dealer will create a Deck object and shuffle the deck using Deck.shuffle() method.

- Dealer object will be responsible to deal the cards among players. In this case computer will be the dealer. it will call
deal() method of its own class.



# CardPile class
## package: com.experis.nwea.game.object

- pile class keeps face up cards temporarily, until winner for that battle or war is decided. once player decided, these face up cards are
added back to that player's stack.

## Sample output:

        NAME 		CARD 		RANK 		SUITE
		---- 		---- 		---- 		----
		Joie		🂸			8			HEARTS
		Madelyn		🂥			5			SPADES
		Pattie		🂪			10			SPADES
        --------------------*****---------------------------------
        Winner of this round is:		 Pattie with card rank 10
        ------------------******----------------------------------

		-----------*********--------------
		NAME 		CARD 		RANK 		SUITE
		---- 		---- 		---- 		----
		Pattie		🃘			8			CLUBS
			-----------*********-------------
						WAR
			-----------*********--------------
    =======================================================
				FINAL RESULT
	-------------------------------------------------------
		NAME 			DECK SIZE
		---- 			----------
		Joie			9
		Madelyn			0
		Pattie			12
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	|			WINNER::	Pattie							|
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

[Unicode](https://www.compart.com/en/unicode/block/U+1F0A0)




