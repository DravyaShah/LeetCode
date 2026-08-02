class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        for(int j=0;j<m;j++)               // taking column of first row 
        {
            sort(mat,0,j);
        }

        for(int i=0;i<n;i++)              // taking row of first column
        {
            sort(mat,i,0);
        }
        return mat;
    }

    public void sort(int mat[][], int row, int col)
    {
        ArrayList<Integer> a=new ArrayList<>();

        int r=row;
        int c=col;

        while(r<mat.length && c<mat[0].length)     // add elements diagonally and sort them
        {
            a.add(mat[r][c]);
            r++;
            c++;
        }

        Collections.sort(a);

        r=row;                         // put again back to matrix
        c=col;
        int index=0;

        while(r<mat.length && c<mat[0].length)
        {
            mat[r][c]=a.get(index++);
            r++;
            c++;
        }
    }
}