package MaxDepthBinaryTree;

public class TreeQ {
    int val;
     TreeQ left;
    TreeQ right;
    TreeQ() {}
    TreeQ(int val) { this.val = val; }
    TreeQ(int val, TreeQ left, TreeQ right) {
         this.val = val;
          this.left = left;
          this.right = right;
     }
}
