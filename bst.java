package ds;

import java.util.*;

public class BST {
	
	class Node{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	void insert(int data)
	{
		root=insertTree(root,data);
	}
	Node insertTree(Node root,int data)   
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		 if(data<root.data)
		{
			root.left=insertTree(root.left,data);
		}
		 else
		 {
			 root.right=insertTree(root.right,data);
		 }
		 return root;
	}
	void inorder()
	{
		pInorder(root);
		System.out.println();
	}
	void pInorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			pInorder(root.left);
			System.out.println(root.data+" ");
			pInorder(root.right);
			
		}
		
	}
	void preorder()
	{
		Pporder(root);
		System.out.println();
	}
	void Pporder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else {
			System.out.println(root.data+" ");
			Pporder(root.left);
			Pporder(root.right);
		}
	}
	void postorder()
	{
		Poporder(root);
		System.out.println();
	}
	void Poporder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else {
			Poporder(root.left);
			Poporder(root.right);
			System.out.println(root.data+" ");
		}
	}
	
	void Bst()
	{
	int n=0;
		for(int i=1;i<=n;i++)
		{
		prBST(root,i);
		System.out.println();
		}
		
	}
	void prBST(Node root,int level)
	{
		if(root==null)
		{
			return ;
		}
		else
		{
			if (level==1)
			{
				System.out.println(root.data+" ");
			}
			else if(level>1)
			{
				prBST(root.left,level-1);
				prBST(root.right,level-1);
			}
		}
	}
	void rtlBst()
	{
		int n=0;
		for(int i=1;i<=n;i++)
		{
		display(root,i);
		System.out.println();
		}
	}
	void display(Node root,int level)
	{
		if(root==null)
		{
			return ;
		}
		else
		{
			if (level==1)
			{
				System.out.println(root.data+" ");
			}
			else if(level>1)
			{
				prBST(root.right,level-1);
				prBST(root.left,level-1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();
		Node root= new Node(40);
		tree.root.left=new Node(30);
		tree.root.right=new Node(70);
		tree.root.left.left=new Node(20);
		tree.root.left.right=new Node(35);
		tree.root.right.left=new Node(50);
		tree.root.right.right=new Node(80);
		
	

	}

}
