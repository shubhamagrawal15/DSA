package HashMapImplementation;

import org.w3c.dom.Node;

import java.util.LinkedList;
/*

public class HashMapCode {
    static  class HashMap<K,V> {  // generics
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n;   // no of nodes
        private int N;   // size of the array
        private LinkedList<Node>[] buckets;

        public HashMap(){
            this.n = 4;
            this.buckets= new LinkedList[4];
            for (int i = 0; i <4 ; i++) {
                this.buckets[i]= new LinkedList<>();
            }
        }

        private int hashFunction(K key){
           int  BucketIndex= key.hashCode();
            return  Math.abs(BucketIndex)%N;
        }

        private  int searchInLinkedList(K key,int BucketIndex){
            LinkedList<Node> linkedList = buckets[BucketIndex];
            int dataIndex=0;

        }

        public void put (K key,V value){
            int BucketIndex = hashFunction(key);
            int dataIndex= searchInLinkedList(key,BucketIndex);


            if(dataIndex==-1){
                // key doesnt exist
                buckets[BucketIndex].add(new Node(key,value));
                n++;
            }else{
              Node data =  buckets[BucketIndex].get(dataIndex);
              data.value=value;
            }

            double lambda = (double) n/N;
            if(lambda>2.0){
                //rehasing
            }
        }
    }
}
*/