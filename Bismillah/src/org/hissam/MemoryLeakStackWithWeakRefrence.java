package org.hissam;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MemoryLeakStackWithWeakRefrence<E> {

	private final List<WeakReference<E>> stackValues;

	private int stackPointer;

	public MemoryLeakStackWithWeakRefrence() {
		this.stackValues = new ArrayList<>();
		stackPointer = 0;
	}

	public void push(E element) {
		stackValues.add(stackPointer, new WeakReference<>(element));
		stackPointer++;
	}

	public E pop() {
		stackPointer--;
		return stackValues.get(stackPointer).get();
	}

	public boolean isEmpty() {
		return stackPointer == 0;
	}

	public E peek() {
		return this.stackValues.get(stackPointer - 1).get();
	}
	
	//CopyOnWriteArrayList<E>
}
