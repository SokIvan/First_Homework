package src.main.java.base;

import java.util.Arrays;

/* Допустим что я не знаю что такое Node и не знаю что HashSet написан с помощью HashMap.
 * Попробуем реализовать коллекцию с помощью простого массива. Для этого добавим дополнительные
 * функции увеличения и уменьшения массива. 
 */





public class MyHardHashSet<T>{

    private T[] mas = (T[]) new Object[0];

    private void resize(){
        mas = Arrays.copyOf(mas, mas.length+1);
    }

    private void decreasize()
    {
        mas = Arrays.copyOf(mas, mas.length-1);
    }

    public boolean add(T value){

        for (T val : mas) {
            if (val == value) {
                return false;
            }
        }
        resize();
        mas[mas.length-1] = value;
        return true;
    }
    
    public boolean remove(T value){
        for (int i = 0;i<mas.length;i++)
        {
            if (mas[i] == value){
                mas[i] = mas[mas.length-1];
                decreasize();
                return true;
            }
        }
        return false;
    }

    public StringBuilder strmas() {                     //Для тестов

        StringBuilder ret = new StringBuilder("[");

        if (mas.length>=1)
        {
        
        for (int i = 0;i<mas.length-1;i++)
        {
            ret.append(mas[i].toString()).append(", ");
        }
        ret.append(mas[mas.length-1].toString()).append("]");
        return ret;
        }
        else {
            ret.append("]");
            return ret;
        }
    }

}
