package com.MyLeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Saw96x
 * @date 2020/9/12 - 9:04
 */
public class getRow_119 {
    //给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

    //直接构造杨辉三角并返回相应的行数
    public List<Integer> getRow1(int rowIndex) {
            int pre = 1;
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int i = 1; i <= rowIndex; i++) {
                for (int j = 1; j < i; j++) {
                    int temp = cur.get(j);
                    cur.set(j, pre + cur.get(j));
                    pre = temp;
                }
                cur.add(1);
            }
            return cur;
        }
}
