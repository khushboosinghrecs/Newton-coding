static int minValue(Node node)
 {
    if(node.left == null){
      return node.data;
    }   
    return minValue(node.left); 
 }
