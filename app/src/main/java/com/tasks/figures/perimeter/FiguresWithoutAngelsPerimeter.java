package com.tasks.figures.perimeter;

public class FiguresWithoutAngelsPerimeter implements Perimeter {
    @Override
    public void createPerimeter() {
        class Circle {
            private int P;
            private int R;


            public void createPerimeter1() {
                P = (int) (2 * Math.PI * R);
                System.out.println("Circle perimeter = " + P);

            }
        }
        class Ellipse {
            private int P;
            private int S;
            private int a;
            private int b;


            public void createPerimeter1() {
                P = (int) (2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
                System.out.println("Ellipse perimeter = " + P);

            }
        }
    }
}
