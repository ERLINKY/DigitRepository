package org;

import org.junit.Test;

public class QuestionTwoTest {
    /**
     * correct input test
     */
    @Test
    public void correctTest1() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"0"});
        System.out.println(result);
    }

    @Test
    public void correctTest2() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"3"});
        System.out.println(result);
    }

    @Test
    public void correctTest3() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"1", "2"});
        System.out.println(result);
    }

    @Test
    public void correctTest4() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"2", "1"});
        System.out.println(result);
    }

    @Test
    public void correctTest5() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"2", "3", "4"});
        System.out.println(result);
    }

    @Test
    public void correctTest6() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"2", "3", "4", "5"});
        System.out.println(result);
    }

    @Test
    public void correctTest7() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"13"});
        System.out.println(result);
    }

    @Test
    public void correctTest8() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"23", "46"});
        System.out.println(result);
    }

    @Test
    public void correctTest9() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"99", "88"});
        System.out.println(result);
    }

    @Test
    public void correctTest10() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"11", "99", "88"});
        System.out.println(result);
    }

    @Test
    public void correctTest11() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"10", "2"});
        System.out.println(result);
    }

    /**
     * error input test
     */
    @Test
    public void errorTest1() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{});
        System.out.println(result);
    }

    @Test
    public void errorTest2() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"-1"});
        System.out.println(result);
    }

    @Test
    public void errorTest3() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"100"});
        System.out.println(result);
    }

    @Test
    public void errorTest4() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"1.1"});
        System.out.println(result);
    }

    @Test
    public void errorTest5() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"a"});
        System.out.println(result);
    }

    @Test
    public void errorTest6() {
        DigitMappingLetter dm = new QuestionTwo();
        String result = dm.checkAndReturnResult(new String[]{"1", "2", "3", "100"});
        System.out.println(result);
    }
}
