package other;

import java.util.Arrays;

/*
* reverse를 사용하여 오름차순 정렬하기
* */
public class Question1 {
    private int[] reverse(int[] input, int left, int right){

        while(left < right){
            swap(input, left, right);
            left++;
            right--;
        }
        return input;
    }
    private void swap(int[] input, int idx1, int idx2){
        int tmp = input[idx1];
        input[idx1] = input[idx2];
        input[idx2] = tmp;
    }
    private int[] mysort(int[] input){
        for(int i = 1; i < input.length; i++){
            if(input[i] < input[i-1]){

            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Question1 test = new Question1();
        System.out.println(Arrays.toString(test.reverse(a, 0, 4)));

        int[] b = {10, 1, 3, 5, 2, 4, 7, 0, 9};
    }
}
