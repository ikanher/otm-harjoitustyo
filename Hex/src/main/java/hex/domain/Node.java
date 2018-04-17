/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for representing Graph nodes (vertices).
 *
 * These Nodes are aware of their neighbors and also hold a color to represent
 * the player which owns this node.
 *
 * @author akir
 */
public class Node {

    private HexColor color = HexColor.WHITE;
    private List<Node> neighbors = new ArrayList<>();
    private int x;
    private int y;

    /**
     * Create a new Node at position x, y
     *
     * @param x x coordinate
     * @param y y coordinate
     */
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(HexColor color) {
        this.color = color;
    }

    public HexColor getColor() {
        return color;
    }

    /**
     * Adds a new neighbor for this node.
     *
     * @param n the neighbor node to add
     */
    public void addNeighbor(Node n) {
        if (!neighbors.contains(n)) {
            neighbors.add(n);
        }
    }

    /**
     * Returns the neighbors for this Node.
     *
     * @return List of neighbor nodes
     */
    public List<Node> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + color + ")";
    }
}