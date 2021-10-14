from os import system
import random

score = 0
score1 = 0

def toss():
    system('cls')
    toss = random.randint(0, 1)
    a = int(input("Heads or Tails Choose 0 for Heads and 1 for Tails: \n"))
    if(a == 0 or a == 1):
        if(toss == a):
            if(toss == 1):
                print("You Won Its a Tails \n")
                choice()
            else:
                print("You Won Its a Head")
                choice()
        else:
            if(toss == 1):
                print("You lose Its a Head\nALPHA Choose to Bat First\n")
                bowl()
                bat()
                winLose()
            else:
                print("You lose Its a Tail\nALPHA Choose to Bat First\n")
                bowl()
                bat()
                winLose()
    else:
        print("Invails Input\n")


def choice():
    system('cls')
    print("You Won The Toss\n")
    d = int(input("1. Batting \n2. Bowling \nEnter Your Choice: \n"))
    switcher = {
        1: lambda: (bat(), bowl(), winLose()),
        2: lambda: (bowl(), bat(), winLose()),
    }
    return switcher.get(d)()


def bat():
    k = 0
    print("Game Begins Your Batting\n")
    while k == 0:
        player = int(input("Enter Your Choice: \n"))
        if(player == 0 or player == 1 or player == 2 or player == 3 or player == 4 or player == 5 or player == 6):
            alpha = random.randint(0, 6)
            print('Computer: {0}\nPlayer: {1}\n'.format(alpha, player))
            if(alpha != player):
                score = score + player
                print("Score: {0}\n".format(score))
            else:
                print("OUT\n")
                print("Score: {0}\n".format(score))
                k = 1
        else:
            print("Invalid Input")


def bowl():
    l = 0
    print("Game Begins Your Batting\n")
    while l == 0:
        player1 = int(input("Enter Your Choice: \n"))
        if(player1 == 0 or player1 == 1 or player1 == 2 or player1 == 3 or player1 == 4 or player1 == 5 or player1 == 6):
            alpha1 = random.randint(0, 6)
            print('Computer: {0}\nPlayer: {1}\n'.format(alpha1, player1))
            if(alpha1 != player1):
                score1 = score1 + player1
                print("Score: {0}\n".format(score1))
            else:
                print("OUT\n")
                print("Score: {0}\n".format(score1))
                l = 1
        else:
            print("Invalid Input")

def winLose():
    if (score1 < score):
        print("You Won The Match\n")
        print("\n\nThanks For Playing\n")
    elif(score == score1):
        print("Match Tied\n")
        print("\n\nThanks For Playing\n")
    else:
        print("You Lose Better Luck Next Time\n")
        print("\n\nThanks For Playing\n")


def main():
    system('cls')
    x = int(input(
        "1. Play Game \n2. How to play? \n3. About \n4. Exit \nEnter your choice: \n"))
    switcher = {
        1: toss(),
    }
    return switcher.get(x)()


main()
