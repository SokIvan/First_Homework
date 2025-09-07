package src.main.java.base;

import java.util.Collection;


public class MyLinkedList<T> {

    private Node<T> start = null;

    public boolean add(T value){
        if (start == null){
            start = new Node<>(value);
        }
        else{
            Node<T> curr = start;
            while (true) { 
                if (curr.next == null){
                    curr.next = new Node<>(value);
                            break;
                }
                curr = curr.next;
            }
        }
        return true;
    }
    
    public boolean addAll(Collection<T> collection){
        if (collection.isEmpty()){
            return false;
        }
        for (T elem : collection) {
            if (!add(elem)){
                return false;
            }
        }
        return true;
    }


    public boolean remove(T value){
        Node<T> curr = start;
        if (start == null) return false;
        if (curr.value == value){
            this.start = curr.next;
            return true;
        }
        while (curr.next!=null)
        {
            if (curr.next.value == value){
                curr.next = curr.next.next;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public StringBuilder strLinkedList(){ 
        StringBuilder ret = new StringBuilder("");
        Node<T> curr = start;
        if (curr!=null)
        {
            ret.append("[").append(curr.value).append("]->");
        }
        else {
            ret.append("null");
            return ret;
        }
        while (curr.next!=null)
        {
            curr = curr.next;
            ret.append("[").append(curr.value).append("]").append("->");
        }
        ret.append("null");
        return ret;
    }

}

class Node<T>{
    
    protected T value;
    Node<T> next = null;
    
    Node(T value){
        this.value=value;
    }

}