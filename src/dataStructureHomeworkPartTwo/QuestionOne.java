package dataStructureHomeworkPartTwo;

public class QuestionOne {
    public static int sumArray(int[] arrayToSum) {
        int summedArray = 0;
        for(int number : arrayToSum) {
            summedArray += number;
        }
        return summedArray;
    }

}
