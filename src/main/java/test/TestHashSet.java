package src.main.java.test;

import src.main.java.base.MyEasyHashSet;
import src.main.java.base.MyHardHashSet;

public class TestHashSet {
    public static void main(String[] args) {
        
        boolean flg;

        MyEasyHashSet<Integer> myEasyHashSet = new MyEasyHashSet<>();
        
        System.out.println("Массив:"+myEasyHashSet.getList());                                        // Пустой список                    #Массив:[]
        flg = myEasyHashSet.add(1);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (add(1)):"+flg);    // Добавили единицу                 #Массив:[1] Результат операции (add(1)):true
        flg = myEasyHashSet.add(2);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (add(2)):"+flg);    // Добавили двойку                  #Массив:[1, 2] Результат операции (add(2)):true
        flg = myEasyHashSet.add(1);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (add(1)):"+flg);    // Пробуем добавить единицу еще раз #Массив:[1, 2] Результат операции (add(1)):false
        flg = myEasyHashSet.remove(2);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (remove(2)):"+flg); // Пробуем удалить двойку           #Массив:[1] Результат операции (remove(2)):true
        flg = myEasyHashSet.remove(2);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (remove(2)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[1] Результат операции (remove(2)):false
        flg = myEasyHashSet.remove(1);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (remove(1)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[] Результат операции (remove(2)):true
        flg = myEasyHashSet.remove(1);
        System.out.println("Массив:"+myEasyHashSet.getList()+" Результат операции (remove(1)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[] Результат операции (remove(2)):false

        System.out.println("\n\n");

        MyHardHashSet<Integer> myHardHashSet = new MyHardHashSet<>();

        System.out.println("Массив:"+myHardHashSet.strmas());                                        // Пустой список                    #Массив:[]
        flg = myHardHashSet.add(1);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (add(1)):"+flg);    // Добавили единицу                 #Массив:[1] Результат операции (add(1)):true
        flg = myHardHashSet.add(2);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (add(2)):"+flg);    // Добавили двойку                  #Массив:[1, 2] Результат операции (add(2)):true
        flg = myHardHashSet.add(1);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (add(1)):"+flg);    // Пробуем добавить единицу еще раз #Массив:[1, 2] Результат операции (add(1)):false
        flg = myHardHashSet.remove(2);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (remove(2)):"+flg); // Пробуем удалить двойку           #Массив:[1] Результат операции (remove(2)):true
        flg = myHardHashSet.remove(2);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (remove(2)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[1] Результат операции (remove(2)):false
        flg = myHardHashSet.remove(1);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (remove(1)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[] Результат операции (remove(2)):true
        flg = myHardHashSet.remove(1);
        System.out.println("Массив:"+myHardHashSet.strmas()+" Результат операции (remove(1)):"+flg); // Пробуем удалить двойку еще раз   #Массив:[] Результат операции (remove(2)):false




    }
}
