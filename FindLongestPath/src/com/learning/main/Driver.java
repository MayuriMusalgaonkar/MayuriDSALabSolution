package com.learning.main;

import java.util.ArrayList;
import java.util.Collections;

import com.learning.model.Node;
import com.learning.services.FindLongestPath;

public class Driver {

	
	public static void main(String[] args) {
		//Tree Creation code
		    Node node1=new Node(100);
			Node node2=new Node(20);
			Node node3=new Node(130);
			Node node4=new Node(10);
			Node node5=new Node(50);
			Node node6=new Node(110);
			Node node7=new Node(140);
			Node node8= new Node(5);
			
			node2.left=node4;
			node2.right=node5;
			
			node3.left=node6;
			node3.right=node7;
			
			node1.left=node2;
			node1.right=node3;
			
			node4.left=node8;
			
			//get longest path and print 
			ArrayList<Integer>  result=FindLongestPath.findLongestPathFromRoot(node1);
			
			Collections.reverse(result);
	        for(int i=0; i<result.size() ; i++) {
	        	if((result.size()-1)==i) {
	        		System.out.println(result.get(i));
	        	}
	        	else {
	        		System.out.print(result.get(i) + "-> ");
	        	}
	        }
	}
	
	
}
