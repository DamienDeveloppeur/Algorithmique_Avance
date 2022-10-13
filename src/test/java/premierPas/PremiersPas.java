package premierPas;


import com.sun.jdi.Value;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PremiersPas {

    @Test
    public void triParInsertionTest(){
//        List<Integer> list = Arrays.asList(12,8,9,5,4,1,2);
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);

        List<Integer> newList = new ArrayList<Integer>();
        //
        for(int i = 0; i < list.size(); i++ ){
            int key = list.get(i);
            int iteration = 0;
            for (Integer val : list) {
                if(key < val) {
                    list.remove(Integer.valueOf(key));
                    list.add(iteration,key);

                    break;
                }
                iteration++;
            }
        }









































        /**
         *     pour j = 2 à list.length()
         *
         *             # mémoriser T[i] dans x
         *             clé = T[i]
         *
         *             i = j - 1
         *
         *             tant que i > 0 et list(i) > clé
         *                      list(i + 1) = list(i)
         *                      i = i - 1
         *
         *             # placer x dans le "trou" laissé par le décalage
         *             list(i + 1) = clé
         */

        assertThat(list).containsExactly(1,2,4,5,8,9,12);
    }
}
