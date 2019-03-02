public class Solution {
	/**
	 * 3. 无重复字符的最长子串
	 * 
	 * @param s 给定字符串
	 * @return -1:s为null;0:s为空串;>0:长度
	 */
	public int lengthOfLongestSubstring(String s) {
		int sub_max_length = -1; // 最长无重复字串的长度
		if (s != null) {
			int slen = s.length(); // 给定字符串的长度
			sub_max_length = 0; // 最长无重复字串的长度
			if (slen > 0) { // 判断是否为空串
				HashMap<Character, Integer> cMap = new HashMap<Character, Integer>(); // 记录每个字符最后出现的位置
				int start = 0; // 当前字串的起始位置
				for (int cur = 0; cur < slen; cur++) {
					char c = s.charAt(cur); // 当前位置的字符
					if (!cMap.containsKey(c)) { // 如果此字符未出现过
						cMap.put(c, cur); // 则将[字符,字符位置]加入map
						continue;
					} else {
						int index = cMap.get(c); // 上一次出现的位置
						if (index >= start) { // 为true则说明遇到了重复的字符
							int cur_sub_max_length = cur - start; // 计算当前无重复子串的长度
							if (cur_sub_max_length > sub_max_length) {
								sub_max_length = cur_sub_max_length; // 更新最大长度
							}
							start = index + 1; // 更新起始位置
						}
						cMap.put(c, cur); // 更新字符最后一次出现的位置
					}
				}
				sub_max_length = slen - start > sub_max_length ? slen - start : sub_max_length; // 如果最后一个子串的长度比当前返回值更大则更新返回值
			}
		}
		return sub_max_length;
	}
}