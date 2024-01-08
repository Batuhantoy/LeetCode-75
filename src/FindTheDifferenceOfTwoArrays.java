import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    /*
    Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
    Note that the integers in the lists may be returned in any order.
    */

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int n:nums1){
            s1.add(n);
        }
        for(int n:nums2){
            s2.add(n);
        }

        //HashSet<Integer> s3 = Arrays.stream(nums1).filter(n->!s2.contains(n)).collect(Collectors.toSet());

        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> lst1= new ArrayList<>(s1);
        List<Integer> lst2= new ArrayList<>(s2);
        lst1.removeAll(s2);
        lst2.removeAll(s1);
        answer.add(lst1);
        answer.add(lst2);
        return answer;
    }


    // 9 ms
    /*public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int n:nums1){
            s1.add(n);
        }
        for(int n:nums2){
            s2.add(n);
        }

        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> lst1= new ArrayList<>(s1);
        List<Integer> lst2= new ArrayList<>(s2);
        lst1.removeAll(s2);
        lst2.removeAll(s1);
        answer.add(lst1);
        answer.add(lst2);
        return answer;
    }*/
}
