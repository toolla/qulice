package com.qulice.plugin.violations;
public class Violations {
    public void test() {
        System.setProperty("test", "test value");
    }

    /**
     * Test method.
     */
    public final void foreach() {
        for (String txt : new String[] {"test"}) {
            System.out.println(txt);
        }
    }

    /**
     * Missing final in catch.
     * @todo #123 Make this better
     *  in multiple lines.
     */
    public final void catchFinal() {
        try {
            Integer.parseInt("123");
        } catch (NumberFormatException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
