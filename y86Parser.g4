parser grammar y86Parser;

options { tokenVocab=y86Lexer; }



functionOrMemoryDeclaration:
    IDENTIFIER COLON;

doOperation:
    OP REGISTER COMMA REGISTER;

doRegisterMove:
    RMOV REGISTER COMMA REGISTER;

doImmediateMove:
    IRMOVQ CONSTANT COMMA REGISTER | IRMOVQ IDENTIFIER COMMA REGISTER;

doMemoryMove:
    RMMOVQ REGISTER COMMA MEMORY_LOCATION |
    MRMOVQ MEMORY_LOCATION COMMA REGISTER;

doJumporCall:
    JUMP IDENTIFIER | CALL IDENTIFIER;

doStackOp:
    PUSHQ  REGISTER | POPQ REGISTER;

doNoValueNeeded:
    HALT | NOP | RET;

directiveDeclaration:
    POS (DECIMAL_LITERAL | HEX_LITERAL) | ALIGN (DECIMAL_LITERAL | HEX_LITERAL) | QUAD
    (DECIMAL_LITERAL | HEX_LITERAL | IDENTIFIER);

validY86:
    functionOrMemoryDeclaration | doOperation | doRegisterMove | doImmediateMove | doMemoryMove |
    doJumporCall | doStackOp | doNoValueNeeded | directiveDeclaration;

program:
    validY86 * EOF;
