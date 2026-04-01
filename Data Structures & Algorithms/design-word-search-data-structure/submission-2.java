class TreeNode{
    public HashMap<Character, TreeNode> children=new HashMap<>();
    public boolean endOfWord=false;
}
class WordDictionary {
public TreeNode root;
    public WordDictionary() {
        root=new TreeNode();
    }

    public void addWord(String word) {
TreeNode cur=root;
for(char c:word.toCharArray()){
    cur.children.putIfAbsent(c, new TreeNode());
    cur=cur.children.get(c);
}
cur.endOfWord=true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
        }
        
       
    
    private boolean dfs(String word, int j, TreeNode root){
            TreeNode cur=root;
        for(int i=j;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='.'){
                for(Map.Entry<Character, TreeNode> child: cur.children.entrySet()){
                   if(child.getValue()!=null&& dfs(word, i+1, child.getValue())){
                    return true;
                   }
                }
                return false;
            }else{
            if(!cur.children.containsKey(c)){
                return false;
            }
            cur=cur.children.get(c);
        }}
         return cur.endOfWord;
    }
}
