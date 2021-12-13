package hashmaps;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numBuckets;

    public Map(){
        buckets = new ArrayList<>();
        numBuckets = 20;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }

    private int getIndex(K key){
        int hc = key.hashCode();
        int index = hc%numBuckets;
        return index;
    }

    public int size(){
        return count;
    }

    public V removeKey(K key){
        int bucketIndex = getIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head != null){
            if(head.key.equals(key)){
                if(prev == null){
                    buckets.set(bucketIndex, head.next);
                }else{
                    prev.next = head.next;
                }
                count--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public V getValue(K key){
        int bucketIndex = getIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    private void reHash() {

    }

    public void insert(K key, V value){
        int bucketIndex = getIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        count++;

        double loadFactor = (1.0*count)/numBuckets;
        if(loadFactor > 0.7){
            reHash();
        }
    }
}
