package by.bsu.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//удалить вторую строку
public class Main {

    public static void main(String[] args) {
        int[ ][ ] a = {{1,1,1},
                {2,2,2},
                {3,3,3},
                {4,4,4}
        };

       /* Arrays.deepToString: Returns a string representation of the "deep contents"
          of the specified array.  If the array contains other arrays as elements,
          the string representation contains their contents and so on.  This method is
          designed for converting multidimensional arrays to strings.
       */
        System.out.println(Arrays.deepToString(a));


        System.out.println("Исходная матрица");
        System.out.println("Число строк матрицы " + a.length);
        int k = 1;
        for (int i=k;i<a.length-1;i++){
            a[i] = a[i+1];
        }
        System.out.println(Arrays.deepToString(a));

        a[a.length-1]=null;
        System.out.println(Arrays.deepToString(a));
        System.out.println("Число строк матрицы " + a.length);//реально размерность не изменилась

        System.out.println("Вариант 1. System.arraycopy+Arrays.copyOf");
        System.arraycopy(a,2,a,2,1);
        /*arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
        копируем из src, начиная с позиции srcPos в dest, начиная с позиции destPos length элементов
        * */
        System.out.println(Arrays.deepToString(a));

        a = Arrays.copyOf(a,3);
        System.out.println(Arrays.deepToString(a));
        System.out.println("Число строк матрицы " + a.length);


        int[ ][ ] b = {{10,10,10},
                {20,20,20},
                {30,30,30},
                {40,40,40}
        };
        System.out.println("Исходная матрица");
        System.out.println(Arrays.deepToString(b));
        System.out.println("Число строк матрицы " + b.length);
        List<int[]> list = new ArrayList<int[]>(Arrays.asList(b));
        list.remove(1);
        b=list.toArray(new int[b.length-1][]);//указываем новый размер

        System.out.println(Arrays.deepToString(b));
        System.out.println("Число строк матрицы " + b.length);
    }
}
