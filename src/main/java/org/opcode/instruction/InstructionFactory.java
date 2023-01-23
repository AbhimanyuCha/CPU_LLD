package org.opcode.instruction;

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
