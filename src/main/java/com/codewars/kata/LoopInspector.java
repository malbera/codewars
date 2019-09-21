package com.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class LoopInspector {

    public int loopSize(Node node) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(node);
        int result = 0;
        Node temp = node;
        while ((temp = temp.getNext()) != null) {
            if (nodes.contains(temp)) {
                result = nodes.size() - nodes.indexOf(temp);
                break;
            } else {
                nodes.add(temp);
            }
        }
        return result;
    }

}
