package ex;

import javax.xml.soap.Node;

public class LinkedList {
    private Node head;
    private Node tail;
    private  int size = 0;
    private  class Node{ //inner class
        private Object data;
        private Node next;
        public Node (Object input){ //생성자를 사용해서 노드가 생성될때 초기화
            this.data = input;
            this.next = null;
        }
        public String toString(){ //객체보기편할때 node값 편하게보기위해
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input){
        Node newNode = new Node(input); //객체를 생성함, 그리고 생성자때문에 내부적으로 data와 next변수생김
        newNode.next = head; //이따가 설명
        head = newNode;
        size++;

        if(head.next==null){
            tail = head;
        }

    }

    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size==0){
            addFirst(input);
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public  String toString(){
        if(head==null){
            return "[]";
        }
        Node temp =  head;
        String str = "[";

        while(temp.next != null){
            str +=temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";
    }

    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int k){
        if(k==0){
            return removeFirst();
        }
        Node temp = node(k-1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }

    public  Object removeLast(){
        return remove(size-1);
        }

    private  Node node(int index){
        Node x = head;
        for(int i=0; i<index; i++){ //인덱스 숫자만큼 head에서 떨어진값 나옴
             x = x.next;
        }
            return x;
    }
    public Object size(){
        return size;
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while(temp.data != data){//모든 노드 순회할때는 while
            temp = temp.next;
            index++;
            if(temp == null){
                return -1;
            }
        }
        return index;
    }
    public Object get(int k){
        Node temp = node(k);
        return temp;
        /*
        Node x = head;
        for(int i=0; i<index; i++){ //인덱스 숫자만큼 head에서 떨어진값 나옴
            x = x.next;
        */
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
            list.addLast(30);
            list.addLast(20);
            list.addLast(10);
            System.out.println(list.size());
            System.out.println(list.get(2));
            System.out.println(list.indexOf(2));

    }
}
