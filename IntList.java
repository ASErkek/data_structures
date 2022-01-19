public class IntList {
  public int first;
  public IntList rest;

  public IntList(int _first, IntList _intList){
    first = _first;
    rest = _intList;
  }

  public int size(){
    if(rest == null){
      return 1;
    }
    return 1 + this.rest.size();
  }

  public static void main(String[] args) {
    //creating and adding 3 items to the intList
    IntList L = new IntList(5,null);
    L = new IntList(10,L);
    L = new IntList(15,L);

    //print out the size
    System.out.println(L.size());
  }
}
