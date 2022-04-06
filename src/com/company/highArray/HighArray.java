package com.company.highArray;

public class HighArray {

    private long[] a;
    private int nElems;

    //constructor
    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    //inser element in array (not sorting)
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    //linear search
    public boolean find(long searchKey){
        int j;
        for (j =0; j<nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    //delete element from array
    public boolean delete(long value){
        int j;
        for (j=0; j<nElems;j++)
            if (a[j] == value)
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    //check my array
    public void display(){
        for (int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }
}
