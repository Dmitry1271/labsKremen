package by.bsu.company.matrix;

import by.bsu.company.matrix.create.MatrixCreator;
import by.bsu.company.matrix.entity.Matrix;
import by.bsu.company.matrix.exception.InRangeException;
import by.bsu.company.matrix.exception.MatrixException;
import by.bsu.company.matrix.sort.SortLine;

/*Вариант C
Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов
 матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
1.  Упорядочить строки (столбцы) матрицы в порядке возрастания значений
элементов k-го столбца (строки).
*/
public class Main {

    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 2);
            MatrixCreator.fillRandomized(p, -2, 2);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);

            Matrix m3 = new Matrix(3, 3);
            MatrixCreator.fillFromStream(m3,System.in);
            System.out.println("Matrix m3 is: " + m3);
            Matrix m4 = SortLine.sortString(m3,0);
            System.out.println("Matrices sorted by colum 0 " + m4);
           // System.out.println("Matrix m3 is: " + m3);
            Matrix m5 = SortLine.sortColumn(m3,0);
            System.out.println("Matrices sorted by row 0 " + m5);
            //System.out.println("Matrix m3 is: " + m3);
        } catch (MatrixException ex) {
            System.err.println("Error of creating matrix or number of line or column" + ex);
        }
        catch (InRangeException ex) {
            System.err.println("Error of number of line or column" + ex);
        }


    }
}
