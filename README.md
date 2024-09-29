"Ce projet est une application Java qui met en œuvre JDBC (Java Database Connectivity) pour gérer une collection de sites (villes) dans une base de données MySQL. Il illustre de manière simple mais efficace comment établir une connexion entre une application Java et une base de données, tout en permettant l'ajout et la récupération d'informations".

#Structure du projet
Le projet est basé sur deux classes principales qui assurent la liaison entre l'application et la base de données :
Site.java : Cette classe représente un site (une ville) avec deux attributs : un id et un nom. Ces attributs sont utilisés pour créer, manipuler et stocker des instances de sites dans la base de données. Elle contient également les méthodes nécessaires pour interagir avec les enregistrements correspondants dans la table "site" de la base de données.
Test.java : Cette classe est responsable des opérations de base de données. Elle teste d'abord la connexion à la base de données pour s'assurer que l'application peut interagir avec MySQL. Ensuite, elle permet d'insérer un nouveau site dans la table "site" de la base de données, puis de récupérer et afficher la liste des sites stockés. Par exemple, elle permet d'ajouter des sites comme "Marrakech" et "El Jadida" dans la table, puis d'afficher ces sites en sortie.

#Fonctionnement
Connexion à la base de données : Le projet commence par vérifier la connexion avec la base de données MySQL. Si la connexion est réussie, l'application peut interagir avec la table "site".
Insertion de données : Après avoir vérifié la connexion, la classe Test.java permet d'insérer des données dans la table "site". Par exemple, elle ajoute des villes comme "Marrakech" et "El Jadida" avec leurs identifiants respectifs.
Affichage des données : Une fois les sites ajoutés, l'application les récupère et les affiche. Dans cet exemple, l'application affiche "SAFI", "MARRAKECH", et "EL JADIDA", qui ont été ajoutés à la base de données.

#Technologies utilisées
Java : Utilisé pour développer l'application et la logique de gestion des sites.
JDBC (Java Database Connectivity) : Permet de se connecter à la base de données et d'effectuer des opérations sur les données.
MySQL : Base de données utilisée pour stocker les informations des sites.

#Pré-requis
Avant d'exécuter le projet, assurez-vous d'avoir installé les éléments suivants :
JDK (Java Development Kit)
MySQL (serveur de base de données)
MySQL Connector/J (bibliothèque JDBC pour MySQL)

#Demo_Video

https://github.com/user-attachments/assets/6f52d0bb-8131-4481-a3b3-2e3869555827



  

