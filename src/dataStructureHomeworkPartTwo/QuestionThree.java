package dataStructureHomeworkPartTwo;

public class QuestionThree {
    public static int[] toPower(Integer size, Integer power) {
        int[] returnArray = new int[size];

        for(int i=0 ;i < returnArray.length; ++i) {
            int newNumber = 1;
            for(int j = 1; j<= power; ++j){
                newNumber = i*newNumber;
            }
            returnArray[i] = newNumber;
        }
        return returnArray;



    }
}
