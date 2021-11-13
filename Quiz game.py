Create account

5

2

8

Cover image for How to build a Quiz Game in Python
Rishabh Singh ⚡
Rishabh Singh ⚡
Posted on 15 Feb

How to build a Quiz Game in Python
#python #tutorial #beginners #codenewbie
Python Projects for Beginners (15 Part Series)
1
How to build an Acronym Generator in Python
2
How to build an Alarm Clock in Python
...
11 more parts...
14
How to build a Guess the Number Game in Python
15
How to build a Madlib Game in Python
Hello everyone, today we are going to create a fun Quiz Game in python.

How does it work?
Our quiz game will be asking questions to the player to which player has to reply with the right answer. Each question will have 3 attempts. If the player fails to answer the question within 3 attempts then the game will move on to the next question and the player will receive zero points. But if the player gives the right answer to the question then, he will get 1 point. At the end of the game, the total points scored by the player are displayed.

Alt Text

I hope the abstract working of the game is clear to everyone, now let's move on to the project setup.

Project Setup
Before we start coding this project, we need some questions and answers for our game.

In our case, we are going to use some easy superhero based questions.

Feel free to use your own questions or answers for the game. Our questions and answers will be stored in a separate python file in a form of a python dictionary.

Here how it looks:
quiz = {
    1 : {
        "question" : "What is the first name of Iron Man?",
        "answer" : "Tony"
    },
    2 : {
        "question" : "Who is called the god of lightning in Avengers?",
        "answer" : "Thor"
    },
    3 : {
        "question" : "Who carries a shield of American flag theme in Avengers?",
        "answer" : "Captain America"
    },
    4 : {
        "question" : "Which avenger is green in color?",
        "answer" : "Hulk"
    },
    5 : {
        "question" : "Which avenger can change it's size?",
        "answer" : "AntMan"
    },
    6 : {
        "question" : "Which Avenger is red in color and has mind stone?",
        "answer" : "Vision"
    }
}
