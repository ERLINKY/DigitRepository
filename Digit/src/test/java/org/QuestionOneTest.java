package org;


import org.junit.Test;

public class QuestionOneTest {

    /**
     * correct input test
     */
    @Test
    public void correctTest1() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"0"});
        System.out.println(result);
    }

    @Test
    public void correctTest2() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"3"});
        System.out.println(result);
    }

    @Test
    public void correctTest3() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"1", "2"});
        System.out.println(result);
    }

    @Test
    public void correctTest4() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"2", "1"});
        System.out.println(result);
    }

    @Test
    public void correctTest5() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"2", "3", "4"});
        System.out.println(result);
    }

    @Test
    public void correctTest6() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"2", "3", "4", "5"});
        System.out.println(result);
    }

    /**
     * error input test
     */
    @Test
    public void errorTest1() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{});
        System.out.println(result);
    }
    @Test
    public void errorTest2() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"-1"});
        System.out.println(result);
    }
    @Test
    public void errorTest3() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"10"});
        System.out.println(result);
    }
    @Test
    public void errorTest4() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"1.1"});
        System.out.println(result);
    }
    @Test
    public void errorTest5() {
        DigitMappingLetter dm = new QuestionOne();
        String result = dm.checkAndReturnResult(new String[]{"a"});
        System.out.println(result);
    }
}
