package org.example.recursive;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3;  // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B, and C are the names of rods
    }
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1)
        {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);  // Move n-1 disks from fromRod to auxRod
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);  // Move the nth disk
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);  // Move n-1 disks from auxRod to toRod
    }


}

