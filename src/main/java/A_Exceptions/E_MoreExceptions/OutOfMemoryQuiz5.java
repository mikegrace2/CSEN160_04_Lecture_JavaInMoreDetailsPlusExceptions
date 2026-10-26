package A_Exceptions.E_MoreExceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryQuiz5 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        try{
            int[] hugeArray = new int[1000000000]; // Attempt to allocate a large array
            for (int i = 0; i < hugeArray.length; i++) {
                list.add(i); // Add elements to the list
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            System.out.print("Memory exhausted! OutOfMemoryError caught.");
            System.gc();
        }
    }
}

