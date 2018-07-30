//package algorithm.Link;
//
//public class LinkImpl implements Link{
//    private int size = 0;
//    private Node first;
//    private Node last;
//    public class Node{
//        private Node prev;
//        private Object data;
//        private Node next;
//        private Node(Node prev,Object data,Node next){
//            this.prev = prev;
//            this.data = data;
//            this.next = next;
//        }
//        public void add(Object obj){
//            Node temp = last;
//            Node newNode = new Node(temp,obj,null);
//            last = newNode;
//            size++;
//        }
//
//        public int length(){
//            return size;
//        }
//
//        public boolean remove(int index){
//            Node temp = first;
//            Node temp2 = last;
//            Node temp3 = first.next;
//            for(;temp3!=null;)
//            {
//                int i = 1;
//                Node x = temp3.next;
//                if(i == index)
//                {
//                    temp3.next.prev = temp3.prev;
//                    temp3.prev.next = temp3.next;   //核心逻辑 node temp3 的 *prev 和 *next 赋值
//                    temp3 = null;
//                    size --;
//                    return true;
//                }
//                temp3 = x;
//                i++;
//            }
//            return true;
//        }
//    }
//}
