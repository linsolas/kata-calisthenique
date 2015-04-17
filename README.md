# kata-calisthenique

Un kata pour tester la programmation avec des objets calisthéniques

## Règles

Les règles sont simples : développer un gestionnaire basique de compte bancaire. Il doit être possible de réaliser les opérations suivantes :

* dépôts, retraits ;
* transferts vers le compte d'un autre client de la banque ;
* état du compte, indiquant la liste des opérations avec la date, le montant ainsi que la balance ;
* affichage des opérations du compte
* filtres sur les opérations : durant une période donnée, supérieur ou inférieur à une certaine somme...

Le but ici n'est pas tant de faire un vrai gestionnaire de compte bancaire, mais plutôt de s'imposer les règles suivantes.

## Contraintes "calisthéniques"

Le code doit respecter, **à tout moment**, l'**ensemble de ces règles** :

1. un seul niveau d’indentation par méthode (pas de `if` imbriqués par exemple) ;
2. pas de `else` ;
3. encapsuler tous les types primitifs et `String` ;
4. un seul point par ligne ;
5. pas d’abréviation (pour les noms des variables ou de méthodes) ;
6. limiter la taille des entités (petites classes) ;
7. pas plus de deux variables d’instance par classe ;
8. utiliser des collections *first class*, c’est-à-dire de ne pas utiliser par exemple des `List<String> usernames` mais plutôt une classe plus explicite, comme par exemple `Usernames`.
9. pas de getter / setter / properties

Bonus si le code de test respecte aussi ces règles !
