class Main extends front {

   private static class error extends Exception {
        error(String message) {
            super(message);
        }
    }

  public static void main(String[] args) {
    System.out.println("Program start");
  }

public static void expr() {
	 System.out.println("Enter <expr>\n");
	/* Parse the first term */
	 term();
	
	 while (nextToken == ADD_OP || nextToken == SUB_OP|| nextToken == OR_OP) {
		 lex();
		 term();
	 }
	 System.out.println("Exit <expr>\n");
}


public static void term() {
	 System.out.println("Enter <term>\n");
	/* Parse the first factor */
	 factor();

	 while (nextToken == MULT_OP || nextToken == DIV_OP || nextToken == MOD_OP|| nextToken == AND_OP) {
		 lex();
		 factor();
	 }
	 System.out.println("Exit <term>\n");
}

public static void factor() {
	 System.out.println("Enter <factor>\n");
	/* Determine which RHS */
	 if (nextToken == IDENT || nextToken == INT_LIT || nextToken == TRUE|| nextToken == FALSE)
		/* Get the next token */
		 lex();
		
	 else { if (nextToken == LEFT_PAREN) {
		 lex();
		 expr();
		 if (nextToken == RIGHT_PAREN)
		 	lex();
		 else
		 	error();
		 }
	
		 else
		 error();
	 }
	 System.out.println("Exit <factor>\n");
  }

  //Relational
  public static void Relation() {
	 System.out.println("Enter <Relation>\n");
	/* Parse the first term */
	 expr();

	 while (nextToken == LESSTHAN_OP || nextToken == GREATERTHAN_OP || nextToken == LESSTHANGREATER_OP|| nextToken == GREATERTHANGREATER_OP|| nextToken == EQUAL_OP || nextToken == NOTEQUAL_OP ) {
		 lex();
		 expr();
	 }
	 System.out.println("Exit <Relation>\n");
  }
  