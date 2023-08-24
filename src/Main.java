//import generated.*;
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
//            AlphaParserManual parser = new AlphaParserManual(inst); //Nuestro Parser
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
import generated.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;


//Algoritmo de Descenso recursivo
//Tarea 1: Parser
//Estudiante: Josué Chaves


public class Main {

    public static void main(String[] args)
    {
        //Casos de Pruebas

        //TEST.txt
        // Caso de prueba con todas las funcionalidades,
        // tipos y constantes char y string y declaración y uso de métodos
        System.out.println("*********** Prueba: test.txt: Todas las Funcionalidades ***********");
        initParserManual("test.txt");
        initParserAutomatico("test.txt");

        //test2.txt
        // Caso de prueba con errores en la declaracion de tipos string y char

        System.out.println("*********** Prueba: test2.txt: Errores de tipos String y Char ***********");
        initParserManual("test2.txt");
        initParserAutomatico("test2.txt");

        //test3.txt
        // Caso de prueba con errores en la declaracion de constantes string y char

        System.out.println("*********** Prueba: test3.txt: Errores de constantes String y Char ***********");
        initParserManual("test3.txt");
        initParserAutomatico("test3.txt");

        //test4.txt
        // Caso de prueba con errores en la declaracion de metodos, metodo sin nombre

        System.out.println("*********** Prueba: test4.txt: Metodo sin nombre ***********");
        initParserManual("test4.txt");
        initParserAutomatico("test4.txt");

        //test5.txt
        // Caso de prueba con errores en el uso de metodos, metodo sin parentesis derecho

        System.out.println("*********** Prueba: test5.txt: Metodo sin parentesis ***********");
        initParserManual("test5.txt");
        initParserAutomatico("test5.txt");
    }

    public static void initParserAutomatico(String txtPrueba){

        AlphaScanner inst = null;
        AlphaParser parser = null;
        ParseTree tree=null;

        CharStream input=null;            //Char stream es una clase para abrir el archivo y hacer lectura
        CommonTokenStream tokens = null;

        //Trate de hacer
        try {
            input = CharStreams.fromFileName(txtPrueba);  //Abrir el archivo y lo lee
            inst = new AlphaScanner(input);               //A partir del stream, se lo doy de entrada al Scanner
            tokens = new CommonTokenStream(inst);          //Se crea la clase commontokenstream, osea a prtir de lo que crea el scanner, hace un objeto con toda la lista de tokens
            parser = new AlphaParser(tokens);            //Ese objeto se lo mando al parser(Le paso la lista de token que viene en el archivo)

//           AlphaParserManual parser = new AlphaParserManual(inst); //Nuestro Parser

            //En este punto ya esta todo montado


            try {
//                tree = parser.program(); //Iniciar el Parser, de la instancia llame al metodo principal (llame a program)
//                Si aqui se da cuenta que algo no está bien, entonces manda error
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

    public static void initParserManual(String txtPrueba){
        AlphaScanner inst = null;
//        AlphaParser parser = null;
//        ParseTree tree=null;

        CharStream input=null;            //Char stream es una clase para abrir el archivo y hacer lectura
//        CommonTokenStream tokens = null;

        //Trate de hacer
        try {
            input = CharStreams.fromFileName(txtPrueba);  //Abrir el archivo y lo lee
            inst = new AlphaScanner(input);               //A partir del stream, se lo doy de entrada al Scanner
//            tokens = new CommonTokenStream(inst);          //Se crea la clase commontokenstream, osea a prtir de lo que crea el scanner, hace un objeto con toda la lista de tokens
//            parser = new AlphaParser(tokens);            //Ese objeto se lo mando al parser(Le paso la lista de token que viene en el archivo)

            AlphaParserManual parser = new AlphaParserManual(inst); //Nuestro Parser

            //En este punto ya esta todo montado


            try {
//                tree = parser.program(); //Iniciar el Parser, de la instancia llame al metodo principal (llame a program)
//                Si aqui se da cuenta que algo no está bien, entonces manda error
                parser.parseProgram();
                System.out.println("Compilación con Parser Manual Terminada!!\n");

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