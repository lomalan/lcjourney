package stack;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        var speedAtPositions = new float[target + 1];
        // Phase 1. Populate speed at positions
        for (int i = 0; i < position.length; i++) {
            speedAtPositions[position[i]] = (float) (target - position[i]) / speed[i];
        }

        // Phase 2. Calculate number of fleets
        float max = 0;
        int carFleets = 0;
        for (int i = speedAtPositions.length - 1; i >= 0; i--) {
            if (speedAtPositions[i] > max) {
                max = speedAtPositions[i];
                carFleets++;
            }
        }
        return carFleets;
    }
}
