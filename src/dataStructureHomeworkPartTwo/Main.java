package dataStructureHomeworkPartTwo;

public class Main {
    public static void main(String[] args) {
        //Part One
        System.out.println("This is the answer to question one: ");
        int[] myArray = {5,754,34,753,36};
        int answerOne = FirstQuestion.sumTheArray(myArray);
        System.out.println(answerOne);
        //Part Two
        System.out.println("This is the output of question two (the index of the biggest number in the given array): ");
        SecondQuestion.exampleCodeGiven();
        //Part Three
        System.out.println("This is the array returned in question three: ");
        int[] answerThree = ThirdQuestion.toPower(4,2);
        for(int number: answerThree) {
            System.out.println(number);
        }
    }
}