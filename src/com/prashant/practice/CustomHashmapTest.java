package com.prashant;

import com.prashant.CustomHashmap.Entry1;

public class CustomHashmapTest {

	public static void main(String[] args) {
		CustomHashmap<Integer, String> chp = new CustomHashmap<>();
		
		chp.put(1, "P1");
		chp.put(1, "P11");
		chp.put(2, "P2");
		chp.put(3, "P3");
		chp.put(4, "P4");
		chp.put(5, "P5");
		chp.put(6, "P6");
		chp.put(4, "P7");
		chp.put(null, "P8");
		
		Entry1<Integer, String> kv = chp.get(1);
		
		System.out.println("Key is : " + kv.key + " : Value is : " + kv.value);
		
		
	}
}

class CustomHashmap<K, V> {
	Entry1<K, V>[] entry;
	
	@SuppressWarnings("unchecked")
	public CustomHashmap(){
		entry = new Entry1[10];
	}

	public void put(K k, V v) {
		Entry1<K, V> newEntry = new Entry1<>(k, v, null);
		Integer hashcode = null;
		// calculate hasCode of e1.key and then apply alogo to find the index
		if(k == null)
			hashcode = 0;
		else
			hashcode = newEntry.key.hashCode();
		
		int index = hashcode.hashCode();
		if(entry[index] == null) {
			entry[index] = newEntry;
		}else {
			Entry1<K, V> current = entry[index];
			Entry1<K, V> next = current.next;
			while(current != null) {
				if(current.key.equals(newEntry.key)) {
					current.value = newEntry.value;
					return;
				}else {
					if(next != null) {
						current = next;
						next = next.next;
					} else {
						current.next = newEntry;
						return;
					}
				}
			}
			next = newEntry;
		}
	}
	
	public Entry1<K, V> get(K key){
		if(entry ==  null)
			return null;
		Integer hashcode = key.hashCode();
		int index = hashcode.hashCode();
		
		if(entry[index] == null) {
			return null;
		}else {
			Entry1<K, V> kv = entry[index];
			while(kv != null) {
				if(kv.key.equals(key)) {
					return kv;
				}else {
					kv = kv.next;
				}
			}
		}
		return null;
	}
	
	
	static class Entry1<K, V> {
		K key;
		V value;
		Entry1<K, V> next;
		
		public Entry1(K k, V v, Entry1<K, V> next) {
			this.key = k;
			this.value = v;
			this.next = next;
		}
	}
}