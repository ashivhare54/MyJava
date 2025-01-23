package DSA.BinaryTree;

public class BinaryTreeYT {

        static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;

            }
        }

        static class BinaryTree{
            static int idx=-1;

            //this method will return root node
            public static Node buildTree(int[] nodes){
                idx++; // initial value becomes 0
                if(nodes[idx]==-1)
                    return null;

                Node newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);

                return newNode;
            }

            public static void preorder(Node root){
                if(root==null) {
//                    System.out.print(-1 +" ");
                    return;
                }
                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);
            }

            public static void inorder(Node root){
                if(root==null) {
//                    System.out.print(-1 +" ");
                    return;
                }
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            }

            public static void postorder(Node root){
                if(root==null) {
//                    System.out.print(-1 +" ");
                    return;
                }
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data+" ");

            }
            public static int countOfNodes(Node root){
                if (root==null) return 0;

                int leftNode=countOfNodes(root.left);
                int rightnode=countOfNodes(root.right);

                return leftNode+ rightnode + 1;
            }

            public static int sumOfNodes(Node root){
                if (root==null) return 0;

                int leftNode=sumOfNodes(root.left);
                int rightnode=sumOfNodes(root.right);

                return leftNode+ rightnode + root.data;
            }

            public static int heightOfNodes(Node root){
                if(root==null) return 0;

                int leftHeight=heightOfNodes(root.left);
                int rightHeight=heightOfNodes(root.right);

                return (leftHeight>=rightHeight)? leftHeight+1:rightHeight+1;
            }
        }

        public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        Node root=DSA.LinkedListP.BinaryTree.buildTree(nodes);
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

       int node= tree.countOfNodes(root);
       System.out.println("count= "+node);

       int sum=tree.sumOfNodes(root);
       System.out.println("sum= "+sum);

       int height=tree.heightOfNodes(root);
       System.out.println("heightofTree= "+height);

        }

}

// implementing Binary tree using recursion and printing Root node