package com.tasks.figures.area;

public class FiguresWithoutAnglesArea implements Area {
    @Override
    public void createArea() {
        class Circle {
            private int P;
            private int R;
            private int S;
            public void createArea1() {
                S = (int) (Math.PI * Math.pow(R,2));
                System.out.println("Circle area = " + S);

            }

            class Ellipse {
                private int P;
                private int S;
                private int a;
                private int b;

                public void createArea1() {
                    S = (int) (Math.PI * a * b);
                    System.out.println("Ellipse area = " + S);

                }

            }
        }
    }
}

