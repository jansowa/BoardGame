<h1>GAMEBOARD PROJECT</h1>

<h2>ENG</h2>
<h4>A library for board games with the alpha-beta pruning algorithm. To make a game you need to implement abstract classes:</h4>
<ul>
<li>mechanics/BoardMechanics - functions with mechanics of the game, single moves etc.</li>
<li>mechanics/GameDAO - functions for save & load game</li>
<li>mechanics/GameUI - game user interface - choice of single or multiplayer, make single move</li>
<li>domain/GameBoard - here describe propeties of the board (number of fields etc.)</li>
<li>controller/GameController - the controller for GameUI functions (single/multiplayer, single move)</li>
<li>ai/AlphaBetaPruningBot - implement functions emptyIndexes (represents empty fields on board), undoMove</li>
<li>ai/Evaluate - most important class for bot. You need to decide how to desribe evaluation function from alpha-beta pruning algorithm</li>
</ul>
I made simple implementation using this library, you can check it here:
https://github.com/jansowa/TicTacToe

<h4>WHAT WOULD I CHANGE IN THID PROJECT WITH CURRENT KNOWLEDGE?</h4>
<ul>
<li>Most important - I would write tests using Mocks (from Mockito or Spock)</li>
<li>I would use Clean Code principles - first of all I would choose better names for variables, functions, classes, write shorter functions.</li>
<li>Some classes don't need to be abstract (for example GameController) - it makes implementation of game more difficult</li>
</ul>

<h2>PL</h2>
<h4>Biblioteka do gier planszowych z algorytmem alfa-beta (rozszerzenie algorytmu minimax). W celu zrobienia gry musisz zaimplementować klasy abstrakcyjne:</h4>
<ul>
<li>mechanics/BoardMechanics = funkcje z mechaniką gry, pojedynczymi posunięciami itp.</li>
<li>mechanics/GameDAO - funckej dla zapisu i odczytu gry</li>
<li>mechanics/GameUI - interfejs użytkownika w grze - wybór trybu (singleplayer lub multiplayer), pojedynczy ruch</li>
<li>domain/GameBoard - tutaj opisz właściwości planszy (liczba pól itp.)</li>
<li>controller/GameController - kontroler dla funkcji GameUI (single/multiplayer, singleMove)</li>
<li>ai/AlphaBetaPruningBot - zaimplementuj funckje enptyIndexes (reprezentuje puste pola na planszy), undoMove</li>
<li>ai/Evaluate - najważniejsza klasa dla bota. Musisz zdecydować jak opisać funkcję ewaluacji algorytmu alpha-beta</li>
</ul>
Wykonałem prostą implementację używając tej biblioteki, możesz sprawdzić ją tutaj:
https://github.com/jansowa/TicTacToe

<h4>CO ZMIENIŁBYM W PROJEKCIE Z OBECNĄ WIEDZĄ?</h4>
<ul>
<li>Najważniejsze - pisałbym testy klas używając Mocków (z Mockito lub Spocka).</li>
<li>Kierowałbym się zasadami Clean Code - przede wszystkim właściwie dobierał nazwy zmiennych, funkcji, klas, pisał krótsze funkcje.</li>
<li>Niektóre klasy nie muszą  być abstrakcyjne (na przykład GameController) - to czyni implementację gry trudniejszą</li>
</ul>
