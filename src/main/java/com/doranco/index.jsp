<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
        <script>
            window.location.href = "accueil.html";
        </script>
</head>
<body>
    <!-- En-tête -->
    <header>
        <h1>Mon Site E-commerce</h1>
        <nav>
            <ul>
                <%-- Si l'utilisateur est connecté --%>
                <% if (userLoggedIn) { %>
                    <li>Bonjour <%= userFirstName %></li>
                    <li><a href="logout">Déconnexion</a></li>
                    <li><a href="panier">Panier (<%= nombreArticlesPanier %>)</a></li>
                    <li><a href="commandes">Historique des commandes</a></li>
                <% } else { %>
                    <%-- Si l'utilisateur est déconnecté --%>
                    <li><a href="login">Connexion</a></li>
                <% } %>
            </ul>
        </nav>
    </header>

    <!-- Corps -->
    <section>
        <%-- Afficher la page courante en fonction du profil de l'utilisateur connecté --%>
        <% if (userLoggedIn) { %>
            <% if (userProfil.equals("MAGASINIER")) { %>
                <%-- Redirection vers la page gestion-articles.html --%>
                <% response.sendRedirect("gestion-articles.html"); %>
            <% } else if (userProfil.equals("CLIENT")) { %>
                <%-- Redirection vers la page gestion_chats.html --%>
                <% response.sendRedirect("gestion_chats.html"); %>
            <% } else if (userProfil.equals("ADMIN")) { %>
                <%-- Redirection vers la page gestion-admin.html --%>
                <% response.sendRedirect("gestion-admin.html"); %>
            <% } %>
        <% } else { %>
            <%-- Afficher la page de connexion ou de création de compte pour les utilisateurs non connectés --%>
            <%-- ... --%>
        <% } %>
    </section>

    <!-- Pied de page -->
    <footer>
        <p>Infos de contact</p>
        <p>© 2023 Mon Site E-commerce. Tous droits réservés.</p>
    </footer>
</body>
</html>