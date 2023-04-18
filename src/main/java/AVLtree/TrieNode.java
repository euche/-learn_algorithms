package AVLtree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character, TrieNode> children;
    boolean endOFString;

    public TrieNode() {
        this.children = new HashMap<>();
        this.endOFString = false;
    }


}
