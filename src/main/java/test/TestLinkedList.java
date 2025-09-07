package src.main.java.test;

import java.util.List;
import src.main.java.base.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] arg){

        boolean flg;
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        List<Integer> list = List.of(7,8,9);
        List<Integer> list_empty = List.of();

        System.out.println(myLinkedList.strLinkedList());                                   //Пустой лист                      #null
        flg = myLinkedList.add(1);
        System.out.println(myLinkedList.strLinkedList()+" \t\t add 1\treturn: "+flg);       //Добавили единицу                 #[1]->null                       add 1  return: true
        flg = myLinkedList.add(2);
        System.out.println(myLinkedList.strLinkedList()+" \t\t add 2\treturn: "+flg);       //Добавили два                     #[1]->[2]->null                  add 2  return: true
        flg = myLinkedList.add(3);
        System.out.println(myLinkedList.strLinkedList()+" \t add 3\treturn: "+flg);         //Добавили три                     #[1]->[2]->[3]->null             add 3  return: true
        flg = myLinkedList.add(1);
        System.out.println(myLinkedList.strLinkedList()+" add 1\treturn: "+flg);            //Добавили единицу еще раз         #[1]->[2]->[3]->[1]->null        add 1  return: true
        flg = myLinkedList.remove(2);
        System.out.println(myLinkedList.strLinkedList()+" \t rem 2\treturn: "+flg);         //Убрали двойку                    #[1]->[3]->[1]->null             rem 2  return: true
        flg = myLinkedList.remove(1);
        System.out.println(myLinkedList.strLinkedList()+" \t\t rem 1\treturn: "+flg);       //Убрали единицу                   #[3]->[1]->null                  rem 1  return: true
        flg = myLinkedList.remove(1);
        System.out.println(myLinkedList.strLinkedList()+" \t\t rem 1\treturn: "+flg);       //Убрали вторую единицу            #[3]->null                       rem 1  return: true
        flg = myLinkedList.remove(3);
        System.out.println(myLinkedList.strLinkedList()+" \t\t\t rem 3\treturn: "+flg);     //Убрали тройку                    #null                            rem 3  return: true
        flg = myLinkedList.remove(3);
        System.out.println(myLinkedList.strLinkedList()+" \t\t\t rem 3\treturn:"+flg);     //Пробуем убрать тройку еще раз     #null                            rem 3  return:false
        flg = myLinkedList.addAll(list);
        System.out.println(myLinkedList.strLinkedList()+" \t addAll 7,8,9  return:"+flg);  //Добавим массив из трех элементов  #[7]->[8]->[9]->null             addAll 7,8,9  return:true
        flg = myLinkedList.addAll(list_empty);
        System.out.println(myLinkedList.strLinkedList()+" \t addAll empty  return:"+flg);  //Пробуем добавить пустой массив    #[7]->[8]->[9]->null             addAll 7,8,9  return:false
    }
}
