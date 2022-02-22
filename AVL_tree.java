	/* Class node is defined as :
    class Node 
    	int val;	//Value
    	int ht;		//Height
    	Node left;	//Left child
    	Node right;	//Right child

	*/
    static int height(Node root){
        if(root==null)      {return -1;}
        else                {return root.ht;}
    }

    static int balance(Node root){
        return (height(root.right) - height(root.left));
    }


    static Node rightRotate(Node root){
        if(root.left == null){
            System.out.println("[rightRotate()]: Operation not Possible;root.left == null");
            return null;
        }
        else{
            Node ret = root.left;
            root.left = ret.right;
            ret.right = root;
            root.ht = 1 + Math.max(height(root.left), height(root.right));
            ret.ht = 1 + Math.max(height(ret.left), height(ret.right));
            return ret;
        }
    }
static Node leftRotate(Node root){
    if(root.right == null){
        System.out.println("[leftRotate()]: Operation not Possible;root.right == null");
        return null;
    }
    else{
        Node ret = root.right;
        root.right = ret.left;
        ret.left = root;
        root.ht = 1 + Math.max(height(root.left), height(root.right));
        ret.ht = 1 + Math.max(height(ret.left), height(ret.right));
        return ret;
    }
}
	static Node insert(Node root,int val)
    {
        if(root == null){
            Node temp = new Node();
            temp.val = val;
            return temp;
        }
        else if(root.val < val){
            root.right = insert(root.right, val);
            root.ht = 1 + Math.max(height(root.left), height(root.right));
        }
        else{
            root.left = insert(root.left, val);
            root.ht = 1 + Math.max(height(root.left), height(root.right));
        }
        
        switch(balance(root)){
            case 2:
                if(balance(root.right) < 0){
                    root.right = rightRotate(root.right);
                }
                root = leftRotate(root);
                break;
            case -2:
                if(balance(root.left) > 0){
                    root.left = leftRotate(root.left);
                }
                root = rightRotate(root);
                break;
        }
        return root;	
    }
