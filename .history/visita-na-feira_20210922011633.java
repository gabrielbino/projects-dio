// A entrada contêm 2 valores int separados por um espaço
// Imprimir a mensagem " X = valor da variável x e pelo final de linha. Espaço antes e depois do sinal =

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
  public static main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken()); // Pimentões amarelos
    int b = Integer.parseInt(st.nextToken()); // Pimentões vermelhos
    int total = a + b;
    System.out.println("X = " + total);
  }
}