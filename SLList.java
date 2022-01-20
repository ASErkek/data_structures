public class SLList<Item>{
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

  public SLList(){
    sentinel = new ItemNode(null, null);
    size = 0;
  }

  public SLList(Item item){
    sentinel = new ItemNode(item, null);
    sentinel.next = new ItemNode(item, null);
    size = 1;
  }

  public void addFirst(Item x){
    sentinel.next = new ItemNode(x, sentinel.next);
    size++;
  }

  public void addLast(Item x){
    ItemNode p = sentinel;
    while(p.next != null){
      p = p.next;
    }
    p.next = new ItemNode(x, null);
    size++;
  }

  public int size(){
    return size;
  }

  public Item getFirst(){
    return sentinel.next.item;
  }

  public Item getLast(){
    ItemNode p = sentinel;
    while(p.next != null){
      p = p.next;
    }
    return p.item;
  }

  public static void main(String[] args) {
    SLList<Integer> i1 = new SLList<>(5);
    i1.addLast(4);
    i1.addLast(3);
    i1.addFirst(6);
    i1.addFirst(7);


    SLList<String> s1 = new SLList<>("C");
    s1.addLast("D");
    s1.addLast("E");
    s1.addFirst("B");
    s1.addFirst("A");
  }
}
