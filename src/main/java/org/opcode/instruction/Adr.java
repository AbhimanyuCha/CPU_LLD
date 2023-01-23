package org.opcode.instruction;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class Adr implements Instruction{
    @Override
    public void process(String[] args, final RegisterState registerState) {
        final Register des = registerState.getRegister(args[1].charAt(0));
        final Register src = registerState.getRegister(args[2].charAt(0));
        des.setValue(des.getValue() + src.getValue());
    }
}
