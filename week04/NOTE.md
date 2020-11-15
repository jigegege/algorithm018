学习笔记

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

半有序是 数组元素有一半以上是有序的话，分两半 判断是否有序，那就找到结果了
 ```java
    public int find(int[] nums) {
        int left = 0, right = nums.length, val;
        while (left <= right) {
            val = (right + left) / 2;
            if (nums[val] > nums[0]) {
                left = val + 1
            } else {
                right = val - 1;
            }
            
        }
        return val;
    }
```

没给定升序降序的话，还得分情况