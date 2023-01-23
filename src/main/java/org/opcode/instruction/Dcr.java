package org.opcode.instruction;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class Dcr implements Instruction{
    private final static int VAL = 1;
    @Override
    public void process(String[] args, RegisterState registerState) {
        Register des = registerState.getRegister(args[1].charAt(0));
        des.setValue(des.getValue() - VAL);
    }
}
