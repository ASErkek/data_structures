public class AList<Item> implements List<Item> {
    //Privates
    private Item[] items;
    private int size;

    //Constructor
    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }
    public AList(Item item){
        items = (Item[]) new Object[100];
        items[size] = item;
        size++;
    }

    //Methods
    public void addFirst(Item x){

    }
    public Item getFirst(){
        return items[0];
    }
    public void addLast(Item x){
        if(size == items.length){
            resizeArray();
        }
        items[size] = x;
        size++;
    }
    public Item getLast(){
        return items[size];
    }
    public void insert(Item x, int position){
        items[position] = x;
    }
    public Item get(int index){
        return items[index];
    }
    public int size(){
        return size;
    }
    public Item removeLast(){
        Item temp;
        temp = items[size-1];
        items[size-1] = null;
        size--;
        return temp;
    }

    //Private Methods
    private void resizeArray(){
        Item[] temp = (Item[]) new Object[size*4];
        System.arraycopy(items, 0,temp,0,size);
        items = temp;
    }
}
