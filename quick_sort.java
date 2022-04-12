package javatest;

public class quick_sort {
    public void my_qsort(int[] a,int left,int right){
        if(left>=right)return;
        int l=left,r=right;
        int p=a[l];
        while(l<r){
            while(l<r&&a[r]>p){r--;}
            a[l]=a[r];
            while(l<r&&a[l]<=p){l++;}
            a[r]=a[l];
        }
        a[l]=p;
        my_qsort(a,left,l-1);
        my_qsort(a,l+1,right);
    }
}
