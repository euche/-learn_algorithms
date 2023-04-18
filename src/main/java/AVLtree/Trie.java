package AVLtree;

import java.util.HashMap;
import java.util.Map;


public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        System.out.println("The Trie has been created");
    }

    public void insertMethod(String word){
        TrieNode current = root;        // Identify the current node by setting it to the root node
        for(int i = 0; i < word.length(); i++ ){ // loop through the character of the word we want to insert inside
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);         // if the character exist in the trie continue to the next node.
            if(node == null){        // if node is null
                node = new TrieNode();
                current.children.put(ch,node);    //    insert the character into trie and create an empty node as a child of the character
            }
            current = node;  // if node contains a value.
        }
        current.endOFString = true;    //After the operation, we set endOfString to true;
        System.out.println("Succesfully inserted "+word+"in Trie");
    }

    //Search Method

    public boolean searchTrie(String word){
        TrieNode currentNode = root;
        for (int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if(node == null){
                System.out.println("Word "+word +" doesnt exist in trie.");
                return false;
            }
            currentNode = node;
        }
        if(currentNode.endOFString == true){                   //currentNode.endOFString == true' can be simplified to 'currentNode.endOFString'// suggestion
            System.out.println("word => "+word+" exists in trie");
            return true;
        }else{
            System.out.println("Word "+word+" does not exist in Trie but it is a prefix of another string");
        }

          return currentNode.endOFString;
    }

    // Delete a String from trie
    // 2 methods, helper method and delete method
    // Helper method returns boolean

    private boolean delete(TrieNode parentNode, String word, int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        Boolean canThisNodeBeDeleted;

        if(currentNode.children.size() > 1){ // Case 1 this codeline indicates that currentNode is a prefix
            delete(currentNode,word,index+1);
            return false;   // we are not deleting this node
        }
         //case 2
         // we are at the last character of this word, but the word is a prefix of another word

        if(index == word.length()-1){
            if(currentNode.children.size() >= 1){ // means it is a prefix of another word.
                currentNode.endOFString = false;
                return false;
            }else{
                parentNode.children.remove(ch);
                return true;
            }
        }
        // Case 3
        //Some other word is a prefix of this word.

        if(currentNode.endOFString == true){
            delete(currentNode,word,index+1);          // we make the recursive call for the next character
            return false;   // we are not deleting the node;
        }
        //case 4
        canThisNodeBeDeleted = delete(currentNode,word,index+1);  //value from recursive call
        if (canThisNodeBeDeleted == true){
            parentNode.children.remove(ch);
            return true;
        }else{
            return false;    // we are not deleting the node; some other node is dependent on this node.
        }

    }

    //Main delete Method
    public void delete(String word){
        if(searchTrie(word) == true){
            delete(root,word,0);
        }
    }






}
