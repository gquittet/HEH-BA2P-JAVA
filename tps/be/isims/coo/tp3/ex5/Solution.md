# Solution de l'exercise 5 du TP3

## Quel est le problème avec la classe *Employe* ?
Pour commencer, ce n'est pas le problème mais les problèmes.
Tout d'abord, on utilise la classe Date alors que c'est une classe qui est deprecated.
De plus, on n'a pas fait de getter pour le nom. Donc, on ne sait pas y accéder de par l'instance.
Pour finir, on instancie un objet *Date* avec un objet *GregorianCalendar* alors que ces 2 derniers n'ont aucun rapport.

## Comment allez-vous corriger ça ?
Je vais remplacer la classe *Calendar* à la place de la classe *Date*.
Je vais créer un getter pour la classe *Employe*
Si on veut continuer quand même à utiliser la classe *Date*, alors il faudra caster l'objet *GregorianCalendar* en *Date*.