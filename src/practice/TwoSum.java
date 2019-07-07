package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @param :
 * @author : Jiang Erling
 * @date : created in 2019/7/7 10:30
 * @return :
 * @description :leetcode第一题，从数组中找出两个数之和与目标数值相等并输出他们的下标
 */
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;
        int length = nums.length;
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) ){
                System.out.println(complement);
                System.out.println(map.get(complement) + " " + i);
                return;
            }
            //处理和判断放在前面更合理
            map.put(nums[i] ,i);
            //添加进map放在后面可以有效解决{3,2,4}/6和{3,3}/6的问题，前者不会出现{0,0}，后者不会出现无解
            //对于key都是3的值，重复添加会覆盖前面的，因为key值必须是唯一的
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
