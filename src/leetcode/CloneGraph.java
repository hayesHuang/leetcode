package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};
public class CloneGraph {
	private void clone(HashMap<Integer,UndirectedGraphNode> createdNodes,Queue<UndirectedGraphNode> tovisitNodes){
		if(tovisitNodes.isEmpty()) return;
		UndirectedGraphNode node=tovisitNodes.poll();
		UndirectedGraphNode clonedNode = createdNodes.get(node.label);
		if(clonedNode==null){
			clonedNode=new UndirectedGraphNode(node.label);
		}
		
	}
	
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null) return null;
        UndirectedGraphNode start = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> visitList = new LinkedList<UndirectedGraphNode>();
        visitList.add(node);
        HashMap<UndirectedGraphNode,UndirectedGraphNode> createdNodes = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        createdNodes.put(node, start);
        while(!visitList.isEmpty()){
        	UndirectedGraphNode graphNode = visitList.poll();
        	UndirectedGraphNode graphNodeCopy = createdNodes.get(graphNode);
        	for(UndirectedGraphNode neighbor:graphNode.neighbors){
        		if(!createdNodes.containsKey(neighbor)){
        			UndirectedGraphNode copy = new UndirectedGraphNode(neighbor.label);
        			createdNodes.put(neighbor, copy);
        			visitList.add(neighbor);
        			graphNodeCopy.neighbors.add(copy);
        		}else{
        			graphNodeCopy.neighbors.add(createdNodes.get(neighbor));
        		}
        	}
        }
        return start;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
