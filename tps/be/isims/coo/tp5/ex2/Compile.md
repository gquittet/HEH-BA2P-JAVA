# Comment compiler un paquet avec une librairie externe

## Pour Windows

Si nous avons 3 librairies nommées :

- lib1.jar

- lib2.jar

- lib3.jar

```
javac -cp ".;lib1.jar;lib2.jar;lib3.jar" sourcefile.jar
java -cp ".;lib1.jar;lib2.jar;lib3.jar" sourcefile.jar
```

Exemple :

```
javac -cp ".;.\be\isims\coo\tp5\ex2\lib\libClock.jar" .\be\isims\coo\tp5\ex2\ClockTest.java
java -cp ".;.\be\isims\coo\tp5\ex2\lib\libClock.jar" be.isims.coo.tp5.ex2.ClockTest
```

## Pour UNIX

Il suffit juste de remplacer le ";" en ":".

```
javac -cp ".:lib1.jar:lib2.jar:lib3.jar" sourcefile.jar
java -cp ".:lib1.jar:lib2.jar:lib3.jar" sourcefile.jar
```
