package www.sharywkd.cn.leetcode;

public class CompressStr {
    private String s;

    public static void main(String[] str) {
        CompressStr testStr = new CompressStr();
        System.out.println(testStr.compressString("aabcccccaa"));
    }

    public String compressString(String S) {
        if (null == S || "".equals(S)) {
            return S;
        }
        String result = countStr(S);
        if (!result.equals(S) && result.length() < S.length()) {
            return result;
        }
        return S;

    }

    private String countStr(String originStr) {
        char lastChar = originStr.charAt(0);
        StringBuffer buffer = new StringBuffer().append(lastChar);
        int tempStrNum = 1;
        for (int i = 1; i < originStr.length(); i++) {
            char tempStr = originStr.charAt(i);
            if (tempStr == lastChar) {
                tempStrNum++;
            } else {
                buffer.append(tempStrNum).append(tempStr);
                tempStrNum = 1;
                lastChar = tempStr;
            }
        }
        buffer.append(tempStrNum);
        return buffer.toString();

    }
}
