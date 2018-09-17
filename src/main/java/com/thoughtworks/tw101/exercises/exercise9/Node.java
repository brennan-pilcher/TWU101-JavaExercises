package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left, right;
    private List<String> names;


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

    public void getName (Node node) {
        if (node == null) {
            return;
        }

        getName(node.left);
        names.add(node.name);
        getName(node.right);
    }

    public List<String> names() {
        names = new ArrayList<>();

        getName(this);
        return names;
    }
}
