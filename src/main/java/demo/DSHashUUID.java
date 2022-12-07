package demo;

import java.util.UUID;
import org.apache.flink.table.functions.ScalarFunction;

public class DSHashUUID extends ScalarFunction{
    public String eval(String s) {
        return (s == null) ? null : UUID.nameUUIDFromBytes(s.getBytes()).toString();
    }
}
