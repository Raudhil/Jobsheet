package Jobsheet_11;

public class binaryTreeArrayMain22 {
    public static void main(String[] args) {
        binaryTreeArray22 bta = new binaryTreeArray22();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.pupulateData(data,idxLast);
        System.out.println("\nInorder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
