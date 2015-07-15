package com.tagtraum.perf.gcviewer.math;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:gcviewer@gmx.ch">Joerg Wuethrich</a> <p>created on: 15.07.2015</p>
 */
public class TestDoubleDataPercentile {
    private DoubleDataPercentile ddp;

    @Before
    public void setup() throws Exception {
        ddp = new DoubleDataPercentile();
        ddp.add(15);
        ddp.add(20);
        ddp.add(35);
        ddp.add(40);
        ddp.add(50);
    }

    @Test
    public void zero() throws Exception {
        assertThat("10 percentile", ddp.getPercentile(10), closeTo(15, 0.1));
    }

    @Test
    public void fifty() throws Exception {
        assertThat("50 percentile", ddp.getPercentile(50), closeTo(35, 0.1));
    }

    @Test
    public void seventyfive() throws Exception {
        assertThat("75 percentile", ddp.getPercentile(75), closeTo(40, 0.1));
    }

    @Test
    public void hundred() throws Exception {
        assertThat("100 percentile", ddp.getPercentile(100), closeTo(50, 0.1));
    }
}
