class Node {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BST {
    insert(root , newNode){
        if (root.val > newNode.val){
            if (root.left === null){
                root.left = newNode ;
            }else{
                this.insert(root.left , newNode);
            }
        }else{
            if (root.right === null){
                root.right = newNode ;
            }else{
                this.insert(root.right , newNode);
            }
        }
    }
}