class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       //pura tank=4-1(jo age milega) 
        int puratank = 0;
        int tank =0;//jo tank aage rakha hua hai
        int start=0;//jaha se bhi hum iteration shuru hua hai
        for(int i=0;i<gas.length;i++){
            int gain = gas[i]-cost[i];
            puratank+=gain;
            tank+=gain;
            if (tank<0){
                start=i+1;
                tank=0;
            }

        }
        return puratank>=0? start :-1;


    }
}