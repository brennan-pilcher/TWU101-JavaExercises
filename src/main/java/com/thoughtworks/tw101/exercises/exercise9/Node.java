package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    public String name;
    public Node left, right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int comparison = nameOfNewNode.compareToIgnoreCase(name);
        if (comparison < 0) {
            if (left != null) {
                left.add(nameOfNewNode);
            }
            else {
                left = new Node(nameOfNewNode);
            }
        }
        else if (comparison > 0) {
            if (right != null) {
                right.add(nameOfNewNode);
            }
            else {
                right = new Node (nameOfNewNode);
            }
        }
        else {
            throw new RuntimeException("Adding equivalent strings isn't handled.");
        }
    }

    public void print () {
        System.out.println("Node: " + name);
        System.out.println("L: " + left.name);
        System.out.println("R: " + right.name);
        System.out.println("\n");
    }

    public List<String> names() {
        return null;
    }
}
