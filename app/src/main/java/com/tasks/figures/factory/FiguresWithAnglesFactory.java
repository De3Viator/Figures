package com.tasks.figures.factory;

import com.tasks.figures.area.Area;
import com.tasks.figures.area.FiguresWithAngelsArea;
import com.tasks.figures.perimeter.FiguresWithAngelsPerimeter;
import com.tasks.figures.perimeter.Perimeter;

public class FiguresWithAnglesFactory implements FiguresFactory {
    @Override
    public Area createArea() {
        return new FiguresWithAngelsArea();
    }

    @Override
    public Perimeter createPerimeter() {
        return new FiguresWithAngelsPerimeter();
    }


}
