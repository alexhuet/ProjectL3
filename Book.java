/**
 * @author alexandre Huet
 */

import java.util.Scanner;

public class Book
{
    public static void book()
    {
        System.out.println("Vous voici dans le stock des livres, que voulez vous faire ?");
        System.out.println("Taper 1 pour enregistrer un nouvel ouvrage");
        System.out.println("Taper 2 pour modifier un ouvrage existant");
        System.out.println("Taper 3 pour supprimer un ouvrage");
        System.out.println("Taper 4 pour afficher la liste de tous les utilisateur");
        System.out.println("Taper 5 pour retourner au menu principal");

        Scanner scanmenu = new Scanner(System.in);
        int userchoice = scanmenu.nextInt();

        switch(userchoice)
        {
            case 1:
                User.createuser();
            break;

            case 2:
                User.edituser();
            break;

            // case 3:
            //     User.removeuser();
            // break;

            case 4:
                User.listuser();
            break;

            case 5:
                Home.choice();
            break;

            default:
                System.out.println("Votre saisie ne correspond à aucun des choix proposé, veuillez recommencer");
                User.user();
        }
    }
}