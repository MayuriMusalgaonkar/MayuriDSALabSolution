package com.learning.services;

import java.util.ArrayList;

import com.learning.model.Node;

public class FindLongestPath {
	
	//Function to find and return the longest path
	public	 static ArrayList<Integer> findLongestPathFromRoot(Node root){
			
		     /* If root is null means there is no binary tree so return a empty vector */
			 if(root == null) 
				 return new ArrayList<>();
			 
			// Recursive call on root.right
			ArrayList<Integer> rightNode= findLongestPathFromRoot(root.right);
			
			// Recursive call on root.left
			ArrayList<Integer> leftNode=findLongestPathFromRoot(root.left);
			
			// Compare the size of the two ArrayList and insert current node accordingly
			if(rightNode.size()<leftNode.size()) {
				leftNode.add(root.data);
			}else {
				rightNode.add(root.data);
			}		 
			 
			// Return the  ArrayList
			 return leftNode.size()>rightNode.size()?leftNode:rightNode;
			 
			 
		 }
}
