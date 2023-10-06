//import Alpha.generated.*;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.RecognitionException;
//import org.antlr.v4.runtime.tree.ParseTree;
//
//import javax.swing.*;
//
//public class Main {
//
//
//    public static void main(String[] args)
//    {
//        AlphaScanner inst = null;
////        AlphaParser parser = null;
////        ParseTree tree=null;
//
//        CharStream input=null;            //Char stream es una clase para abrir el archivo y hacer lectura
////        CommonTokenStream tokens = null;
//
//        //Trate de hacer
//        try {
//            input = CharStreams.fromFileName("test.txt");  //Abrir el archivo y lo lee
//            inst = new AlphaScanner(input);               //A partir del stream, se lo doy de entrada al Scanner
////            tokens = new CommonTokenStream(inst);          //Se crea la clase commontokenstream, osea a prtir de lo que crea el scanner, hace un objeto con toda la lista de tokens
////            parser = new AlphaParser(tokens);            //Ese objeto se lo mando al parser(Le paso la lista de token que viene en el archivo)
//
//            Alpha.AlphaParserManual parser = new Alpha.AlphaParserManual(inst); //Nuestro Parser
//
//            //En este punto ya esta todo montado
//
//
//            try {
////                tree = parser.program(); //Iniciar el Parser, de la instancia llame al metodo principal (llame a program)
////                Si aqui se da cuenta que algo no está bien, entonces manda error
//                parser.parseProgram();
//                System.out.println("Compilación Terminada!!\n");
//
////                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
////                treeGUI.get().setVisible(true);
//            }
//
//            catch(RecognitionException e){
//                System.out.println("Error!!!");
//                e.printStackTrace();
//            }
//        }
//        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
//    }
//
//}



//Para ejecutar el parser Automático

import generatedMiniPython.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;


//Algoritmo de Descenso recursivo
//Tarea 1: Parser
//Estudiante: Josué Chaves


public class Main {

    public static void main(String[] args)
    {
        //Se ejecuta el Parser Manual con el archivo test.txt
        //initParserManual("test.txt");
        initMiniPythonParserAutomatico("test.txt");
    }

    public static void initMiniPythonParserAutomatico(String txtPrueba){

        MiniPythonLexer inst = null;
        MiniPythonParser parser = null;
        ParseTree tree=null;

        CharStream input=null;                              //Char stream es una clase para abrir el archivo y hacer lectura
        CommonTokenStream tokens = null;

        //Trate de hacer
        try {
            input = CharStreams.fromFileName(txtPrueba);        //Abrir el archivo y lo lee
            inst = new MiniPythonLexer(input);                  //A partir del stream, se lo doy de entrada al Scanner
            tokens = new CommonTokenStream(inst);               //Se crea la clase commontokenstream, osea a prtir de lo que crea el scanner, hace un objeto con toda la lista de tokens
            parser = new MiniPythonParser(tokens);              //Ese objeto se lo mando al parser(Le paso la lista de token que viene en el archivo)

//           Alpha.AlphaParserManual parser = new Alpha.AlphaParserManual(inst); //Nuestro Parser

            //En este punto ya esta todo montado


            try {
              tree = parser.program(); //Iniciar el Parser, de la instancia llame al metodo principal (llame a program)

//              Si aqui se da cuenta que algo no está bien, entonces manda error
                //(new Checker()).visit(tree);
                parser.program();
                System.out.println("Compilación con Parser Automático Terminada!!\n");

//                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
//                treeGUI.get().setVisible(true);
            }

            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }



}