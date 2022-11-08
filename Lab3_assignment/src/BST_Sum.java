import java.util.ArrayList;

class Node {

	Node left,right;
	int data;
	Node(int d){
		data =d;
		right=left=null;
	}
	
}

 class BST_Sum {
	 Node root;
	 
	 void inorder() {
		 inorderfunction(this.root);
	 }
	 
	 void inorderfunction(Node node){
		 if(node == null)
			 return;
		 inorderfunction(node.left);
		 System.out.println(node.data + " ");
		 inorderfunction(node.right);
	 }
	 
     void insert(int key){
    	 root = insertData(root,key);
     }
     
   Node insertData(Node root,int data){
    	  if(root==null) {
    		 root = new Node(data);
    		 return root;
    	 }
    			if(data <root.data) {
    					root.left =insertData(root.left,data);
    				}else {
    					root.right =insertData(root.right,data);;
    				}
				return root;
    			}
   
   ArrayList<Integer> treeToList(Node node, ArrayList<Integer>
   list)
{
if (node == null)
return list;

treeToList(node.left, list);
list.add(node.data);
treeToList(node.right, list);

return list;
}
 
   boolean isPairPresent(Node node, int target)
   {
       ArrayList<Integer> a1 = new ArrayList<>();
       ArrayList<Integer> a2 = treeToList(node, a1);

       int start = 0;

       int end = a2.size() - 1; 

       while (start < end) {

           if (a2.get(start) + a2.get(end) == target) 
           {
               System.out.println("Pair Found: " + a2.get(start) + " + " + a2.get(end) + " "
                                  + "= " + target);
               return true;
           }
           if (a2.get(start) + a2.get(end) > target) 
           {
               end--;
           }
           if (a2.get(start) + a2.get(end) < target) 
           {
               start++;
           }
       }
       System.out.println("No such values are found!");
       return false;
   }


	public static void main(String args[]) {
		
		BST_Sum tree = new BST_Sum();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(70);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
       tree.isPairPresent(tree.root,130);
	}
}
