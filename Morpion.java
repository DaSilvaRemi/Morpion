// Programme du célèbre jeu du Morpion version Alpha 1.0.0//

import java.util.Scanner;

public class Morpion {
	public static void main(String[] args) 
	{
		int x = 0;
		int j = 1;
		int a = 0;
		int b = 0;
		
		String tab[][]; // On définit un tableaux multidimensionnel/une matrice)
		tab = new String [3][3]; //On définit la taille de nôtre matrice
		
		while(a != 3) 
		{
			tab[a][b] = "-";
			b++;
			
			if(b == 3) 
			{
				b = 0;
				a++;
			}
		}
		
		
		System.out.println("Bonjour et Bienvenue dans le jeu du morpion");
		
		System.out.println("Les règles de jeu sont simple il faut tout simplement aligner trois x ou trois o pour gagner");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez choisir vôtre opposant ( ordinateur = 0 ou joueur = 1 ) : ");
		int player = sc.nextInt();
		
		System.out.println("Vous avez choisi le mode de jeu joueur contre : " + player);
		
		if(player == 1) 
		{
		
		while( (tab[0][x] != "x" && tab[1][x] != "x" && tab[2][x] != "x" )  || ( tab[0][x] != "o" && tab[1][x] != "o" && tab[2][x] != "o") ||
				(tab[x][0] != "x" && tab[x][1] != "x" && tab[x][2] != "x" )  || ( tab[x][0] != "o" && tab[x][1] != "o" && tab[x][2] != "o") ) 
		{
			if(x == 2) 
			{
				x = 0;
			}
			j = 1;
			System.out.println("C'est au tour du joueur 1 : ");
		
			System.out.print("Veuillez choisir la ligne ou vous voulez placez votre x (0 ou 1 ou 2) : ");
			int Ligne = sc.nextInt();
		
			System.out.print("Veuillez choisir la colonne ou vous voulez placez votre x (0 ou 1 ou 2) : ");
			int Colonne = sc.nextInt();
		
			tab [Ligne][Colonne] = "x";
		
			System.out.println(" ");
			afficher(tab);
			System.out.println(" ");
			
			j = 2;
			System.out.println("C'est au tour du joueur 2 : ");
		
			System.out.print("Veuillez choisir la ligne ou vous voulez placez votre o (0 ou 1 ou 2) :");
			Ligne = sc.nextInt();
		
			System.out.print("Veuillez choisir la colonne ou vous voulez placez votre o (0 ou 1 ou 2) :");
			Colonne = sc.nextInt();
		
			tab [Ligne][Colonne] = "o";	
			System.out.println(" ");
			afficher(tab);
			System.out.println(" ");
			x++;

		}
		}
		else if(player == 0) 
		{
			while( (tab[0][x] != "x" && tab[1][x] != "x" && tab[2][x] != "x" )  || ( tab[0][x] != "o" && tab[1][x] != "o" && tab[2][x] != "o") ||
					(tab[x][0] != "x" && tab[x][1] != "x" && tab[x][2] != "x" )  || ( tab[x][0] != "o" && tab[x][1] != "o" && tab[x][2] != "o") ) 
			{
				if(x == 2) 
				{
					x = 0;
				}
				j = 1;
				System.out.println("C'est a vôtre tour: ");
			
				System.out.print("Veuillez choisir la ligne ou vous voulez placez votre x (0 ou 1 ou 2) : ");
				int Ligne = sc.nextInt();
			
				System.out.print("Veuillez choisir la colonne ou vous voulez placez votre x (0 ou 1 ou 2) : ");
				int Colonne = sc.nextInt();
			
				tab [Ligne][Colonne] = "x";
			
				System.out.println(" ");
				afficher(tab);
				System.out.println(" ");
				
				j = 2;
				System.out.println("C'est au tour de l'ordinateur");
			
				Ligne = (int) Math.random() * (3 - 1);
				Colonne = (int) Math.random() * (2);
				
				
				
				if(tab[Ligne][Colonne] == "o" || tab[Ligne][Colonne] == "x") 
				{
					while(tab[Ligne][Colonne] == "o" || tab[Ligne][Colonne] == "x") 
					{
						Ligne = (int) Math.random() * (3 - 1);
						Colonne = (int) Math.random() * (2);
					}
				}
			
				tab [Ligne][Colonne] = "o";	
				System.out.println(" ");
				afficher(tab);
				System.out.println(" ");
				x++;

			}
		}
		System.out.println(" ");
		afficher(tab);
		System.out.println(" ");
		System.out.print("Le joueur " + j + " à gagner");
	}
	
	private static void afficher(String[][] tab1) //Sous programme servant à afficher la matrice
	{
		int p = 0; //Numéro de ligne
		int o = 0; //Numéro de colonne
		int i = 0;
		int u = 0; // Il sert à rien Lol
		
		System.out.println("______________"); //Ligne du Haut
		
		while(p != 3) //Tant que nôtre numéro de ligne est différent de 3 qui est la taille de la Matrice alors continuez
		{
			System.out.println(" ");
			while( i != 3) //Nous conditionnons l'affichage de la matrice en définissant son aspet graphique
			{
			System.out.print(" " +tab1[p][o] + " | "); //On définit un affichage 
			o++;
			i++;
			}
			System.out.println("");
			System.out.print("______________"); //Ligne du Bas + interlignes
			i = 0;
			if (o == 3) //Si le numéro de la collone = 3 alors remettre à 0 et changer de ligne
			{
				p++;
				o = 0;
			}
		}
	}
}
