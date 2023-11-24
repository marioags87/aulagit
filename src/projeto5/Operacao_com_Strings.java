package projeto5;

public class Operacao_com_Strings {

  public static void main(String[] args) {
    String original = "abcde FGHIJ ABC abc DEFG ";
    //para colocar tudo em minisculo
    String s01 = original.toLowerCase();
    //para colocar tudo em maiusculo
    String s02 = original.toUpperCase();
    //para eliminar os espaços em branco
    String s03 = original.trim();
    //para colocar a string na posição 2
    String s04 = original.substring(2);
    //para colocar a string na posição 2 até a posição 9
    String s05 = original.substring(2, 9);
    //para substituir a letra 'a' por 'x'
    String s06 = original.replace('a', 'x');
    //para substituir a letra 'abc' por 'xy'
    String s07 = original.replace("abc", "xy");
    //para encontrar a primeira posição da letra 'bc'
    int i = original.indexOf("bc");
    //para encontrar a ultima posição da letra 'bc'
    int j = original.lastIndexOf("bc");

    //sysout para printar as funções acima
    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);

    //Separando strings usando vetores
    String s = "batata maçã limão";
    String[] vect = s.split(" ");
    String word1 = vect[0];
    String word2 = vect[1];
    String word3 = vect[2];

    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);
  }
}
