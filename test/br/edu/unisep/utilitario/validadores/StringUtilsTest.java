package br.edu.unisep.utilitario.validadores;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    
    @Test
    public void ehInteiro() {
        assertFalse(StringUtils.ehInteiro(""));
        assertTrue(StringUtils.ehInteiro("1"));
        assertTrue(StringUtils.ehInteiro("1020"));
        assertFalse(StringUtils.ehInteiro("."));
        assertFalse(StringUtils.ehInteiro(","));
        assertFalse(StringUtils.ehInteiro("1.0"));
        assertFalse(StringUtils.ehInteiro("1a"));
        assertFalse(StringUtils.ehInteiro("a"));
    }
}
