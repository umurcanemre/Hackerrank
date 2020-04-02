package fraudulentactivitynotifications;

import java.util.Arrays;

public class Solution {
    static int activityNotifications(int[] expenditure, int d) {
        int notifCount = 0;
        for(int i=0; i<expenditure.length - (1+d); i++){
            if(expenditure[i + d] >= (2* median(expenditure, i, d)) ){
                notifCount++;
            }
        }
        return notifCount;
    }

    static double median(int[] expenditure, int startP, int d){
    	int[] temp = new int[d];
    	for(int i=0; i<d; i++) {
    		temp[i] = expenditure[startP+i];
    	}
    	Arrays.sort(temp);
    	
    	
        if(d%2 == 0){
            return (temp[d/2] + temp[ (d/2)-1])/2;
        }
        return temp[d/2];
    } 
}
