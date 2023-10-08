package CustomExeptions;

import generatedMiniPython.MiniPythonParser;

public class FuncionNoExisteException extends Exception{

        private String message;

        public FuncionNoExisteException(){
            super();
        }


        public FuncionNoExisteException(MiniPythonParser.FunctionCall_PE_ASTContext ctx ){
            int line = ctx.getStart().getLine();
            int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

            this.message =
                    "\nFuncionNoExisteException: "+
                            "\n\tEsta funcion no existe" +
                            "\n\ten Linea: " + line + " Columna: " + col;
        }


        public FuncionNoExisteException(String message){
            super(message);
        }

        @Override
        public String getMessage(){
            return this.message;
        }

        @Override
        public String toString(){
            return this.message;
        }
}
