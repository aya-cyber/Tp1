package beans;

import java.sql.*;

public class Test {

    // Replace these with your actual connection details
    private static final String url = "jdbc:mysql://localhost/db";
    private static final String user = "root";
    private static final String password = "";

    public static void save(Site site) {
        String sql = "INSERT INTO site VALUES(null, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, site.getNom());
            statement.executeUpdate();
            System.out.println("Site " + site.getNom() + " enregistré avec succès!");
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'enregistrement du site : " + e.getMessage());
        }
    }

    public static void load() {
        String sql = "SELECT * FROM site";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            System.out.println("Liste des sites enregistrés :");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nom = rs.getString(2);
                System.out.println(id + " - " + nom);
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors du chargement des sites : " + e.getMessage());
        }
    }

    public static void delete() {
        String sql = "DELETE FROM site";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            int rowsDeleted = statement.executeUpdate(sql);
            System.out.println(rowsDeleted + " sites supprimés.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression des sites : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        save(new Site("SAFI"));
        save(new Site("MARRAKECH"));
        save(new Site("EL JADIDA"));
        // Uncomment to delete all sites
        // delete();
        load();
    }
}