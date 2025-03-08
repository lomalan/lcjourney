package greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PartitionLabelsTest {
    private PartitionLabels partitionLabels = new PartitionLabels();
    
    @Test
    void multiplePartitions() {
        var result = List.of(9, 7, 8);
        assertEquals(result, partitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    void onePartition() {
        var result = List.of(10);
        assertEquals(result, partitionLabels.partitionLabels("eccbbbbdec"));
    }
}
