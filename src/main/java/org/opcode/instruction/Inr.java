package org.opcode.instruction;

import org.opcode.model.RegisterState;

import java.util.Arrays;
import java.util.List;

public class Inr implements Instruction{

    private final static int VAL = 1;
    @Override
    public void process(String[] args, RegisterState registerState) {
        List<String> newArgs = Arrays.asList(args);
        newArgs.add(" "+String.valueOf(VAL));
        new Add().process(newArgs.toArray(new String[0]), registerState);
    }
}
