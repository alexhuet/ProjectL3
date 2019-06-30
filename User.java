/**
 * @author alexandre Huet
 */

import java.util.Scanner;
import java.util.Calendar;
import static java.lang.System.in;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class User 
{

    public static void user()
    {
        System.out.println("Vous voici dans le menu utilisateur, que voulez vous faire ?");
        System.out.println("Taper 1 pour créer un nouvel utilisateur");
        System.out.println("Taper 2 pour modifier un utilisateur existant");
        System.out.println("Taper 3 pour supperimer un utilisateur");
        System.out.println("Taper 4 pour afficher la liste de tous les utilisateur");
        System.out.println("Taper 5 pour retourner au menu principal");

        Scanner scanmenu = new Scanner(System.in);
        int userchoice = scanmenu.nextInt();
        ArrayList<any> list = new ArrayList<any>();

        switch(userchoice)
        {
            case 1:
                User.createuser();
            break;

            case 2:
                User.edituser();
            break;

            case 3:
                User.removeuser();
            break;

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

    public static void createuser() 
    {
        String firstName; // First name of the user
        String lastName; // Last name of the user
        int birthDay; // Birthday of the user
        int birthMonth; // Month of birth of the user
        int birthYear; // Year of birth of the user

        System.out.println("Vous voici dans le menu de création d'un nouvel utilisateur");
        System.out.println("Pour vous enregistrer, veuillez nous donner les renseignement suivant :");

        Scanner sc = new Scanner(System.in); //la variable sc va récupérer toutes les entrées ci dessous
        
        System.out.println("Quel est votre prenom ?");
        firstName = sc.nextLine();

        System.out.println("Quel est votre nom ?");
        lastName = sc.nextLine();

        System.out.println("Quel est votre jour de naissance ?");
        birthDay = sc.nextInt();

        System.out.println("Quel est votre mois de naissance ?");
        birthMonth = sc.nextInt();

        System.out.println("Quel est votre année de naissance ?");
        birthYear = sc.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("Voici les informations que vous avez rentrées :");
        System.out.println("");
        System.out.println("Vous vous appelez " + firstName + " " + lastName);
        System.out.println("Vous êtes né(e) le " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("");
        System.out.println("");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ProjetL3/Data.txt", true)))
        {
            bufferedWriter.newLine();
            bufferedWriter.write(firstName + " " + lastName + " " + birthDay + " " + birthMonth + " " + birthYear);
        } catch(IOException e) 
        
        {
            System.err.print(e.getMessage());
        }

    }


    public static void edituser()
    {
        System.out.println("Vous voici sur le menu de modification d'utilisateur");
        System.out.println("");
        System.out.println("Veuillez saisir le prenom et le nom de l'utilisateur à modifier");
    }


    public static void removeuser(ArrayList<any> list, String search)
    {
        try
        {

            // System.out.println(list.toString());
            // for(int i=0; i<list.size(); i++)
            // {
            //     if(list.get(i).equals(search))
            //     {
            //         list.remove(i);
            //         writeToFile(list);
            //     }
            // }

            // if()
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/sarp/Desktop/ProjetL3/Data.txt"), "UTF-8")); //Chemin du fichier sur lequel je veux éffectuer l'action
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/sarp/Desktop/ProjetL3/Data.txt", true));
            
            Scanner scremove        = new Scanner(System.in);
            String line             = bufferedReader.readLine();
            String lineToRemove     = scremove.nextLine();
            String currentLine;
            String newString = ""; 

            System.out.println("");
            System.out.println("Vous voici dans le menu de suppression d'un utilisateur");
            System.out.println("Veuillez rentrer le nom et le prenom de l'utilisateur à retirer de la liste");
            System.out.println("");
            for(; line != null;)
            {
               if(scremove.toString() != line)
                 {
                     newString += line;
                  }
                 else
                 {
                     
                      System.out.println("L'utilisateur " + scremove + " a été supprimé");
                 }
                line = bufferedReader.nextLine();
                    
            }

            // if(scremove.ToString == bufferedReader.readLine())
            // {
            //     System.out.println("L'utilisateur " + scremove + " a été supprimé");
            // } COUPER ICI

            // while((currentLine = bufferedReader.readLine()) !=null)
            // {
            //     String trimmedLine = currentLine.trim();

            //     if(trimmedLine.equals(lineToRemove)) continue;
            //     bufferedWriter.write(currentLine + System.getProperty("line.separator"));
            // }
            
            // bufferedReader.close();
            // bufferedWriter.close();

        } catch(IOException e) 
        {
            System.err.print(e.getMessage());
        }
    }


    public static void listuser()
    {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/sarp/Desktop/ProjetL3/Data.txt"), "UTF-8"));
            String line = bufferedReader.readLine();

            while(line != null)
            {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch(IOException e) 
        {
            System.err.print(e.getMessage());
        }
    }
}

