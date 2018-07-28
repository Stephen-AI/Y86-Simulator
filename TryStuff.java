import java.io.IOException;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

@Slf4j
public class TryStuff
{
    public static void main(String[] args)
    {
        y86Lexer lexer = null;
        CommonTokenStream tokenStream = null;
        y86Parser parser = null;
        try
        {
            lexer = new y86Lexer(CharStreams.fromFileName("C:\\Users\\saigbomian\\Documents"
                + "\\LearnANTLR\\src\\sum.ys"));
            tokenStream = new CommonTokenStream(lexer);
            parser = new y86Parser(tokenStream);
            y86Parser.ProgramContext tree = parser.program();
            ParseTreeWalker.DEFAULT.walk(new y86ParserBaseListener(), tree);
        }
        catch (IOException e)
        {
            log.error("Error occured while reading from file");
            e.printStackTrace();
        }


    }
}
