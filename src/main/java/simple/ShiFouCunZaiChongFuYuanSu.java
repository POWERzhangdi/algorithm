package simple;

import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithm
 * @description: 判断是否存在重复元素
 * @author: daitu
 * @date: 2019/04/09 17:19
 *
 * 题目 [1，2，3，4，5] return true 不存在重复元素
 * [1，1，2，3，4，5] return false 存在重复元素
 */
public class ShiFouCunZaiChongFuYuanSu {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,4,5,6);
        for(int i = 0; i < list.size() ; i++){
            for(int j = list.size() - 1; j > i; j--){
                if(list.get(i) == list.get(j)){
                    System.out.println(true);
                    return;
                }
            }
        }
    }

}
