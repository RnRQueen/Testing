package org.example;

public class Main {
    public static void main(String[] args) {
        queue(3,2,4,40);
        } ;
    public static void queue(int h1, int h2, int h3, int h4) {
if (h1>=0 & h1<=300 & h2>=0 & h2<=300 & h3>=0 & h3<=300 & h4>=0 & h4<=300)
                if (h1 <= h2 & h2 <= h3 & h3 <= h4)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                else
    System.out.println("input height between 0 and 300");
            }
        }

