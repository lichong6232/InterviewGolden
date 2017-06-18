package cn.bupt.interviewGolden;

import java.util.ArrayList;

public class UndirectedGraphNode {

	int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
	
}
