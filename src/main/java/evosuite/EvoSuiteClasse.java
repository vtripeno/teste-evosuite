package evosuite;

import java.math.BigDecimal;

public class EvoSuiteClasse {

    public String retornarString() {
        return "String Teste";
    }

    public String retornarStringConcatenada(String a, String b) {
        return new StringBuilder(a).append(b).toString();
    }

    public Integer retornarInteiro() {
        return Integer.MAX_VALUE;
    }

    public Double retornarSoma() {
        return 3.00 + 5.00;
    }

    public BigDecimal retornarBigDecimal() {
        return BigDecimal.TEN;
    }

    public void retornarVazio(){}
}
