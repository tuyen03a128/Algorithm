package johnny.algorithm.leetcode;

/**
 * 558. Quad Tree Intersection
A quadtree is a tree data in which each internal node has exactly four children: topLeft, topRight, bottomLeft and bottomRight. Quad trees are often used to partition a two-dimensional space by recursively subdividing it into four quadrants or regions.

We want to store True/False information in our quad tree. The quad tree is used to represent a N * N boolean grid. For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same. Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node. The val attribute for a leaf node contains the value of the region it represents.

For example, below are two quad trees A and B:

A:
+-------+-------+   T: true
|       |       |   F: false
|   T   |   T   |
|       |       |
+-------+-------+
|       |       |
|   F   |   F   |
|       |       |
+-------+-------+
topLeft: T
topRight: T
bottomLeft: F
bottomRight: F

B:               
+-------+---+---+
|       | F | F |
|   T   +---+---+
|       | T | T |
+-------+---+---+
|       |       |
|   T   |   F   |
|       |       |
+-------+-------+
topLeft: T
topRight:
     topLeft: F
     topRight: F
     bottomLeft: T
     bottomRight: T
bottomLeft: T
bottomRight: F
 

Your task is to implement a function that will take two quadtrees and return a quadtree that represents the logical OR (or union) of the two trees.

A:                 B:                 C (A or B):
+-------+-------+  +-------+---+---+  +-------+-------+
|       |       |  |       | F | F |  |       |       |
|   T   |   T   |  |   T   +---+---+  |   T   |   T   |
|       |       |  |       | T | T |  |       |       |
+-------+-------+  +-------+---+---+  +-------+-------+
|       |       |  |       |       |  |       |       |
|   F   |   F   |  |   T   |   F   |  |   T   |   F   |
|       |       |  |       |       |  |       |       |
+-------+-------+  +-------+-------+  +-------+-------+
Note:

Both A and B represent grids of size N * N.
N is guaranteed to be a power of 2.
If you want to know more about the quad tree, you can refer to its wiki.
The logic OR operation is defined as this: "A or B" is true if A is true, or if B is true, or if both A and B are true.

 * @author Johnny
 */
public class Solution558 {
    public class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf) {
            val = _val;
            isLeaf = _isLeaf;
        }
        
        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };
    
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1 == null) {
            return quadTree2;
        }
        if (quadTree2 == null) {
            return quadTree1;
        }
        
        Node node = new Node();
        if (quadTree1.isLeaf && quadTree1.val || 
                quadTree2.isLeaf && quadTree2.val) {
            node.val = true;
            node.isLeaf = true;
            return node;
        }
        
        if (quadTree1.isLeaf && !quadTree1.val && 
                quadTree2.isLeaf && !quadTree2.val) {
            node.val = false;
            node.isLeaf = true;
            return node;
        }
        
        node.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
        node.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
        node.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        node.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
        node.isLeaf = false;
        node.val = false;
        
        if (node.topLeft != null && node.topLeft.val && node.topRight.val && node.bottomLeft.val && node.bottomRight.val) {
            node.val = true;
            node.isLeaf = true;
            node.topLeft = null;
            node.topRight = null;
            node.bottomLeft = null;
            node.bottomRight = null;
        }
        
        return node;
    }
}
