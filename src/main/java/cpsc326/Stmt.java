package cpsc326;

abstract class Stmt {
  interface Visitor<R> {
    R visitExpressionStmt(Expression stmt);

    R visitPrintStmt(Print stmt);
  }

  // nested classes

  abstract <R> R accept(Visitor<R> visitor);
}
