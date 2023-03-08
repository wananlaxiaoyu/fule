public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod  m =  new HspMethod();
        System.out.println(m.sum(10,50));
    }
}
//上面的三个方法名称相同，功能相同，参数个数不同-〉使用可变参数优化
//int... 表示接受的是可变参数，类型是int，即可以接收多个int（0-多）
//使用可变参数时，可以当做数组来使用 即nums 可以当做数组
//遍历 nums 求和即可
        class HspMethod {
            public int sum(int... nums) {
                System.out.println();
int res = 0;
for (int i = 0; i < nums.length; i++){
    res +=nums[i];

}
return res;

        }
}