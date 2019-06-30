/**
 * @author Alexandre Huet
 */

import java.util.Scanner;


public class Helper
{
    public static void helpscript()
    {

        System.out.println("Voici la liste des commande disponible :");
        System.out.println("");
        System.out.println("exit :");
        System.out.println("Cette commande vous permet de sortir de l'application");
        System.out.println("");
        System.out.println("adduser <firstname> <lastname> <day> <month> <year> :");
        System.out.println("Cette commande vous permet d'ajouter un utilisateur");
        System.out.println("");
        System.out.println("edituser <firstname> <lastname> :");
        System.out.println("Cette commande vous permet de modifier le nom d'un utilisateur s'il existe");
        System.out.println("");
        System.out.println("removeuser <firstname> <lastname> :");
        System.out.println("Cette commande vous permet de retirer un utilisateur de la liste s'il existe et s'il n'a pas de livre à rendre");
        System.out.println("");
        System.out.println("listusers :");
        System.out.println("Cette commande permet d'afficher la liste des utilisateur ");
        System.out.println("");
        System.out.println("addbook <title> <ref> <year> <publisher> :");
        System.out.println("Cette commande vous permet d'ajouter un livre à la liste");
        System.out.println("");
        System.out.println("editbook <ref> :");
        System.out.println("Cette commande permet de modifier les informations d'un livre à partir de sa référence");
        System.out.println("");
        System.out.println("removebook <ref> :");
        System.out.println("Cette commande permet de retirer un livre de la liste à partir de sa référence");
        System.out.println("");
        System.out.println("listbook :");
        System.out.println("Cette commande permet d'affiche la liste des livres enregistrés par ordre croissant de référence");
        System.out.println("");
        System.out.println("borrowbook <firstname> <lastname> <ref> :");
        System.out.println("Cette commande permet d'emprunter un livre à partir du nom et prenom de l'utilisateur, ainsi qu'avec la référence du livre");
        System.out.println("");
        System.out.println("returnbook <ref> :");
        System.out.println("Cette commande permet de rendre un livre emprunter");
        System.out.println("");
        System.out.println("listborrow :");
        System.out.println("Cette command epermet d'afficher la liste des livres empruntés");
        System.out.println("");
        System.out.println("save :");
        System.out.println("Cette commande permet de sauvegarder les données lier aux utilisateurs, livres et emprunts sur le disque dur dans des fichiers");
        System.out.println("");
        System.out.println("restore :");
        System.out.println("Cette commande permet de detecter la présence des fichiers sauvegardes précedemment et");
        System.out.println("va les ouvrir en lecture et recuperer les informations contenues dedans pour creer de nouveaux objets");
        System.out.println("en memoire (utilisateur, livre, emprunt");
        System.out.println("");
    }
}