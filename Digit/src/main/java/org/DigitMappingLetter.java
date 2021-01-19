package org;

import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021/1/19
 * @description:transform the digits into letters
 */
public abstract class DigitMappingLetter {
    private final static String[][] LETTER_MTRIX = {{""}, {""}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}
            , {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};

    protected String getLetters(String[] digits) {
        List<List<String>> allLi = new ArrayList();
        for (String digit : digits) {
            List<String> singleLi = new ArrayList();
            for (int i = 0; i < digit.length(); i++) {
                String indexDigit = String.valueOf(digit.charAt(i));
                String[] letter = LETTER_MTRIX[Integer.parseInt(indexDigit)];
                flag:
                for (String s : letter) {
                    if ("".equals(s)) {
                        continue flag;
                    }
                    singleLi.add(s);
                }
            }
            allLi.add(singleLi);
        }
        return this.mapLetters(allLi);
    }

    private String mapLetters(List<List<String>> allLi) {
        if (allLi.size() > 1) {
            List<String> head = allLi.get(0);
            List<String> tail = allLi.get(1);
            List<String> tempLi = new ArrayList<>();

            int i = 0;
            do {
                String h = head.size() > 0 ? head.get(i) : "";
                i++;
                int k = 0;
                do {
                    String t = tail.size() > 0 ? tail.get(k) : "";
                    k++;
                    tempLi.add(h + t);
                } while (k < tail.size());
            } while (i < head.size());

            allLi.set(1, tempLi);
            allLi.remove(0);
            mapLetters(allLi);
        }
        return allLi.get(0).toString();
    }

    protected String checkInput(String[] digits, Integer maxInt) {
        if (null == digits || 0 == digits.length) {
            return "input can not be null";
        }
        for (String digit : digits) {
            Integer in;
            try {
                in = Integer.parseInt(digit);
            } catch (NumberFormatException e) {
                return "please input Integer";
            }

            if (0 > in || maxInt < in) {
                return "number out off range,please input between [0," + maxInt + "]";
            }
        }
        return null;
    }

    public abstract String checkAndReturnResult(String[] digits);
}
