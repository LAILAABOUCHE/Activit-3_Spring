Patient Management System
Une application Spring Boot pour la gestion des dossiers patients, intégrant des fonctionnalités de création, consultation, modification, suppression, recherche, tri et pagination des données.

⚙️ Technologies Utilisées
Spring Boot (v3.4.3) – Cadre principal de l'application

Spring Data JPA – Gestion simplifiée des opérations CRUD avec abstraction de la couche d’accès aux données

Thymeleaf – Moteur de templates pour générer dynamiquement des vues HTML côté serveur

MySQL – Base de données relationnelle utilisée en production

H2 Database – Base de données légère intégrée, idéale pour les phases de test

Bootstrap (v5.1.3) – Framework CSS pour un design responsive et moderne

Lombok – Réduction du code répétitif avec génération automatique de getters, setters, etc.

MapStruct – Génération automatique de mappers entre les entités et les DTOs

Maven – Outil de build et gestionnaire de dépendances

✨ Fonctionnalités Principales
Gestion complète des patients (Ajouter, Consulter, Modifier, Supprimer)

Pagination configurable avec navigation intuitive

Tri dynamique par champs : ID, nom, état de santé, score

Recherche instantanée par nom

Validation des formulaires côté serveur

Interface responsive basée sur Bootstrap

Architecture propre avec séparation via le pattern DTO

📦 Explication des Dépendances
H2 Database
Base de données embarquée simple et rapide, sans nécessité d’un serveur externe. Elle prend en charge la majorité des commandes SQL standard, ce qui facilite la migration vers une base plus robuste comme MySQL.

Spring Data JPA
Permet une interaction fluide avec la base de données via des interfaces, sans avoir à écrire les requêtes SQL manuellement. Elle s’intègre parfaitement avec H2 ou MySQL.

Spring Web
Gère les requêtes HTTP via des annotations comme @GetMapping, @PostMapping... et fournit le socle pour construire des applications web RESTful.

Lombok
Outil pratique qui génère automatiquement des méthodes comme get(), set(), toString() etc., allégeant le code source.

Thymeleaf
Moteur de template puissant qui permet d’injecter dynamiquement des données dans les pages HTML, facilitant ainsi la liaison entre la vue et les données côté serveur.

🗂️ Structure de l’Entité Patient
Chaque patient dispose des champs suivants :

ID : Identifiant unique auto-généré

Nom

Date de naissance

État de santé (malade ou non)

Score (entre 0 et 100)

🌐 Routes de l'Interface Web
GET /patients : Affichage de tous les patients

GET /patients/create : Formulaire d’ajout d’un nouveau patient

POST /patients : Création d’un patient

GET /patients/{id} : Détail d’un patient

GET /patients/edit/{id} : Formulaire de modification

PUT /patients/{id} : Mise à jour d’un patient

DELETE /patients/{id} : Suppression

🔍 Fonctionnalités en Détail
Pagination
Taille de page configurable

Affichage du numéro de page actuel

Navigation fluide entre pages

Tri
Par ID, nom, état de santé et score

Tri croissant/décroissant

Recherche
Recherche en temps réel par nom

Réinitialisation facile de la recherche

Validation
Nom : requis, entre 2 et 100 caractères

Date de naissance : obligatoire et antérieure à la date actuelle

Score : requis, compris entre 0 et 100

🖼️ Modèles HTML (Thymeleaf)
layouts/global.html : Template de base

patients/index.html : Vue de la liste des patients

patients/create-or-update.html : Formulaire (création ou édition)

patients/view.html : Détails d’un patient

🚀 Lancer l’Application
Cloner le dépôt

S’assurer que MySQL est démarré

Configurer application.yaml avec vos informations de base de données

Exécuter le projet avec Maven :

bash
Copier le code
./mvnw spring-boot:run
ou

bash
Copier le code
mvn spring-boot:run
L’application sera accessible sur http://localhost:8080/patients

🧪 Environnement de Développement
Pour ajouter de nouvelles fonctionnalités :

Créer ou modifier l’entité concernée dans entities/

Définir les DTOs dans dtos/

Mapper les entités/DTOs dans mappers/

Définir les méthodes dans repositories/

Implémenter la logique métier dans services/

Ajouter les contrôleurs dans controllers/

Créer ou mettre à jour les vues Thymeleaf dans resources/templates/

