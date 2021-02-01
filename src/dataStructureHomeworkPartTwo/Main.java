package dataStructureHomeworkPartTwo;

public class Main {
    public static void main(String[] args) {
        //Part One
        System.out.println("This is the answer to question one: ");
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int answerOne = QuestionOne.sumArray(myArray);
        System.out.println(answerOne);
        //Part Two
        System.out.println("This is the output of question two (the index of the biggest number in the given array): ");
        QuestionTwo.codeGiven();
        //Part Three
        System.out.println("This is the array returned in question three: ");
        int[] answerThree = QuestionThree.toPower(4,2);
        for(int number: answerThree) {
            System.out.println(number);
        }


    }

}