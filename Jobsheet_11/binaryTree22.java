package Jobsheet_11;

public class binaryTree22 {
    node22 root;

    public binaryTree22() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    
    void add(int data) {
        if (isEmpty()) {
            root = new node22(data);
        } else {
            node22 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.left == null) {
                        current.left = new node22(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data < current.data) {
                    if (current.right == null) {
                        current.right = new node22(data);
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
        boolean result = false;
        node22 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(node22 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
            traversePreOrder(node.left);
        }
    }

    void traversePostOrder(node22 node) {
        if (node != null) {
            traversePostOrder(node.right);
            traversePostOrder(node.left);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node22 node) {
        if (node != null) {
            traverseInOrder(node.right);
            System.out.print(" " + node.data);
            traverseInOrder(node.left);
        }
    }

    node22 getSuccessor(node22 del) {
        node22 successor = del.right;
        node22 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        node22 parent = root;
        node22 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data > current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data < current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data not found!");
            return;
        }
        if (current.right == null && current.left == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else if (current.left == null) {
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
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }

        } else {
            node22 successor = getSuccessor(current);
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
}
