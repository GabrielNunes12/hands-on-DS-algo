package Threads;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * usando a keyword thread é ruim pois você tem pouco controle sobre
 */
public class BasicThreadCreation {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      System.out.println("Hello from my BasicThread: " + Thread.currentThread().getName());
    });
    thread.start();
    //Lendo um arquivo em uma outra thread para liberar a thread principal
    Thread thread2 = new Thread(() -> {
      FileReader fileReader = null;
      try {
        fileReader = new FileReader("aaa.txt");
        fileReader.read();
      } catch (IOException e) {
        throw new RuntimeException(e);
      } finally {
        try {
          fileReader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
    thread2.start();
    //restante do código da thread principal
    List<String> o = new ArrayList<>();
    o.add("aa");
    o.add("bbb");
    for(String a : o) {
      System.out.println(a);
    }
  }
}
