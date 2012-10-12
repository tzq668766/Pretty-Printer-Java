import java.io.*;
class Ident extends Node {
  private String name;

  public Ident(String n) { name = n; }

  public void print(int n) {
    for (int i = 0; i < n; i++)
      System.out.print(" ");

    System.out.println(name);
  }
  
  @Override
  public boolean isSymbol(){
	  return true;
  }
  
  public String getName() {
	  return name;
  }
}
