# Distributed-HPC
Distributed-HPC est une application de commerce électronique distribuée qui permet de gérer le catalogue de produits, les stocks, les commandes et la facturation. Cette application est composée de plusieurs parties principales :

## Customer-service
Le micro-service Customer-service permet de gérer les informations des clients et de suivre leurs commandes.

- Création de l'entité Customer
- Création de l'interface CustomerRepository basée sur Spring Data
- Déploiement de l'API Restful du micro-service en utilisant Spring Data Rest
- Test du Micro-service

## Inventory-service
Le micro-service Inventory-service permet de gérer le catalogue de produits et de suivre les niveaux de stock.

- Création de l'entité Product
- Création de l'interface ProductRepository basée sur Spring Data
- Déploiement de l'API Restful du micro-service en utilisant Spring Data Rest
- Test du Micro-service
## Gateway service
Le Gateway service permet de gérer les requêtes entrantes et sortantes, d'appliquer des filtres et de protéger l'application contre les attaques.

- Test de la Service proxy en utilisant une configuration statique basée sur le fichier application.yml
- Test de la Service proxy en utilisant une configuration statique basée sur une configuration Java
## Registry Service
Le Registry Service est un service de découverte de services qui permet de découvrir les services disponibles sur le réseau.

- Création de l'annuaire Registry Service basé sur NetFlix Eureka Server
- Test du proxy en utilisant une configuration dynamique de gestion des routes vers les micro-services enregistrés dans l'annuaire Eureka Server
## Billing-Service
Le Billing-Service est responsable de la génération des factures et de la gestion des paiements. Il utilise le client Open Feign Rest pour communiquer avec les services Customer-service et Inventory-service.

- Création du service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service
## Client Angular
Le client Angular est une interface utilisateur destinée aux utilisateurs finaux qui souhaitent utiliser Distributed-HPC pour gérer leur boutique en ligne.

- Création du client Angular qui permet d'afficher une facture
