package com.tagtraum.perf.gcviewer.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Extends {@link DoubleData} with the functionality to calculate percentiles.
 */
public class DoubleDataPercentile extends DoubleData {
    private List<Double> doubleSet = new ArrayList<>();
    private boolean isSorted = false;

    @Override
    public void add(double x) {
        super.add(x);
        doubleSet.add(x);
        isSorted = false;
    }

    public double getPercentile(int percentile) {
        if (!isSorted) {
            Collections.sort(doubleSet);
        }

        if (percentile < 10) {
            percentile = 10;
        }
        else if (percentile > 100) {
            percentile = 100;
        }

        return doubleSet.get((int)Math.round(percentile / (double)100 * doubleSet.size())-1);
    }
}
