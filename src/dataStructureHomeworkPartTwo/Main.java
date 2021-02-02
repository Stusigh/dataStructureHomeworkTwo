package dataStructureHomeworkPartTwo;

public class Main {
    public static void main(String[] args) {
        //First Part
        System.out.println("Question one: ");
        int[] givenArray = {5,754,34,753,36};
        int answerOne = FirstQuestion.sumTheArray(givenArray);
        System.out.println(answerOne);
        //Second Part
        System.out.println("This is the output of question two (the index of the biggest number in the given array): ");
        SecondQuestion.exampleCodeGiven();
        //Third Part
        System.out.println("Array returned in question three: ");
        int[] answerThree = ThirdQuestion.toPower(4,2);
        for(int number: answerThree) {
            System.out.println(number);
        }
    }
}