package ArraysNcollections.WareHouse;

public class WareHouse<E> {
    private E[] data;

    public E[] getData(){
        return data;
    }
    public void setData(E[] data){
        this.data = data;
    }
    public E get(int index){
        return data[index];
    }
    public int getSize(){
        return data.length;
    }
}
