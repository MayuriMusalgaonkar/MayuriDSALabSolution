package com.learning.model;

//Tree node 
public class Node {
	public Node left;
    public Node right;
	public int data;

	public Node(int val) {
		data = val;
		left = right = null;
	}
}
