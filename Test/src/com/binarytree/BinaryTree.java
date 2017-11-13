package com.binarytree;



/**
 * ¶þ²æÊ÷
 * @author hanrk-2734
 *
 */
public class BinaryTree {
    
    
    //Òª²åÈëÎ»ÖÃµÄ¸ù½Úµã
    private Node root;
    
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }
    public  BinaryTree() {
        this.root = null;
    }
    public  BinaryTree(Node root) {
        this.root = root;
    }
    
    public Node insertHelper(int data){
        
        //¸ùÔÚ²»Í£µÄ±ä»»
        return root=insert(root, data);
    }
    
    //ÏÈÐò¹¹½¨¶þ²æÊ÷
    private Node insert(Node node, int data) {
        
        if (node==null) {
            node =new Node(data);
        }
        else {
            if (data<=node.data) {
                node.left=insert(node.left, data);
            }
            else {
                node.right=insert(node.right, data);
            }
            
        }
        return node;
        
    }
    
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insertHelper(2);
        binaryTree.insertHelper(3);
    }
    
}
