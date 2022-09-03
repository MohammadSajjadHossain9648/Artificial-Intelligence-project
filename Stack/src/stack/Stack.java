/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Student
 */
public class Stack {
    int arr[] = new int [10];
    int tos=0;
    
    public void push(int n){
        arr[tos]=n;
        tos++;
    }
    
    public int pop(){
        tos--;
        return arr[tos];
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.pop();
    }
    
}
