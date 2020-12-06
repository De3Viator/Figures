package com.tasks.figures.factory;

import com.tasks.figures.area.Area;
import com.tasks.figures.perimeter.Perimeter;

public interface FiguresFactory {
    Area createArea();
    Perimeter createPerimeter();
}
