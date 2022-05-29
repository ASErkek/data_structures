public class Launcher {
    public static void main(String[] args) {
        SLList<Integer> i1 = new SLList<>();
        i1.addLast(2);
        i1.addLast(1);
        i1.addFirst(4);
        i1.addFirst(5);


        SLList<String> s1 = new SLList<>("C");
        s1.addLast("D");
        s1.addLast("E");
        s1.addFirst("B");
        s1.addFirst("A");
    }
}
