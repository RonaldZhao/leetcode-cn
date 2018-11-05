/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    // parseInt()函数
    if( n == 0){
        return 0;
    }
    
    var n_bin = parseInt(n, 10).toString(2); // 将 n 转为二进制字符串，不带开头的0
    var diff = 32 - n_bin.length;// 计算与开头带0的32位二进制差几个0
    for(var i = 0; i < diff; i++){ // 补足开头的0
        n_bin = "0" + n_bin;
    }
    
    n_bin = n_bin.split("").reverse().toString(); // 将二进制字符串反转
    while(!n_bin.startsWith("1")){ // 去除开头的0
        n_bin = n_bin.substr(1,n_bin.length);
    }
    
    var t = n_bin.length;// 当前二进制串的长度
    if(t > 1){
        for(var i=0; i < t; i++){ // 去除逗号，否则包含0/1之外的符号不能转为十进制
            n_bin=n_bin.replace(",", "");
        }
    }
    return parseInt(n_bin, "2");// 返回其十进制数
};
