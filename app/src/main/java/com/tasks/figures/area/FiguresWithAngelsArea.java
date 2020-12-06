package com.tasks.figures.area;

public class FiguresWithAngelsArea implements Area {
    @Override
    public void createArea() {
        class Square {
            private int P;
            private int S;
            private int a;



            public void createArea() {
                S = (int) Math.pow(a,2);
                System.out.println("Square area = " + S);

            }
        }

        class Triangle {

            private double S;
            private double R;
            private double A;
            private double B;
            private double C;
            private int P;

            public void createArea() {
                S = 2 * Math.pow(R, 2) * Math.sin(A) * Math.sin(B) * Math.sin(C);

                System.out.println("Triangle area = " + S);
            }
        }
    }
}
