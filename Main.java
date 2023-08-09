/*Разработать программу, имитирующую поведение коллекции HashSet. 
В программе содать 
метод add добавляющий элемент, 
метод toString возвращающий строку с элементами множества и 
метод позволяющий читать элементы по индексу.
Формат данных Integer. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
class Main
{

    private static Integer mycheck(Integer[] myarray, int value) // метод проверяет, не существует ли уже 
    //такого значения в списке, так как в коллекции не должно быть повторений
    {
        int index = 0;
        for (int i = 0; i < myarray.length; i++) {
        if (myarray[i] == value) {
        index = i;
        }
        else index = -1;
    }
    return index; 
}

    private static Integer[] add(Integer[] myarray, int value)
    {
        if (mycheck(myarray, value)  == -1)  //проверка на повторение существующего элемента перед добавлением
        {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(myarray));
        numbers.add(value);
        return numbers.toArray(new Integer[0]);
        }
        else return myarray;
    }

     private static String toString(Integer[] myaarrstr)
    {
        String arrayToString = Arrays.toString(myaarrstr);
        return arrayToString;
    }



    private static Integer myRead(Integer[] myarray, Integer num)
    {
        Integer element = myarray[num];
        return element;
    }

  
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[J"); //отчистка экрана
        Integer[] myCollection = { 11, 22, 33, 44, 55, 66 };

        String myCollToStr = toString(myCollection);    // преобразование в строку
        System.out.println("Текущий список:" + myCollToStr);

        Scanner in = new Scanner(System.in);
        System.out.println("Что добавим в список? Повторение элементов не допускается");
        int numadd = in.nextInt();
          
 
        myCollection = add(myCollection,numadd);    // добавляем numadd
        myCollToStr = toString(myCollection);    // преобразование в строку
        System.out.println(myCollToStr);

        System.out.println("Какой элемент вывести?");
        int ind = in.nextInt();
        System.out.println("Элемент номер "+ ind+ " это " + myRead(myCollection, ind)); //прочитали по индексу, вывели
       
        in.close();

    }
}