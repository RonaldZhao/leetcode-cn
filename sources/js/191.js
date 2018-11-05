/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
    var str = n.toString(2);  // 将n转为二进制字符串
    return str.split("1").length-1;  // 将str通过"1"分割为数组，其(长度-1)就是其中1的个数
};
