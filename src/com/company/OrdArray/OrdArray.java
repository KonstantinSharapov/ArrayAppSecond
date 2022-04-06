package com.company.OrdArray;

public class OrdArray {

    private long[] a;
    private int nElems;

    //constructor
    public OrdArray(int max){
        a = new long[max];
        nElems = 0;
    }

    //return size of OrdArray
    public int size(){
        return nElems;
    }


    //binary search
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while (true){
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn]==searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn]<searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    //insert element in OrdArray
    public void insert(long value){
        int j;
        for (j=0; j<nElems; j++)
            if (a[j] > value)
                break;
        for (int k=nElems; k>j; k--)
            a[k] = a[k-1];
        a[j] = value;
        nElems++;
    }

    //delete element from OrdArray
    public boolean delete(long value){
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int k=j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    //check my array
    public void display(){
        for (int j=0; j<nElems; j++)
            System.out.print(a[j]+" ");
        System.out.println(" ");
    }
}
