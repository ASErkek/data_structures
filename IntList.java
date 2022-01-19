public class IntList {
  public int first;
  public IntList rest;

  public IntList(int _first, IntList _intList){
    first = _first;
    rest = _intList;
  }

  public static void main(String[] args) {
    IntList L = new IntList(5,null);
    L = new IntList(10,L);
    L = new IntList(15,L);
  }
}
