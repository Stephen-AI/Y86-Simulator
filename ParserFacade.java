import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserFacade {

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

//    public y86Parser.File_inputContext parse(File file) throws IOException
//    {
//        String code = readFile(file, Charset.forName("UTF-8"));
//        Python3Lexer lexer = new Python3Lexer(new ANTLRInputStream(code));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        Python3Parser parser = new Python3Parser(tokens);
//        return parser.file_input();
//    }
}