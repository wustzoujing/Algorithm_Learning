import javax.swing.tree.TreeNode;

/**
 * Created by zoujing on 2017/5/10.
 */
public class ResetBTree_4 {


        //Definition for binary tree
  public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        //为空则返回空，输入检查，还可检查两者长度是否相等。
        if(pre==null||in==null){
            return null;
        }
        java.util.HashMap<Integer,Integer> map=new java.util.HashMap<Integer,Integer>();
        //中序遍历进map
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        //交给重建函数
        return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
    }
    //p，n，map属于不变的，这样写代码简洁一点，变得是前序遍历和中序遍历在原序列中的起止索引。
    public TreeNode preIn(int[] p,int pi,int pj,int[] n,int ni,int nj,java.util.HashMap<Integer,Integer> map){
        //前序遍历开始位置大于结束位置，返回空。
        if(pi>pj){
            return null;
        }
        //前序遍历开始位置就是根节点。
        TreeNode head =new TreeNode(p[pi]);
        //获得根节点在中序序列中的索引位置
        int index=map.get(p[pi]);
        //递归左子树，前序遍历pi自增1就行，结束位置算法是（pi+1）+（index-1-ni），因为
        //index-1为中序遍历结束位置减去ni开始位置就是中序遍历的个数，在加上pi+1就是前序遍历
        //结束为止
        head.left=preIn(p,pi+1,pi+index-ni,n,ni,index-1,map);
        //右子树的前序开始位置为左子树结束位置自增1，结束位置是pj，中序遍历开始是根节点位置自
        //增1，结束位置是nj
        head.right=preIn(p,pi+index-ni+1,pj,n,index+1,nj,map);
        //重建完成返回
        return head;
    }
}

