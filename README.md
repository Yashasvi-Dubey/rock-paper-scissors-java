# Rock Paper Scissors (Java)

A small command-line rock paper scissors game I made while learning Java.
You play one round against the computer, which picks randomly.

## How to run

You need JDK 14 or newer (the code uses the `case ->` switch syntax).

    javac Rock_Paper_Scissor.java
    java Rock_Paper_Scissor

The game shows a menu and asks for a number:

    0- Rock
    1- paper
    2- Scissor
    Enter your choice

Type 0, 1, or 2 and press Enter. The bot's choice is printed, then the result
(You won / You lost / Draw).

## How it works

- `Random.nextInt(3)` picks the bot's move
- `Scanner` reads your choice
- A `switch` on your choice compares it with the bot's choice to decide the result
- Typing a number other than 0, 1, or 2 prints "Choose valid Item"

## What I learned

- Taking input with `Scanner` and generating random numbers with `Random`
- Using `switch` with `if / else if` inside each case
- (add something that was actually new or confusing for you)
