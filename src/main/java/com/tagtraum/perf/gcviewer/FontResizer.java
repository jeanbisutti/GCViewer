package com.tagtraum.perf.gcviewer;

import javax.swing.*;
import java.awt.*;

public class FontResizer {

    private FontResizer() {}

    private static final double SMALL_INCREASE_FACTOR = 1.41;

    private static final double LARGE_INCREASE_FACTOR = 1.9;

    private static final double VERY_LARGE_INCREASE_FACTOR = 2.5;

    public static void smallIncreaseFontSize(JLabel label) {
        increaseFontSize(label, SMALL_INCREASE_FACTOR);
    }

    public static Font smallIncreaseFontSize(Font font) {
        return increaseFontSize(font, SMALL_INCREASE_FACTOR);
    }

    public static void largeIncreaseFontSize(JLabel label) {
        increaseFontSize(label, LARGE_INCREASE_FACTOR);
    }

    public static Font largeIncreaseFontSize(Font font) {
        return increaseFontSize(font, LARGE_INCREASE_FACTOR);
    }


    public static void largeIncreaseFontSize(JMenuItem menuItem) {
        Font font = menuItem.getFont();
        Font newFont =  increaseFontSize(font, LARGE_INCREASE_FACTOR);
        menuItem.setFont(newFont);
    }

    public static Font veryLargeIncreaseFontSize(Font font) {
        return increaseFontSize(font, VERY_LARGE_INCREASE_FACTOR);
    }

    public static void increaseFontSize(JLabel label, double factor) {
        Font font = label.getFont();
        Font newFont = increaseFontSize(font, factor);
        label.setFont(newFont);
    }

    public static Font increaseFontSize(Font font, double factor) {
        return new Font("New font", font.getStyle(), (int) (font.getSize() * factor));
    }

}
