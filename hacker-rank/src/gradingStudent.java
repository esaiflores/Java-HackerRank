import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class gradingStudent {


    static class Result {

        /*
         * Complete the 'gradingStudents' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY grades as parameter.
         */

        public static List<Integer> gradingStudents(List<Integer> grades) {

            List<Integer> list = new ArrayList();
            for(int i=0;i<grades.size();i++)
            {
                int x = grades.get(i);
                if(x>=38 && (x+5 - x%5)-x<3)
                {
                    list.add(x+5 - x%5);
                }else
                {
                    list.add(x);
                }
            }
            return list;


        }

    }

}
