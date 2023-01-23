package org.opcode.instruction;


import org.opcode.model.RegisterState;

public interface Instruction {
    void process(String[] args, RegisterState registerState);
}
