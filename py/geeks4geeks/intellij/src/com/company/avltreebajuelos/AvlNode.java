package com.company.avltreebajuelos;


// http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/AvlTree.java
public  class AvlNode{
    int element;
    AvlNode left;
    AvlNode right;
    int height;

    AvlNode(int element)
    {

    }

    AvlNode(int theElement, AvlNode lt,AvlNode rt)
    {
        element = theElement;
        left = lt;
    }
}