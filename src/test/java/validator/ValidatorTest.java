package validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    private Validator validator;

    @BeforeEach
    public void setUp(){
        validator = new Validator();
    }

    @Test
    public void shouldNotThrowExceptionIfSalaryPositive(){
        Assertions.assertDoesNotThrow(() ->
                validator.checkSalary(20000.00));
    }

    @Test
    public void shouldThrowExceptionIfSalaryNegative(){
        Assertions.assertThrows(SalaryException.class, () ->
                validator.checkSalary(-20000.00));
    }

    @Test
    public void shouldNotThrowExceptionIfNameContainsOnlyEnglishChars(){
        Assertions.assertDoesNotThrow(() ->
                validator.checkName("Donald", "Trump"));
    }

    @Test
    public void shouldThrowExceptionIfNameContainsCharsExceptEnglish(){
        Assertions.assertThrows(NameException.class, () ->
                validator.checkName("莱昂纳多", "迪卡普里奥"));
    }

    @Test
    public void shouldThrowExceptionIfNameIsEmptyLine(){
        Assertions.assertThrows(NameException.class, () ->
                validator.checkName("    ", "    "));
    }

    @Test
    public void shouldThrowExceptionIfNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () ->
                validator.checkName(null, null));
    }
}
