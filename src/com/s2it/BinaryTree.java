package com.s2it;


public class BinaryTree {

	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public static BinaryTree binaryTreeValue;
	
	public BinaryTree(int valor) {
		this.valor = valor;
	}
	
	public static void inserir(int valor){
		inserir(binaryTreeValue,valor);
		
		
		System.out.println(valor+" + "+Inteiro(binaryTreeValue));
	}
	
	public static void inserir(BinaryTree binaryTree, int valor){
		
		if(binaryTree == null){
			
			System.out.println(valor);
			binaryTreeValue = new BinaryTree(valor);
			
		}else{
			
			if(valor < binaryTree.valor){
				if(binaryTree.left != null){
					
					inserir(binaryTree.left, valor);
				}else{
					System.out.println("Insert: "+valor+" of the side left: "+binaryTree.valor);
					binaryTree.left = new BinaryTree(valor);
				}
			}else{
				if(binaryTree.right == null){
					System.out.println("insert: "+valor+" of the right: "+binaryTree.valor);
					binaryTree.right = new BinaryTree(valor);
				}else{
					inserir(binaryTree.right, valor);
				}
				
			}
		}
	}
	
	public static int Inteiro(BinaryTree binaryTree){
	
		if(binaryTree == null){
			return 0;
		}
		return binaryTree.valor + Inteiro(binaryTree.left) + Inteiro(binaryTree.right);
	}
	
	
	public static void main(String[] args) {
		
		
		
		inserir(40);
		inserir(30);
		inserir(60);
		inserir(20);
		inserir(50);
		
		
		
		
		
	}
	
}
