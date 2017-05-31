package by.bsu.company.fraction;

import by.bsu.company.fraction.entity.Fraction;
import by.bsu.company.fraction.exception.NullDenominatorException;
import by.bsu.company.fraction.fractoinOperation.ArrayFractionOperation;
import by.bsu.company.fraction.fractoinOperation.FractionalOperations;
import by.bsu.company.fraction.read.FractionRead;

/*
    Реализовать методы сложения, вычитания, умножения и деления объектов (для
    тех классов, объекты которых могут поддерживать арифметические действия).
    1.  Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    Объявить и инициализировать массив из k дробей, ввести/вы вести значения
    для массива 5 который изменяет каждый элемент массива с четным
    индексом путем добавления следующего за ним элемента.

 */
public class Main {

    public static void main(String[] args) {
       try {

           Fraction[] array = FractionRead.ArrayRead(System.in);

           System.out.println("Array:");
           for (Fraction fraction : array){
               System.out.println(fraction);
           }
           ArrayFractionOperation.changeEvenElement(array);
           System.out.println("Changed array:");
           for (Fraction fraction : array){
               System.out.println(fraction);
           }
        }
        catch (NullDenominatorException e){
            System.out.println(e.getMessage());
        }

	// write your code here
    }

}
