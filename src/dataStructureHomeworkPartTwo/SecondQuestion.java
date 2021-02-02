package dataStructureHomeworkPartTwo;

public class SecondQuestion {
    public static void exampleCodeGiven() {
        double[ ] exampleArray = {1,5,6,5,4,1};         // Creates an array
        double maximum = exampleArray[0];               // Sets variable 'maximum' as the first index of exampleArray (1)
        int index = 0;                                  // Sets variable 'index' as 0
        for (int i = 1; i<exampleArray.length; i++){    // A for loop that will iterate i by 1, starting from 1, for the length of the array given
            if (exampleArray[ i ] > maximum) {          // Indexing into the array given at the index set by the loop. Compares to 'maximum', which is initially 1.
                maximum = exampleArray[ i ];            // If the item at that index is bigger, than 'maximum', then sets 'maximum' to that value
                index = i;                              // and sets the index of that item to the variable 'index'.
            }
        }
        System.out.println(index);                      // So the method prints to console the index of the biggest item in the Array.
    }
}

