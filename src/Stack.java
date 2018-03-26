
public class Stack implements StackFace{
	
	private final int RESIZE_STEP = 10;

	private Object [] array;
	private int currentPos;
	
	public Stack () {
		initializeStack();
	}
	
	private void initializeStack() {
		array = new Object [RESIZE_STEP];
		currentPos = 0;		
	}

	@Override
	public boolean push(Object obj) {
		if (currentPos==(array.length-1)) {
			array = resizeArray();
		}
		try{
			array[currentPos++]=obj;
			return true;
		}catch (NullPointerException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	private Object[] resizeArray() {

		Object [] temp = new Object [array.length+RESIZE_STEP];
		for(int i = 0; i<array.length;i++) {
			temp[i]=array[i];
		}
		return temp;
	}

	@Override
	public Object pop() {
		if (--currentPos>=0) {
			return array [currentPos];
		}else {
			currentPos = 0;
			return null;
		}
		
	}
	@Override
	public int size() {
		return currentPos;
	}
	@Override
	public boolean clear() {
		try {
			initializeStack();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
