/**
Copyright 2017 prahveen29@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
**
* @author Prahveen Thiruchelvam
*/

package stackTesting;

import interfaces.stackInterface;

public class stackTesting implements stackInterface {

	private int StackTop;
	private int MaxSize;
	private int Stack[];
	
	//constructor for initialize stack
	public stackTesting(int size){
		MaxSize = size;
		Stack = new int[MaxSize];
		StackTop = -1;
	}

	@Override
	// give top of the element in the stack
	public int pop() {
		if(isEmpty() == true){
			return 0;
		}else {
			return Stack[StackTop--];
		}
	}

	@Override
	public void push(int insertVal) {
		if(isFull() != true){
			Stack[++StackTop] = insertVal;
		} else {
			System.out.println("Stack OverFloor");
		}
	}

	@Override
	public int peek() {
		return Stack[StackTop];
		
	}

	@Override
	public boolean isFull() {
		if(StackTop == MaxSize){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		if(StackTop == -1){
			return true;
		} else {
			return false;
		}
	}
}
