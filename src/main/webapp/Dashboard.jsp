<!DOCTYPE html>
<html lang="fr">
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tableau de bord</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"

</head>
<body>
    <header>
        <h1>Tableau de bord</h1>

    </header>
    <section>

        <a class = "bg-success rounded p-3 m-5 text-center text-light " href="demande_seance.jsp"">Demander une séance</a>
        <br>
        <br>

        <h2>Gestion des informations personnelles</h2>
        <form action="" method="POST">
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name" value="Nom Actuel" required>

            <label for="email">Email :</label>
            <input type="email" id="email" name="email" value="email@example.com" required>

            <button type="submit">Mettre à jour</button>
        </form>



        <h2>Supprimer mon compte</h2>
        <form action="" method="POST">
            <button type="submit">Supprimer mon compte</button>
        </form>
    </section>
</body>
</html>
