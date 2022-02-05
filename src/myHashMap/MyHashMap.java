package myHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap<K,V> {

    ArrayList<HashNode<K, V>>bucket=new ArrayList<>();
    int numBuckets=10;
    int size;
    public MyHashMap()
    {
        for(int i=0;i<numBuckets;i++)
        {
            bucket.add(null);
        }
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    private int getBucketIndex(K key)
    {
        int hashCod=key.hashCode();
        return Math.abs(hashCod % numBuckets);
    }
    public V get(K key)
    {
        int index=getBucketIndex(key);
        HashNode<K, V> head=bucket.get(index);
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public V remove(K key)
    {
        int index=getBucketIndex(key);
        HashNode<K, V>head=bucket.get(index);
        if(head==null)
        {
            return null;
        }
        if(head.key.equals(key))
        {
            V val=head.value;
            head=head.next;
            bucket.set(index, head);
            size--;
            return val;
        }
        else
        {
            HashNode<K, V>prev=null;
            while(head!=null)
            {

                if(head.key.equals(key))
                {
                    prev.next=head.next;
                    size--;
                    return head.value;
                }
                prev=head;
                head=head.next;
            }
            return null;
        }
    }
    public void put(K key,V value)
    {

        int index=getBucketIndex(key);
       // System.out.println(index);
        HashNode<K, V>head=bucket.get(index);
        HashNode<K, V>toPut=new HashNode<>();
        toPut.key=key;
        toPut.value=value;
        if(head==null)
        {
            bucket.set(index, toPut);
            size++;

        }
        else
        {
            while(head!=null)
            {
                if(head.key.equals(key))
                {
                    head.value=value;
                    //size++;
                    break;
                }
                head=head.next;
            }
            if(head==null)
            {
                head=bucket.get(index);
                toPut.next=head;
                bucket.set(index, toPut);
                size++;
            }
        }
        if((1.0*size)/numBuckets>0.7)
        {
            //do something
            ArrayList<HashNode<K, V>>tmp=bucket;
            bucket=new ArrayList<>();
            numBuckets=2*numBuckets;
            for(int i=0;i<numBuckets;i++)
            {
                bucket.add(null);
            }
            for(HashNode<K, V> headNode:tmp)
            {
                while(headNode!=null)
                {
                    put(headNode.key, headNode.value);
                    headNode=headNode.next;
                }
            }


        }


    }
    public void clear() {
        for(int i=0;i<numBuckets;i++)
        {
            HashNode<K, V>head=bucket.get(i);
            if(head!=null)
            {

                bucket.set(i, null);
                size--;
            }
//            else
//            {
//                HashNode<K, V>prev=null;
//                while(head!=null)
//                {
//
//                    if(head.key.equals(key))
//                    {
//                        prev.next=head.next;
//                        size--;
//                        return head.value;
//                    }
//                    prev=head;
//                    head=head.next;
//                }
//                return null;
     //       }
        }        }
        //size = 0;
    }


