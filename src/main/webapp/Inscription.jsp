<!DOCTYPE html>
<html lang="fr">
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>S'inscrire</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>S'inscrire</h1>
    </header>
    <section>
        <form action="" method="POST">
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email :</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Mot de passe :</label>
            <input type="password" id="password" name="password" required>

            <label for="role">Rôle :</label>
            <select id="role" name="role" required>
                <option value="membre">Membre</option>
                <option value="entraineur">Entraîneur</option>
                <option value="admin">Administrateur</option>
            </select>

            <button type="submit">S'inscrire</button>
        </form>
        <p>Déjà inscrit ? <a href="Connexion.jsp">Connectez-vous ici</a></p>
    </section>
</body>
</html>
