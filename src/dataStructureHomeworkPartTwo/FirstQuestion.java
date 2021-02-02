package dataStructureHomeworkPartTwo;

public class FirstQuestion {
    public static int sumTheArray(int[] arrayToSum) {
        int summedArray = 0;
        for(int number : arrayToSum) {
            summedArray += number;
        }
        return summedArray;
    }

}
