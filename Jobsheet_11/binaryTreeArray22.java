package Jobsheet_11;

public class binaryTreeArray22 {
    int[] data;
    int idxLast;

    public binaryTreeArray22(){
        data = new int[10];
    }

    void pupulateData(int data[],int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
}
