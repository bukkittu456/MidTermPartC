/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author vyas4
 */
public class TestUserprofile {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Choose your favorite Genre:");
        String genre=sc.next();
        System.out.println("Your profile has been created"+name);
    }
}
