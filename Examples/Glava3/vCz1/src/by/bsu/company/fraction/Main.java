package by.bsu.company.fraction;

import by.bsu.company.fraction.entity.Fraction;
import by.bsu.company.fraction.entity.Polinom;
import by.bsu.company.fraction.entityOperation.ArrayPolinomOperation;
import by.bsu.company.fraction.entityOperation.PolinomOperation;
import by.bsu.company.fraction.exception.NullDenominatorException;

import java.util.TreeMap;

/*
    Реализовать методы сложения, вычитания, умножения и деления объектов (для
    тех классов, объекты которых могут поддерживать арифметические действия).
    1.  Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    Объявить и инициализировать массив из k дробей, ввести/вы вести значения
    для массива дробей. Создать массив/список/множество объектов и передать
    его в метод, который изменяет каждый элемент массива с четным
    индексом путем добавления следующего за ним элемента.
    Вариант С
1.  Определить  класс  Полином  c  коэффициентами  типа  Рациональная 
Дробь. Объявить массив/список/множество из n полиномов и определить
сумму полиномов массива.

 */
public class Main {

    public static void main(String[] args) {
      try {
          Polinom[] pArr=new Polinom[4];

          TreeMap<Integer, Fraction> poly1 = new TreeMap<Integer, Fraction>((Integer i1,Integer i2)->i2-i1);
          poly1.put(3,new Fraction(1,9));
          poly1.put(2,new Fraction(4,9));
          poly1.put(0,new Fraction(-7,9));
          // перебор элементов

          pArr[0] = new Polinom(poly1);
          pArr[1] = new Polinom(3,-7,9,2,-4,9,1,2,9,0,-7,9);
          pArr[2] = new Polinom(7,-5,9);
          pArr[3] = new Polinom(3,-1,9,0,-5,9);

          System.out.println("pArr");
          System.out.println(ArrayPolinomOperation.toString(pArr));

          System.out.println("sum");
          System.out.println(ArrayPolinomOperation.sumArray(pArr));
        }
        catch (NullDenominatorException e){
            System.out.println(e.getMessage());
        }


	// write your code here
    }

}
