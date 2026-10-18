@import org.example.hexlet.util.NamedRoutes

<form action="${NamedRoutes.sessionsPath()}" method="post">
    <input type="text" placeholder="Nickname" name="nickname" />
    <input type="text" placeholder="Password" name="password" />
    <input type="submit" />
</form>