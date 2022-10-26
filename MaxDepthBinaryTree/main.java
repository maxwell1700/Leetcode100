package MaxDepthBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        TreeQ a = new TreeQ(1);
        TreeQ b = new TreeQ(2);
        TreeQ c = new TreeQ(3);
        TreeQ d = new TreeQ(4);
        TreeQ e = new TreeQ(5);
        TreeQ f = new TreeQ(6);


        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        e.right = f;

        System.out.println(maxDepthQueue(a));


    }

    static int maxDepth(TreeQ root) {
        if(root == null){
            return 0;
        }

        if (root.left == null && root.right == null){
            return 1;
        }

        int ans = 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); // you can just return line 33 but this helps me understand as this runs every time you have hit your final base case

        return ans;

    }

    static int maxDepthQueue(TreeQ root) {
       if(root == null) {
           return 0;
       }

       Queue<TreeQ> q1 = new LinkedList();
       q1.offer(root);

       int count = 0;

       while(!q1.isEmpty()){
           int size = q1.size();


           while(size-- > 0){
               TreeQ poll = q1.poll();// while loops number of elements there are in the queue
               if(poll.left != null){// increments count as you go down levels
                   q1.offer(poll.left);
               }

               if(poll.right != null){
                   q1.offer(poll.right);
               }
           }
           count++;
       }
       return count;
    }
}
