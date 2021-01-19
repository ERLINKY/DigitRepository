package org;

/**
 * @date:2021/1/19
 * @description:transform :the entrance of QuestionSecond
 */
public class QuestionTwo extends DigitMappingLetter {
    @Override
    public String checkAndReturnResult(String[] digits) {
        String checkResult = this.checkInput(digits, 99);
        if (null != checkResult) {
            return checkResult;
        }
        return this.getLetters(digits);
    }
}
