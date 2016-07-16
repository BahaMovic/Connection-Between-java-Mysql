/**
 *                             The Problem
 * You are given n coins. They all look identical. They should all be the same
 * weight, too -- but one is a fake, made of a lighter metal. Your neighbor has
 * an old-fashioned balance scale that enables you to compare any two sets of
 * coins. If it tips either to the left or to the right, you will know that the
 * one of the sets is heavier than the other. Sadly, you aren't on speaking
 * terms with the neighbor, so he charges you each time you weigh anything. Your
 * task is to Design an algorithm to find the fake coin in the fewest number of
 * weighings.
 */
package fakecoin;

public class FakeCoin {

    private int StartIndex, EndIndex, ArraySize;


// function that returns the index of the Fake Coin Position 
    public int FindFakeCoin(int[] coins, int Start, int End) {

        // the base condition to stop the recursive loop if you have only one coin & return its position as the FakeCoinPosition coin
        this.ArraySize = End - Start;
        if (ArraySize <2) {
            // if there is no fake coin return -1
            if (Start>= coins.length||coins[Start]==5)
            {
                return -1;
            }
            // return the position of the fake coin
            else
            return Start;
        }

        // function that divides the coins into piles & 
        //weighs them and updates the first & last indices of the new part of the array that contains the FakeCoinPosition coin 
        weigh(coins, Start, End);

        // call the function recursively with the new indices
        return FindFakeCoin(coins, this.StartIndex, this.EndIndex);

    }

    // function that divides the Coins into piles
    // & weighs them 
    // and updates the first & last indices of the new part of the array that contains the Fake Coin Position
    private void weigh(int[] Coins, int Start, int End) {

        int Divider = this.ArraySize / 3;
        // to handle the case of having two coins
        if (Divider == 0) {
            Divider = 1;
        }

        // set pointer to the end of first part of the array
        int EndOfFirstPart = Start + Divider;

        // set pointer to the end of second part of the array
        int EndOfSecondPart = Start + (Divider * 2);

        // get the weight of the left pile of the Coins by getting the sum of all the elements
        int LeftPileWeight = WeighCoins(Coins, Start, EndOfFirstPart);

        // get the weight of the right pile of the Coins by getting the sum of all the elements
        int RightPileWeight = WeighCoins(Coins, EndOfFirstPart, EndOfSecondPart);

        //Update the first & last indices of the new part of the array that contains the FakeCoinPosition coin
        if (LeftPileWeight < RightPileWeight) {

            this.StartIndex = Start;
            this.EndIndex = EndOfFirstPart;

        } else if (LeftPileWeight > RightPileWeight) {

            this.StartIndex = EndOfFirstPart;
            this.EndIndex = EndOfSecondPart;

        } else {

            this.StartIndex = EndOfSecondPart;
            this.EndIndex = End;
        }

    }

    // get the weight of coins pile by getting the sum of all the elements in this array
    private int WeighCoins(int[] Coins, int Start, int End) {
        int sum = 0;
        for (int i = Start; i < End; i++) {

            sum += Coins[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        FakeCoin Test = new FakeCoin();
        int[] Coins = {5,5,5,3,5,5,5};
        int FakeCoinPosition = Test.FindFakeCoin(Coins, 0, Coins.length);
        System.out.println("The Fake Coin is located at position: "+FakeCoinPosition);

    }

}
