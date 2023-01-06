class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length; // 문제에서 주어진 입력값인 [1,2],[3,4] 배열의 길이를 구한다.
        if (m * n != r * c) return mat; // 기존의 행렬과 원하는 크기를 위해 입력한 행렬 곱의 크기가 다른경우 mat를 return 해준다.
        int[][] result = new int[r][c]; // 기존 행렬 크기와 선언한 행렬 곱 크기가 같을 경우 원하는 행렬로 배열하기 위해 새로운 크기의 배열 크기로 선언해준다. 
        for (int i = 0; i < m * n; ++i) {
            result[i / c][i % c] = mat[i / n][i % n]; // 선언한 행렬의 크기( r x c )를 맞추기 위해 해당 연산으로 result배열에 저장 
        }
        return result;
    }
}