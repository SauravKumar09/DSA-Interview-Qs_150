package LinkedList;

import java.util.HashMap;

public class cacheLRU {
    class Node {
        int key;
        int value;
        Node next;
        Node prev;
    }
    Node head = new Node();
    Node tail = new Node();
    HashMap<Integer, Node> hmap;
    int cap;

    public void LRUCache(int capacity) {
        hmap = new HashMap<>();
        cap = capacity;

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hmap.containsKey(key))
        {
            int ans = hmap.get(key).value;
            deleteNode(hmap.get(key));
            addNode(hmap.get(key));
            return ans;
        }
        else
        {
            return -1;
        }
    }
    public void addNode(Node node)
    {
        Node headp1 = head.next;
        head.next = node;
        node.next = headp1;
        headp1.prev = node;
        node.prev = head;
    }
    public void deleteNode(Node node)
    {
        Node p = node.prev;
        Node nex = node.next;

        p.next = nex;
        nex.prev = p;
    }
    
    public void put(int key, int value) {
        Node res = hmap.get(key);
        if(res != null)
        {
            deleteNode(res);
            res.value = value;
            hmap.put(key, res);
            addNode(res);
        }
        else
        {
            if(hmap.size() == cap)
            {
                hmap.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            Node n = new Node();
            n.key = key;
            n.value = value;
            hmap.put(key, n);
            addNode(n);
        }
    }

}