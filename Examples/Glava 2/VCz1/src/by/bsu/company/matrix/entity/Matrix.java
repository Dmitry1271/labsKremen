package by.bsu.company.matrix.entity;

import by.bsu.company.matrix.exception.InRangeException;
import by.bsu.company.matrix.exception.MatrixException;

import java.util.Arrays;

/**
 * Created by HP on 17.01.2017.
 */
public class Matrix {
    private double[ ][ ] a;

    public Matrix(double[][] a) {
        this.a = Arrays.copyOf(a,a.length);
    }

    public Matrix(int n, int m) throws MatrixException {
        // проверка на отрицательные значения размерности матрицы
        if ((n < 1) || (m < 1)) {
            throw new MatrixException();
        }
        a = new double[n][m];
    }

    public double[][] getA() {
        return a;
    }

    public int getVerticalSize() {
        return a.length;
    }

    public int getHorizontalSize() {
        return a[0].length;
    }

    public double[] getHorizontalLine(int i)throws InRangeException {
        if((i<0)||(i>=a[0].length)){
            throw new InRangeException();
        }
        return a[i];
    }
    public double getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            return a[i][j];
        }
        throw new MatrixException();
    }
    public void setElement(int i, int j, double value) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            a[i][j] = value;
        }
        else {
            throw new MatrixException();//опечатка в учебнике!!
        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + a.length + "x" + a[0].length + "\n");
        for (double [ ] row : a) {
            for (double value : row) {
                //s.append(value + " ");
                s.append(String.format("%6.2f",value));
            }
            s.append("\n");
        }
        return s.toString();
    }
    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        if ( i >= 0 && i < a.length && j >= 0 && j < a[0].length ) {
           return true;
        } else {
            return false;
        }
    }
}

