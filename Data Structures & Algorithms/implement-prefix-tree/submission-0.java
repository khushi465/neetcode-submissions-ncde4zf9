class TreeNode{
    HashMap<Character, TreeNode> children=new HashMap<>();                
    boolean endOfWord=false;
}
class PrefixTree {
    public TreeNode root;
    public PrefixTree() {
         root=new TreeNode();
    }

    public void insert(String word) {
        TreeNode cur=root;
        for(char c: word.toCharArray()){
            cur.children.putIfAbsent(c, new TreeNode());
            cur=cur.children.get(c);
        }
        cur.endOfWord=true;
    }

    public boolean search(String word) {
        TreeNode cur=root;
        for(char c:word.toCharArray()){
            if(!cur.children.containsKey(c)){
                return false;
            }
            cur=cur.children.get(c);
        }
        return cur.endOfWord;//if its the endofword only then return true
    }

    public boolean startsWith(String prefix) {
        TreeNode cur=root;
        for(char c:prefix.toCharArray()){
            if(!cur.children.containsKey(c)){
                return false;
            }
            cur=cur.children.get(c);
        }
        return true;//returns true whether endofword or not since checking the prefix only
    }
}
