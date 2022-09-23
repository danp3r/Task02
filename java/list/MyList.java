package list;

public class MyList {

    private Node head;
    private Node last;
    private int size;

    public boolean add(Integer data) {
        Node temp = this.last;
        Node newNode = new Node(temp, data, null);
        this.last = newNode;
        if (head == null) {
            this.head = newNode;
        } else {
            temp.next = newNode;
        }
        this.size++;
        return true;
    }

    private Node node(int index) {
        if (index < (size >> 1)) {
            Node temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        Node temp = this.last;
        for (int i = size - 1; i > index; i--) {
            temp = temp.prev;
        }
        return temp;
    }

    public Integer get(int index) {
        if (!checkIndex(index)) {
            return null;
        }
        Node node = node(index);
        return node.data;
    }

    public void remove(Integer data) {
        if (data == null) {
            for (Node temp = head; temp != null; temp = temp.next) {
                if (temp.data == null) {
                    unset(temp);
                }
            }
        } else {
            for (Node temp = head; temp != null; temp = temp.next) {
                if (temp.data.equals(data)) {
                    unset(temp);
                }
            }
        }
    }

    private void unset(Node x) {
        Node prev = x.prev;
        Node next = x.next;
        if (prev == null) {
            this.head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.data = null;
        this.size--;
    }

    public Integer getAndRemove(int index) {
        if (!checkIndex(index)) {
            return null;
        }
        Node node = node(index);
        Integer data = node.data;
        remove(data);
        return data;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        private Node prev;
        private Integer data;
        private Node next;

        public Node(Node prev, Integer data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}
