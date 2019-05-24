package com.dk.api.lang;

import com.dk.util.Out;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * simple program to implement customer input 'x' and 'y' two numbers then count sum with 'x' and 'y';<br>
 * com.dk.basis.exception: if customer input is not match digit, then java throws InputMismatchException,
 * because program is cycle structure, so if program throws com.dk.basis.exception then will in infinite loop,
 * scanner.nextInt() is the essential;<br>
 * when an com.dk.basis.exception is thrown, customer input will always at com.dk.basis.exception thrown time, so always thrown
 * com.dk.basis.exception at infinite loop.</p>
 * @author DingKai
 * @date  2019/4/23
 * @version 1.0
 */
public class NextLineTest {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                x = scanner.nextInt();
                y = scanner.nextInt();
                Out.print("y = " + (x + y));
            } catch (InputMismatchException e) {
                Out.print("Incorrect input and re-enter two integers:");
                // solve infinite loop problem
                scanner.nextLine();
                continue;
            }
            break;
        }
    }
}
