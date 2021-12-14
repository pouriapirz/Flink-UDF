package demo;

import org.apache.flink.table.functions.ScalarFunction;

public class DSUpperCase extends ScalarFunction{
    public String eval(String s) {
        return (s == null) ? null : s.toUpperCase();
    }
}
