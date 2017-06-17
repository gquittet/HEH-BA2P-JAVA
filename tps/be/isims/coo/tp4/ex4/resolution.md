# Comment créer une archive .jar

- Il faut mettre le paquet dans un dossier particulier et aller dans ce même dossier.

- Ensuite, allez dans ce dossier.

- Allez là où se trouve les fichiers sources.

- Créez un fichier *Manifest.txt* avec comme contenu :

```
Main-Class: be.isims.coo.tp4.ex4.Main
```

- Retournez à la racine du paquet

- Tapez cette commande.

```
jar cfm archive.jar be/isims/coo/tp4/ex4/Manifest.txt -c . .
```
