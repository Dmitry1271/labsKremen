package by.bsu.company.matrix.sort;

import by.bsu.company.matrix.entity.Matrix;
import by.bsu.company.matrix.exception.InRangeException;
import by.bsu.company.matrix.exception.MatrixException;

import java.util.Arrays;

/**
 * Created by HP on 17.01.2017.
 */
public class SortLine {
    public static Matrix sortString(Matrix matrix, int col) throws MatrixException,InRangeException{
        Matrix result=null;
        if ( col < 0 || col >= matrix.getHorizontalLine(0).length )
            return result;
        double[][] arrRes=Arrays.copyOf(matrix.getA(),matrix.getVerticalSize());
        Arrays.sort(arrRes,(s1,s2)->(int)(s1[col]-s2[col]));
        return new Matrix(arrRes);
    }

    public static Matrix sortColumn(Matrix matrix, int row) throws MatrixException,InRangeException{
        Matrix result=null;
        if ( row < 0 || row >= matrix.getVerticalSize())
            return result;
        double[][] arrRes=transpose(matrix.getA());
        Arrays.sort(arrRes,(s1,s2)->(int)(s1[row]-s2[row]));
        return new Matrix(transpose(arrRes));
    }

    private static double[][] transpose(double[][] matr){
        int row = matr.length;
        int col = matr[0].length;
        double[][] res=new double[col][row];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                res[i][j]=matr[j][i];
            }
        }
        return res;
    }
}
