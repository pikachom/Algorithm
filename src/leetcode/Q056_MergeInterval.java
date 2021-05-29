package leetcode;
import java.util.*;

/*
* Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

* Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*
* */


public class Q056_MergeInterval {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        //interval 의 시작지점 오름차순 정렬

        ArrayList<int[]> merged = new ArrayList();
        merged.add(intervals[0]);
        for(int[] interval : intervals){
            int[] last = merged.get(merged.size() - 1);
            if(last[1] < interval[0]){
                merged.add(interval);
            }else{
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
/*
* time :
* Arrays.sort는
* primitive type의 경우에는 dual pivot quick sort
* 객체 타입의 경우에는 TimSort( = mergesort + insertionsort)
* 여기서는 int[] 인 객체이므로 timsort가 사용되어 최악에도 NlogN을 보장
* 이후 add해가는 과정은 O(N)
* */