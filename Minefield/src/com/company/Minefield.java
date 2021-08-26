package com.company;

import java.util.Random;
import java.util.Scanner;

public class Minefield {
    int column;
    int row;
    boolean[][] maps;
    int[][] board;
    int size;

    Minefield(int row, int column){
        this.row = row;
        this.column = column;
        this.maps = new boolean[row][column];
        this.board = new int[row][column];
        this.size = (row * column);
    }

    void printMinefield(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    void minefield(){
        for (int i = 0; i < maps.length; i++){
            for (int j = 0; j < maps[0].length; j++){
                if(maps[i][j] == false)
                    System.out.print("-" + " ");
                else
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    void createMinefield(){
        Random random = new Random();
        int randColumn, randRow;

        int size = (this.row * this.column) / 4;

        for (int i = 0; i < maps.length; i++){
            for (int j = 0; j < maps[0].length; j++){
                board[i][j] = 0;
                maps[i][j] = false;
            }
        }

        while (size > 0){
            randColumn = random.nextInt(this.row);
            randRow = random.nextInt(this.column);

            if(maps[randRow][randColumn] != true){
                maps[randRow][randColumn] = true;
                size--;
            }
        }
    }

    void check(int r, int c){
        if(board[r][c] == 0){
            /**if((c < column -1) && maps[r][c+1] == true)
                board[r][c]++;
            if((r < row -1) && maps[r+1][c] == true)
                board[r][c]++;
            if((c > 0) && (maps[r][c-1] == true))
                board[r][c]++;**/

            if (r - 1 >= 0) {
                if (maps[r - 1][c] == true) {
                    board[r][c]++;
                }
            }
            if (r - 1 >= 0 && c - 1 >= 0) {
                if (maps[r - 1][c - 1] == true) {
                    board[r][c]++;
                }
            }
            if (c - 1 >= 0) {
                if (maps[r][c - 1] == true) {
                    board[r][c]++;
                }
            }
            if (c + 1 < column) {
                if (maps[r][c + 1] == true) {
                    board[r][c]++;
                }
            }
            if (c + 1 < column && r + 1 < row) {
                if (maps[r + 1][c + 1] == true) {
                    board[r][c]++;
                }
            }
            if (r + 1 < row) {
                if (maps[r + 1][c] == true) {
                    board[r][c]++;
                }
            }
            if (r - 1 >= 0 && c + 1 < column) {
                if (maps[r - 1][c + 1] == true) {
                    board[r][c]++;
                }
            }
            if (r + 1 < row && c - 1 >= 0) {
                if (maps[r + 1][c - 1] == true) {
                    board[r][c]++;
                }
            }

            if(r == row && c == column){
                if(maps[r -1][c-1] == true)
                    board[r][c]++;
            }

        }
    }

    void run()
    {
        Scanner input = new Scanner(System.in);
        boolean game = true;
        int rowNumber, columnNumber;
        createMinefield();
        size -= size/4;
        System.out.println("Mayınların konumu: ");
        minefield();
        System.out.println("Mayın tarlası oyununa Hoşgeldiniz!");
        printMinefield(board);

        do {
            System.out.println("=====================================");
            System.out.print("Satır sayısını giriniz: ");
            rowNumber = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            columnNumber = input.nextInt();

            if(maps[rowNumber][columnNumber] == true){
                System.out.println("Oyun bitti.");
                game = false;
            }

            else{
                check(rowNumber,columnNumber);
                printMinefield(board);
                size--;
            }
            if(size == 0){
                System.out.println("Oyunu Kazandınız.");
            }

        }while (game);
    }
}