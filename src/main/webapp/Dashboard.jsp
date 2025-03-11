<!DOCTYPE html>
<html lang="fr">
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tableau de bord</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Tableau de bord</h1>

    </header>
    <section>
        <h2>Gestion des informations personnelles</h2>
        <form action="" method="POST">
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name" value="Nom Actuel" required>

            <label for="email">Email :</label>
            <input type="email" id="email" name="email" value="email@example.com" required>

            <button type="submit">Mettre à jour</button>
        </form>

        <h2>Planifier une séance</h2>
        <form action="schedule_session.php" method="POST">
            <label for="date">Date et Heure :</label>
            <input type="datetime-local" id="date" name="date" required>

            <button type="submit">Planifier</button>
        </form>

        <h2>Supprimer mon compte</h2>
        <form action="" method="POST">
            <button type="submit">Supprimer mon compte</button>
        </form>
    </section>
</body>
</html>
