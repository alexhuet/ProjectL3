/**
 * @author Alexandre Huet
 */

import java.util.Scanner;

public class Home
{
    public static void choice()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans votre bibliothèque !");
        System.out.println("");
        System.out.println("Taper 1 pour accéder à la partie utilisateur");
        System.out.println("Taper 2 pour accéder au stock de livres");
        System.out.println("Taper 3 pour accéder au menu des emprunts");
        System.out.println("Taper 4 pour accéder à l'ensemble des commande disponible dans l'application");
        System.out.println("Taper 5 pour quitter l'application");
        int choice = sc.nextInt();


        switch(choice)
        {
            case 1:
                User.user();
            break;
            
            // case 2:
            //     Book.book();
            // break;

            // case 3:
            //     Borrow.borrow();
            // break;

            case 4:
                Helper.helpscript();
            break;

            case 5:
                Exit.exit();
            break;

            default:
                System.out.println("Votre saisi ne correspond à aucun choix proposé. Veuillez recommencer");
            
        

    }
    }}