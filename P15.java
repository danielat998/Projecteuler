public class P15_2{
  public static int[][] vals = {{75, 0, 0, 0, 0, 0},
                                {95,64, 0, 0, 0, 0},
                                {17,47,82, 0, 0, 0}};//et. c.
  public static BinTreeNode tree;

  public static void main(String[] args){
    tree=populate(vals);
testTree(tree);
    getPath(tree, 0);
  }

  public static int bestSoFar = 0;

  public static void getPath(BinTreeNode b, int count){
    count += b.value;
    if (b.left == null && b.right == null)
      if(count > bestSoFar){
        System.out.println("The maximum total from one path is: " + count);
    } else {
      getPath(b.left, count);
      getPath(b.right, count);
    }
  }

  public static void testTree(BinTreeNode b){
    System.out.print("Value is:" + b.value + "\n");
    System.out.print("left node:");
    testTree(b.left);
    System.out.print("right node:");
    testTree(b.right);
  }

  public static BinTreeNode populate(int[][] values){
    return populateNode(0,0, values);
  }
  public static BinTreeNode populateNode(int x, int y,int[][] values){
    if (x < values.length && y < values[0].length){
      BinTreeNode btn = new BinTreeNode();
      btn.value = vals[x][y];
      btn.left = populateNode(x, y+1, values);
      btn.right = populateNode(x+1, y+1, values);
      return btn;
    }
    return null;
  }

  public static class BinTreeNode{
    public BinTreeNode left = null;
    public BinTreeNode right = null;
    public int value;
  }
}
