public class ST<Key, Value>

ST()							//create a symbol table
void put(Key, key, Value val)	//put key-value pair into table (remove key from table if value is null); a[key] = val;
Value get(Key key)				//value paired with key (null if key is absent)
void delete(Key key)			//remove key (and its value) from table
boolean contains(Key key)		//is there a value paired with key?
boolean isEmpty()				//is the table empty?
int size()						//number of key-value pairs in the table
Iterable<Key> keys()			//all the keys in the table