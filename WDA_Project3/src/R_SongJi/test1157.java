package beakjoon;

import java.util.Scanner;

public class test1157 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
      System.out.print("단어를 입력하시오");
      String arpabet = sc.next();

      int A = 0;
      int B = 0;
      int C = 0;
      int D = 0;
      int E = 0;
      int F = 0;
      int G = 0;
      int H = 0;
      int I = 0;
      int J = 0;
      int K = 0;
      int L = 0;
      int M = 0;
      int N = 0;
      int O = 0;
      int P = 0;
      int Q = 0;
      int R = 0;
      int S = 0;
      int T = 0;
      int U = 0;
      int V = 0;
      int W = 0;
      int X = 0;
      int Y = 0;
      int Z = 0;
      arpabet = arpabet.toUpperCase();
      String [] ds = {arpabet};
      int [] total1 = {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
      for (int i = 0; i < ds.length; i++){
        switch (arpabet) {                                   
            case "A": A++;
            case "B": B++;
            case "C": C++;
            case "D": D++;
            case "E": E++;
            case "F": F++;
            case "G": G++;
            case "H": H++;
            case "I": I++;
            case "J": J++;
            case "K": K++;
            case "L": L++;
            case "M": M++;
            case "N": N++;
            case "O": O++;
            case "P": P++;
            case "Q": Q++;
            case "R": R++;
            case "S": S++;
            case "T": T++;
            case "U": U++;
            case "V": V++;
            case "W": W++;
            case "X": X++;
            case "Y": Y++;
            case "Z": Z++;   
              
           
           default:                                          
        }
        int min;
        min = total1[0];
        for(int x = 0; x < total1.length; i++){
            if(total1[x] < min) {
                min = total1[x];
            }
        }
        System.out.println(min);
      }

    }
}
