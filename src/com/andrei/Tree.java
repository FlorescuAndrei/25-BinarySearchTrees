package com.andrei;

public class Tree {

    private TreeNode root;


    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }

    }

    public void traverseInOrder(){
        if(root != null) {
            root.traversInOrder();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public int min (){
        if(root == null){
            // make the assumption that the tree can not contain that value
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }

    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if(subtreeRoot == null){
            return subtreeRoot;  //same with return null
        }

        //if value is less than the data we must check the left child. if that equal value we delete or replace it, if no equal we keep searching
        // it is not enough to delete a node we must reset his parent left  child to null.
        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
            //Replace the left child with the result of delete():
            // -  unchanged( replace with itself) if the leftChild has  not the value to be deleted
            // -  null if the leftChild has the value to be deleted and has no child.
            // -  new node if the leftChild has children
        }

        else if(value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        //if value == subtree.getdata - we find the node we want to delete
        else{
            //case 0: node to delete is a leaf - delete = set to null
            //case 1: node to delete have only one child - the child become the node

            if (subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild(); //can be node or null. Good anyway.
            }
            else if(subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }

            //case 3: node to delete has two children

            else{
                //Replace the value in the subtreeRoot nod with the smallest value from the right subtree
                subtreeRoot.setData(subtreeRoot.getRightChild().min());

                //Delete the node that have the smallest value in the right subtree.
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));


            }

        }

        return subtreeRoot;
    }
}
