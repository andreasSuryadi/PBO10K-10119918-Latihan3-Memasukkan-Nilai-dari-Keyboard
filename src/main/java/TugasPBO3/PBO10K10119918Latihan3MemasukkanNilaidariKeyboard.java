/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO3;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : PBO10K
 * NIM      : 10119918
 * Deskripsi Program : Program ini berisi program untuk mamasukkan nilai dari 
 * keyboard dan menampilkannya
 * 
 */
public class PBO10K10119918Latihan3MemasukkanNilaidariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan nama anda:");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
