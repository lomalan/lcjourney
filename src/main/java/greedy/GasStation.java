package greedy;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Check sum of gas and cost
        int sumGas = 0;
        int sumCost = 0;
        for (int i = 0; i < cost.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
        }

        if (sumGas < sumCost) {
            return -1;
        }

        int result = 0;
        int total = 0;
        for (int i = 0; i < cost.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }
        return result;   
    }
}
