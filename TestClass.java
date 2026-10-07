/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
   
    public static void main(String[] args) {

        
        Player[] players = {
            new Player("P001", "John", "Team Alpha", 92.5),
            new Player("P002", "Michael", "Team Bravo", 87.0),
            new Player("P003", "David", "Team Charlie", 95.5),
            new Player("P004", "James", "Team Alpha", 81.5),
            new Player("P005", "Robert", "Team Delta", 89.0),
            new Player("P006", "William", "Team Bravo", 97.0),
            new Player("P007", "Daniel", "Team Charlie", 84.5),
            new Player("P008", "Joseph", "Team Delta", 91.0)
        };

        
        System.out.println("===== PLAYERS BEFORE SORTING =====");

        for (Player player : players) {
            System.out.println(player);
        }

        
       

        
        System.out.println("\n===== PLAYERS AFTER SORTING =====");

        for (Player player : players) {
            System.out.println(player);
        }

        
        System.out.println("\n===== TOP 3 PLAYERS =====");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + players[i]);
        }
    }
}


