package SDE.Day20;

import SDE.Classes.GFG.Node;

// https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1
// Find the inorder predecessor and successor of given key in BST (GFG)

public class Problem6 {
    class Res{
        Node pre = null;
        Node succ = null;
    }
    public static void findPreSuc(Node root, Res p, Res s, int key){
        if(root == null) return;
        if(root.data == key){
            if(root.left != null){
                Node temp = root.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                p.pre = temp;
            }
            if(root.right != null){
                Node temp = root.right;
                while(temp.left != null) temp = temp.left;
                s.succ = temp;
            }
            return;
        }
        if(root.data < key){
            p.pre = root;
            findPreSuc(root.right, p, s, key);
        }else{
            s.succ = root;
            findPreSuc(root.right, p, s, key);
        }
    }
}
