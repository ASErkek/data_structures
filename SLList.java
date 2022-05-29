public class SLList<Item> implements List<Item> {
//Privates
  private class ItemNode{
    public Item item;
    public ItemNode next;

    public ItemNode(Item _item, ItemNode _next){
      item = _item;
      next = _next;
    }
}
  private ItemNode sentinel;
  private int size;

  //Constructors
    public SLList(Item item){
      sentinel = new ItemNode(item, null);
      sentinel.next = new ItemNode(item, null);
      size = 1;
    }
  public SLList(){
    sentinel = new ItemNode(null, null);
    size = 0;
  }

  //Methods
  public void addFirst(Item x){
    sentinel.next = new ItemNode(x, sentinel.next);
    size++;
  }
  public Item getFirst(){
    return sentinel.next.item;
  }
  public void addLast(Item x){
    ItemNode p = sentinel;
    while(p.next != null){
      p = p.next;
    }
    p.next = new ItemNode(x, null);
    size++;
  }
  public Item getLast(){
    ItemNode p = sentinel;
    while(p.next != null){
      p = p.next;
    }
    return p.item;
  }
  public void insert(Item x, int pos){
      /*
    ItemNode temp = new ItemNode(null, null);
    while(pos <= 0){
      temp.item = sentinel.next.item;
      temp.next = sentinel.next.next;
      pos--;
    }
    temp.next = new ItemNode(x, temp.next);
*/
  }
  public Item get(int pos){
      return null;
  }
  public int size(){
    return size;
  }
  public Item removeLast(){
      return null;
  }
}
