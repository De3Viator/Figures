package com.tasks.figures.factory;

import com.tasks.figures.area.Area;
import com.tasks.figures.area.FiguresWithoutAnglesArea;
import com.tasks.figures.perimeter.FiguresWithoutAngelsPerimeter;
import com.tasks.figures.perimeter.Perimeter;

public class FiguresWithoutAnglesFactory implements FiguresFactory {

    @Override
    public Area createArea() {
        return new FiguresWithoutAnglesArea();
    }

    @Override
    public Perimeter createPerimeter() {
        return new FiguresWithoutAngelsPerimeter();
    }
}
