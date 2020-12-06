package com.tasks.figures;

import com.tasks.figures.factory.FiguresFactory;
import com.tasks.figures.factory.FiguresWithAnglesFactory;
import com.tasks.figures.factory.FiguresWithoutAnglesFactory;

public class DemoFigures {
    public static String FIGURESWITHANGLES_TYPE = "FIGUREWITHANGLES_TYPE";
    public static String FIGURESWITHOUTANGLES_TYPE = "FIGUREWITHOUTHANGLES_TYPE";

    public static Figures configureFigure(String type) {
        FiguresFactory factory = null;
        Figures figures;

        if (type.equals(FIGURESWITHANGLES_TYPE)) {
            factory = new FiguresWithAnglesFactory();
        } else if (type.equals(FIGURESWITHOUTANGLES_TYPE)) {
            factory = new FiguresWithoutAnglesFactory();
        } else {
            System.out.println("We do not know of other types");
        }
        figures = new Figures(factory);
        return figures;
    }
}