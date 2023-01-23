package org.opcode.instruction;

import org.opcode.instruction.instructionTypes.Add;
import org.opcode.instruction.instructionTypes.Adr;
import org.opcode.instruction.instructionTypes.Dcr;
import org.opcode.instruction.instructionTypes.Inr;
import org.opcode.instruction.instructionTypes.Move;
import org.opcode.instruction.instructionTypes.Rst;
import org.opcode.instruction.instructionTypes.Set;

public class InstructionFactory {

    public Instruction get(String operation){
        switch (operation){
            case "ADD" : return new Add();
            case "MOV" : return new Move();
            case "INR" : return new Inr();
            case "DCR" : return new Dcr();
            case "ADR" : return new Adr();
            case "RST" : return new Rst();
            case "SET" : return new Set();
            default: return null;
        }
    }
}
