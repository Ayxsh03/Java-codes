// https://www.youtube.com/watch?v=KDZ_IXvpMG4 watch to understand logic
package Hashing;
import java.util.*;

public class implementation {
    
    static class HashMap<K,V>{

        private class Node{
            K key;
            V value;
            public Node(K key, V value){ //Constructor
                this.key=key;
                this.value=value;
            }
        }

        private int n; //nodes
        private int N; //buckets.length
        private int constant=2;
        private LinkedList<Node>[] buckets; //HashMap-> array of type linked list

        @SuppressWarnings("unchecked")
        public HashMap(){ //Constructor
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4;i++){
                this.buckets[i]=new LinkedList<>(); //New Linked list at every index of buckets array
            }
        }

        private int hashfunction(K key){ 
            int bucketIndex = key.hashCode(); 
            return Math.abs(bucketIndex) % N; //bucketIndex should be 0 to N-1 so %N
        }

        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];

            for(int i=0; i<ll.size(); i++){ //search in ll for data index
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuckets[]= buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>(); //Initialize LL
            }

            for(int i=0; i<oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0; j<ll.size();j++){
                    Node node= ll.get(j);
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key, V value){
            int bucketIndex = hashfunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex==-1){ //key doesnt exist
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            else{ //key exist
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = n/N;
            if(lambda > constant){
                //rehashing
                rehash();
            }

        }

        public boolean containsKey(K key){
            int bucketIndex = hashfunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex==-1){ //key doesnt exist
                return false;
            }
            else{ //key exist
                return true;
            }
        }

        public V get(K key){
            int bucketIndex = hashfunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex==-1){ //key doesnt exist
                return null;
            }
            else{ //key exist
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value ;
            }
            
        }

        public V remove(K key){
            int bucketIndex = hashfunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex==-1){ //key doesnt exist
                return null;
            }
            else{ //key exist
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value ;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll= buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        
        public static void main(String[] args) {
            HashMap<String,Integer> map=new HashMap<>();
            map.put("India", 180);
            map.put("China", 210);
            map.put("USA", 100);
        }

    }
}
