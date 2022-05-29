public interface List <Item> {
    public void addFirst(Item x);
    public Item getFirst();
    public void addLast(Item x);
    public Item getLast();
    public void insert(Item x, int pos);
    public Item get(int i);
    public int size();
    public Item removeLast();
}
