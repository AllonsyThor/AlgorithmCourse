public class MapPQ<Key extends Comparable<Key>> //Key must be Comparable (bounded type parameter)
MaxPQ() //create an empty priority queue
MaxPQ(Key[] a) //create a priority queue with given keys
void insert(Key v) //insert a key into the priority queue
Key delMax() //return & remove the largest key
boolean isEmpty() //is the priority queue empty?
Key max() //return the largest key
int size() //number of entries in the priority queue