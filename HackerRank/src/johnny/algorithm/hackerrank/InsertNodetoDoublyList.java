/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank;

import johnny.algorithm.hackerrank.common.DoublyNode;

/**
 *
 * @author Johnny
 */
public class InsertNodetoDoublyList {
    public DoublyNode SortedInsert(DoublyNode head,int data) {
    DoublyNode dummy = new DoublyNode();
    dummy.data = Integer.MIN_VALUE;
    dummy.next = head;
    
    if (head == null) {
        head = new DoublyNode();
        head.data = data;
        return head;
    } else {
        DoublyNode prev = dummy;
        DoublyNode curr = head;
        while(curr != null) {
            if(curr.data >= data) {
                DoublyNode node = new DoublyNode();
                node.data = data;                
                prev.next = node;
                node.next = curr;
                node.prev = prev;
                curr.prev = node;
                return dummy.next;
            } else {
                curr = curr.next;
                prev = prev.next;
            }            
        }
        if (curr == null) {
            DoublyNode node = new DoublyNode();
            node.data = data;                
            prev.next = node;
            node.prev = prev;
        }
    }
    
    return dummy.next;
}
}
