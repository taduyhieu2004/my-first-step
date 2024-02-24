package vidu;

import java.util.*;

public class Sort {
  private static void reverse(int a[], int n) {
    int l = 0, r = n - 1;
    while (l < r) {
      int tmp = a[l];
      a[l] = a[r];
      a[r] = tmp;
      ++l;
      --r;
    }
  }

  //quy dinh a co nhieu chu so hon b
  private static void add(char a[], char b[]) {

    int n1 = a.length, n2 = b.length, n = 0;
    int x[] = new int[n1], y[] = new int[n1], z[] = new int[n1 + 1];
    for (int i = 0; i < n1; i++) x[i] = a[i] - '0';
    for (int i = 0; i < n2; i++) y[i] = b[i] - '0';

    reverse(x, n1);
    reverse(y, n1);
    for (int i = n2 + 1; i < n1; i++) {
      y[i] = 0;
    }

    int nho = 0;
    for (int i = 0; i < n1; i++) {
      int tmp = x[i] + y[i] + nho;
      z[n++] = tmp % 10;
      nho = tmp / 10;
    }
    if (nho != 0) z[n++] = nho;
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(z[i]);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//	int t;
//	scanf("%d",&t);
//
//	while(t--){


    char c[] = {'1','0','0'}, d[] = {'1','2'};

      if (c.length >= d.length) {
        add(c, d);
      } else add(d, c);


  }
}



