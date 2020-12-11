package com.barchenko.labs.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchExampleNeighbourList
{

    // Iterative DFS using stack
    public void dfsUsingStack(Node node)
    {
        Stack<Node> stack=new Stack<>();
        stack.add(node);
        while (!stack.isEmpty())
        {
            Node element=stack.pop();
            if(!element.visited)
            {
                System.out.print(element.data + " ");
                element.visited=true;
            }
            List<Node> neighbours = element.getNeighbours();
            for (Node n : neighbours) {
                if (n != null && !n.visited) {
                    stack.add(n);
                }
            }
        }
    }

    public static void main(String[] arg)
    {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.addNeighbours(node2);
        node1.addNeighbours(node4);
        node1.addNeighbours(node5);
        node2.addNeighbours(node1);
        node2.addNeighbours(node3);
        node3.addNeighbours(node2);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node3);
        node4.addNeighbours(node1);
        node4.addNeighbours(node5);
        node5.addNeighbours(node1);
        node5.addNeighbours(node3);
        node5.addNeighbours(node4);

        DepthFirstSearchExampleNeighbourList dfsExample = new DepthFirstSearchExampleNeighbourList();

        System.out.println("The DFS traversal of the graph using stack ");
        dfsExample.dfsUsingStack(node1);
    }
}

