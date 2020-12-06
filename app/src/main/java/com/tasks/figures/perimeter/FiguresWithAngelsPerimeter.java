package com.tasks.figures.perimeter;

public class FiguresWithAngelsPerimeter implements Perimeter  {
    @Override
    public void createPerimeter() {
        class Square {

            private int P;
            private int S;
            private int a;

            public void createPerimeter() {
                P = a * 4;
                System.out.println("Square perimeter = " + P);
            }
        }

        class Triangle {

            private double S;
            private double R;
            private double A;
            private double B;
            private double C;
            private int P;
            private int a;
            private int b;
            private int c;


            public void createPerimeter() {

                P= a + b + c;
                System.out.println("Triangle perimeter = " + P);

            }


        }

    }
}
