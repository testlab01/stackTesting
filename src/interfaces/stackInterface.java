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


package interfaces;

public interface stackInterface {
	public int pop(); //insert into stack
	public int push(); //remove from stack
	public int peek(); //get the top of the element
	public boolean isFull(); //check if stack is empty
	public boolean isEmpty(); //check is stack is empty 

}