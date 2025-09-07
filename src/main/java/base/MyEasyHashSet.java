package src.main.java.base;

import java.util.LinkedList;


/*
 * Set - неупорядоченный набор уникальных значений,
 *  добавим список в поле, который будем контролировать.
 *  Да, можно получить список и работать с ним как с списком,
 *  но изменения не будут влиять на сам объект MyEasyHashSet,
 *  так как создается новый объект LinkedList, поэтому
 *  сам объект можно воспринимать как аналог HashSet
 * 
 *  Это простая версия аналога HashSet
 * 
 */

public class MyEasyHashSet<T>{

    private final LinkedList<T> list = new LinkedList<>();

    public boolean add(T value){
        return list.contains(value)?false:list.add(value);
    }
    
    public boolean remove(T value){
        return list.contains(value)?list.remove(value):false;
    }
    
    public LinkedList<T> getList() {                     //Для тестов
        return new LinkedList<>(list);
    }

}