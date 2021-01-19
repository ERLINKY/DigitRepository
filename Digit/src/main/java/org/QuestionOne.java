package org;


/**
 * @date:2021/1/19
 * @description:transform :the entrance of QuestionOne
 */
public class QuestionOne extends DigitMappingLetter {
    @Override
    public String checkAndReturnResult(String[] digits) {
        String checkResult = this.checkInput(digits, 9);
        if (null != checkResult) {
            return checkResult;
        }
        return this.getLetters(digits);
    }
}
