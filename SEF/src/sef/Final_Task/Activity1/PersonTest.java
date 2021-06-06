package sef.Final_Task.Activity1;
import junit.framework.TestCase;

import java.security.spec.RSAOtherPrimeInfo;


public class PersonTest extends TestCase {
    private Person person;

    protected void setUp() throws Exception {
        person = new Student();
    }


    public void testSetAndGetName() throws CustomizedException {

        String s1 = "Vasja";
        assertNull(person.getName());
        person.setName(s1);
        assertEquals(s1, person.getName());
    }




    public void testSetAndGetAge() {
        int Age = 16;
        person.setAge(Age);
        assertEquals(Age, person.getAge());

    }


    public void testSetAndGetNegativeAge() {
        int n = -1200;
        String ExpectedResult = "Number is positive";
        String ActualResult = "Number is negative";

        person.setAge(n);
        if (person.getAge() > 0) {
            System.out.println(ExpectedResult);
        } else {
            System.out.println(ActualResult);
        }
        assertEquals(ExpectedResult, ActualResult);
    }

    public void testIntroduction() {
        person.setAge(27);
        assertEquals(person.introduction(), "Hi my name is null And I'm 27 years old");
    }



}




