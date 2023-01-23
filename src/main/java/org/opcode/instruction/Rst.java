package org.opcode.instruction;

import org.opcode.model.RegisterState;

public class Rst implements Instruction{
    @Override
    public void process(String[] args, final RegisterState registerState) {
        registerState.reset();
    }
}
