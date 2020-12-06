package com.tasks.figures;

import com.tasks.figures.area.Area;
import com.tasks.figures.factory.FiguresFactory;
import com.tasks.figures.perimeter.Perimeter;

public class Figures {
    private Area area;
    private Perimeter perimeter;

    public Figures (FiguresFactory factory) {
        area = factory.createArea();
        perimeter = factory.createPerimeter();
    }

    public Area getArea() {
        return area;
    }

    public Perimeter getPerimeter(){
        return perimeter;
    }
}