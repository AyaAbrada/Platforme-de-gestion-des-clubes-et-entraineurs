<!DOCTYPE html>
<html lang="fr">
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tableau de bord Administrateur</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Tableau de bord Administrateur</h1>
    </header>
    <section>
        <h2>Liste des Membres</h2>
        <table class="dashboard-table">
            <thead>
                <tr>
                    <th>Nom</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>John Doe</td>
                    <td>john@example.com</td>
                    <td>
                        <a href="">Supprimer</a>
                    </td>
                </tr>
            </tbody>
        </table>

        <h2>Liste des Entraîneurs</h2>
        <table class="dashboard-table">
            <thead>
                <tr>
                    <th>Nom</th>
                    <th>Spécialité</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Jane Doe</td>
                    <td>Fitness</td>
                    <td>
                        <a href="">Supprimer</a>
                    </td>
                </tr>
            </tbody>
        </table>

        <h2>Gestion des Séances</h2>
        <table class="dashboard-table">
            <thead>
                <tr>
                    <th>ID Séance</th>
                    <th>Date & Heure</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>2025-03-15 10:00</td>
                    <td>
                        <a href="">Modifier</a>
                        <a href="">Annuler</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </section>
</body>
</html>
