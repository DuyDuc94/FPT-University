
public class Node {

    Person info;
    Node next;

    Node() {
    }

    Node(Person x, Node q) {
        info = x;
        next = q;
    }

    Node(Person x) {
        this(x, null);
    }

    @Override
    public String toString() {
        return info + "";
//        return "info=" + info + ", next=" + next;
    }

}
