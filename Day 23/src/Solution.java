import java.util.*;
import java.io.*;
/**
 * Day 23 BST Level-Order Traversal
 * 
 * A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top 
 * to bottom. You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder 
 * function provided in your editor so that it prints the level-order traversal of the binary search tree.
 * 
 * @author Felix
 *
 */
public class Solution {
	
	static void levelOrder(Node root){
	      Queue<Node> queue = new LinkedList();
	      queue.add(root);
	      
	      while(!queue.isEmpty()){
	    	  Node current = queue.remove();
	    	  System.out.print(current.data + " ");
	    	  if(current.left != null)
	    		  queue.add(current.left);
	    	  if(current.right != null)
	    		  queue.add(current.right);
	      }
	    }
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

