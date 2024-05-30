public class BinaryTree14 {
    Node14 root;

    public BinaryTree14() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node14(data);
        } else {
            Node14 current = root;
            Node14 parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node14(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node14(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node14 current = root;
        while (current!= null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node14 node) {
        if (node!= null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node!= null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node14 node) {
        if (node!= null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node14 getSuccessor(Node14 del) {
        Node14 successor = del.right;
        Node14 successorParent = del;
        while (successor.left!= null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successorParent!= del) {
            successorParent.left = successor.right;
        } else {
            successorParent.right = successor.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is Empty!");
            return;
        }

        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current.data!= data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left== null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node14 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

    void addRecursive(int data) {
        root = addRecursiveHelper(root, data);
    }
    
    private Node14 addRecursiveHelper(Node14 node, int data) {
        if (node == null) {
            return new Node14(data);
        }
    
        if (data < node.data) {
            node.left = addRecursiveHelper(node.left, data);
        } else if (data > node.data) {
            node.right = addRecursiveHelper(node.right, data);
        } else {
            // handle duplicate data
            System.out.println("Duplicate data: " + data);
        }
    
        return node;
    }

   
    
    private Node14 addHelper(Node14 node, int data) {
        if (node == null) {
            return new Node14(data);
        }
    
        if (data < node.data) {
            node.left = addHelper(node.left, data);
        } else if (data > node.data) {
            node.right = addHelper(node.right, data);
        }
        return node;
    }
    
    public boolean contains(int data) {
        return containsHelper(root, data);
    }

    private boolean containsHelper(Node14 node, int data) {
        if (node == null) {
            return false;
        }
        if (data < node.data) {
        return containsHelper(node.left, data);
        } else if (data > node.data) {
            return containsHelper(node.right, data);
        } else {
            return true;
        }
    }
    
    public void remove(int data) {
        root = removeHelper(root, data);
    }
    
    private Node14 removeHelper(Node14 node, int data) {
        if (node == null) {
        return null;
        }
    
        if (data < node.data) {
            node.left = removeHelper(node.left, data);
        } else if (data > node.data) {
            node.right = removeHelper(node.right, data);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.data = findMinHelper(node.right).data;
                node.right = removeHelper(node.right, node.data);
            }
        }
    
        return node;
    }
    
    private Node14 findMinHelper(Node14 node) {
        if (node.left == null) {
            return node;
        }
        return findMinHelper(node.left);
    }
    
    private Node14 findMaxHelper(Node14 node) {
        if (node.right == null) {
            return node;
        }
        return findMaxHelper(node.right);
    }
    
    public int[] findMinMax() {
        Node14 minNode = findMinHelper(root);
        Node14 maxNode = findMaxHelper(root);
        return new int[] {minNode.data, maxNode.data};
    }

    public void displayLeafNodes() {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        displayLeafNodesHelper(root);
    }
    
    private void displayLeafNodesHelper(Node14 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        displayLeafNodesHelper(node.left);
        displayLeafNodesHelper(node.right);
    }

    public int countLeafNodes() {
        if (root == null) {
            return 0;
        }
        return countLeafNodesHelper(root);
    }
    
    private int countLeafNodesHelper(Node14 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesHelper(node.left) + countLeafNodesHelper(node.right);
    }

    
    
}