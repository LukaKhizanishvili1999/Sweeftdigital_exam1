package ge.edu.kiu;

public class HashList<T> {
    private node<T> head = null;

    public HashList(){
        head = new node<>();
    }

    public void add(T elem){
        int key = elem.hashCode();
        head.add(elem, key);
    }

    public void delete(T elem){
        head.delete(elem.hashCode());
    }

    public Boolean contains(T elem){
        return head.contains(elem.hashCode());
    }
}
