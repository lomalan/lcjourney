package binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    private final Map<String, List<ValueData>> timeMap = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        var list = timeMap.getOrDefault(key, new ArrayList<>());
        list.add(new ValueData(value, timestamp));
        timeMap.put(key, list);
    }

    public String get(String key, int timestamp) {
        var timesData = timeMap.get(key);
        if (timesData == null) {
            return "";
        } else {
            return binarySearch(timesData, timestamp);
        }
    }

    private String binarySearch(List<ValueData> valueData, int target) {
        int left = 0;
        int right = valueData.size() - 1;
        if (valueData.get(left).timestamp > target) {
            return "";
        }
        var currMin = "";
        while (left <= right) {
            int mid = (left + right) / 2;
            var midData = valueData.get(mid);
            if (midData.timestamp <= target) {
                currMin = valueData.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return currMin;
    }

    private record ValueData(
            String value,
            long timestamp
    ){}
}
