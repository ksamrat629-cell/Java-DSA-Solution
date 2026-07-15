package Array;

import java.util.HashMap;

public class Counting_of_Arry_Element {

    //using HashMap
    public static void freqCounting(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        System.out.println(map);
    }

    //using boolean Array

    public static void bool_Array_Method(int[] arr){
        boolean[] visited = new boolean[arr.length];
        
        for(int i = 0 ; i<arr.length; i++){
            int count = 1;
            if(visited[i]) continue;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }  
            }
            visited[i] = true;
            System.out.println(arr[i]+": "+count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,4,1,4,6,7,5,4,3};
        freqCounting(arr);
        bool_Array_Method(arr);
    }
}
