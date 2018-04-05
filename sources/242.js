/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    len_s = s.length;
    len_t = t.length;
    if( len_s != len_t ){
        return false;
    }
    if( len_s <= 1 ){
        return s == t;
    } else {
        var dict_s = new Array();
        var dict_t = new Array();
        for(var i=0; i<len_s; i++){
            if(s[i] in dict_s){
                dict_s[s[i]] += 1;
            } else {
                dict_s[s[i]] = 1;
            }
            if(t[i] in dict_t){
                dict_t[t[i]] += 1;
            } else {
                dict_t[t[i]] = 1;
            }
        }
        for(var k in dict_s){
            if(dict_s[k] != dict_t[k]){
                return false;
            }
        }
        return true;
    }
};
