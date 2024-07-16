import java.io.*;
import java.util.Scanner;
public class Binary{
    static Scanner sc = null;
    public static void main(String[] args){
     sc =new Scanner(System.in);
     Node root = CreateTree();
    }
    static Node CreateTree(){
       Node root = null;
       System.out.println("enter the data");
       int data = sc.nextInt();

       if(data == -1) return null;

       root = new Node(data);
       System.out.println("enter lest"+ data);
       root.left = CreateTree();

       System.out.println("enter right"+ data);
       root.right = CreateTree();

       return root;
    }

    }
    class Node{
        Node left, right;
        int data;
    
        public Node(int data){
             this.data = data;
        }
    
}