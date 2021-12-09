package ge.edu.kiu;

import java.math.BigInteger;

public class node<T> {
    private T value = null;
    private node<T> left = null;
    private node<T> right = null;

    public node(){

    }

    public void add(T elem, int key){
        if(key == 0) value = elem;
        else {
            if(key % 2 == 0){
                if(left == null) left = new node<>();
                left.add(elem, key/2);
            }
            else {
                if(right == null) right = new node<>();
                right.add(elem, key/2);
            }
        }
    }

    public void delete(int key){
        if(key == 0) value = null;
        else{
            if(key % 2 == 0 && left != null) left.delete(key/2);
            if(key % 2 == 1 && right != null) right.delete(key/2);
        }
    }

    public Boolean contains(int key){
        if(key == 0) return (value != null);
        else{
            if(key % 2 == 0 && left != null) return left.contains(key/2);
            if(key % 2 == 1 && right != null) return right.contains(key/2);
        }
        return false;
    }
}
