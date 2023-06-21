package class_and_object;


public class DynamicArray {
    private int data[];
    private int nextIdx;
    
    public DynamicArray() {
      data=new int[5];
      nextIdx=0;
    }
    
    public int size() {
    	return nextIdx;
    }
    
    public void add(int element) {
		if(nextIdx==data.length) {// 0-10,1-11,2-12,3-13,4-14-> next
			restructure();
		}
		data[nextIdx]=element;//10-11-12-13-14
		nextIdx++;//1-2-3-4-5
	}
    public void set(int idx, int element) {
    	if(idx>nextIdx) {
    		return;
    	}else if(idx<nextIdx) {
    		data[idx]=element;
    	}else {
    		add(element);
    	}
    }
    public int get(int idx) {
    	if(idx>=nextIdx) {
    		return -1;
    	}
    	return data[idx];
    }
    
    public boolean isEmpty() {
    	if(size()==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public int removeLast() {
    	if(size()==0) {
    		//error out
    		return -1;
    	}
    	int val=data[nextIdx-1];
    	data[nextIdx-1]=0;
    	nextIdx--;
    	return val;
    }
    
    private void restructure() {
    	int temp[]=data;
    	data=new int[data.length*2];
    	for(int i=0;i<temp.length;i++) {
    		data[i]=temp[i];
    	}
    }
}
