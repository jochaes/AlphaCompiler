package CustomExeptions;

import generatedMiniPython.MiniPythonParser;

public class TiposException extends Exception{

        private String message;

        public TiposException(){
            super();
        }

        public TiposException(String message){
            super(message);
        }

        public TiposException(MiniPythonParser.ListExpression_ASTContext ctx ){
            int line = ctx.getStart().getLine();
            int col = ctx.getStart().getCharPositionInLine();

            this.message =
                    "\nTiposException: "+
                            "\n\tTodos los elementos de la lista deben ser del mismo tipo" +
                            "\n\ten Linea: " + line + " Columna: " + col;
        }

        public TiposException(MiniPythonParser.ElementAccess_PE_ASTContext ctx ){
            int line = ctx.getStart().getLine();
            int col = ctx.getStart().getCharPositionInLine();

            this.message =
                    "\nTiposException: "+
                            "\n\tLa variable a la que quiere acceder, no es una lista" +
                            "\n\ten Linea: " + line + " Columna: " + col;
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
