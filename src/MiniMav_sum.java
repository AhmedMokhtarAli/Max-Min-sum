/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimav_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
class Result {

    public static void miniMaxSum(List<Integer> arr) {
       List<Long> longs = arr.stream()
        .mapToLong(Integer::longValue)
        .boxed().collect(Collectors.toList());
        Long min = longs.get(0);
        Long max=longs.get(0);
         Long sumWithMin=0l;
        Long sumWithMax=0l;
        for(int i=1;i<longs.size();i++)
        {
            if(longs.get(i)<min)
                min=longs.get(i);
            if(arr.get(i)>max)
                max=longs.get(i);
        }
      
        for(int i=0;i<longs.size();i++)
        {
            if(max!=min){
            if(longs.get(i)!=max)
                
                sumWithMin+=arr.get(i);
            if(longs.get(i)!=min)
                sumWithMax+=arr.get(i);
        }
            else
            {
                for(int j=0;j<longs.size()-1;j++)
                {
                  sumWithMin+=longs.get(i);  
                }
                sumWithMax=sumWithMin;
                break;
               
            }
        }
        System.out.println(sumWithMin+" "+sumWithMax);

    }

}

/**
 *
 * @author ahmed
 */
public class MiniMav_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
