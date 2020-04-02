package torqueanddevelopment;

import java.util.HashSet;
import java.util.Set;

public class Solution {

static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        
        if(c_lib > c_road){
            long result = 0;
            Set<Set<Integer>> cGroups = createGroups(cities); 
            int countedCities = 0;
            for(Set<Integer> g : cGroups){
                result += (c_lib + ((g.size() -1)*c_road));
                countedCities += g.size();
            }

            result += ((n - countedCities) * c_lib);
            return result ;
        }
        else{
            return (long)c_lib * (long)n;
        }
    }

    static Set<Set<Integer>> createGroups(int[][] cities){
        Set<Set<Integer>> cGroups = new HashSet<>(); 
        Set<Set<Integer>> mergeGroups = new HashSet<>();

        for(int[] c : cities){
            cGroups.stream().filter(g-> g.contains(c[0]) || g.contains(c[1])).forEach(g-> 
                {
                    for(int i : c)
                        g.add(i);

                    mergeGroups.add(g);
                }            
            );

            Set<Integer> group = new HashSet<>();

            if(mergeGroups.size() == 1){
                continue;
            }
            else if(mergeGroups.size() > 1){
                cGroups.removeAll(mergeGroups);
                mergeGroups.stream().forEach(g-> group.addAll(g));
            }
            else{
                for(int i : c)
                        group.add(i);
                mergeGroups.clear();
            }
            cGroups.add(group);
        }

        return cGroups;
    }
}
