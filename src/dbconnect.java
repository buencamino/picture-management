import java.sql.*;

public class dbconnect {
    private static final String database_driver = "com.mysql.jdbc.Driver";
    private static final String database_url = "jdbc:mysql://localhost:3306/dbproducts?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String user = "mike";
    private static final String password = "12345";

    private Connection conn = null;
    private Statement statement = null;
    private ResultSet rset = null;

    public void connect() throws Exception
    {
        try
        {
            Class.forName(database_driver);
            conn = DriverManager.getConnection(database_url, user, password);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    public void addProduct(String brand, String description, String details, String isactive, String picture1, String picture2, String picture3, String picture4, String picture5, String variant, String price) throws Exception
    {
        String buffid = null;

        try
        {
            connect();
            PreparedStatement pstatement = conn.prepareStatement("insert into tbl_products (brand, description, details, isactive, picture1, picture2, picture3, picture4, picture5, variant) values ('" + brand + "', ?, ?, '" + isactive + "', ?, ?, ?, ?, ?, " + variant + ")");
            pstatement.setString(1, description);
            pstatement.setString(2, details);
            pstatement.setString(3, picture1);
            pstatement.setString(4, picture2);
            pstatement.setString(5, picture3);
            pstatement.setString(6, picture4);
            pstatement.setString(7, picture5);

            pstatement.executeUpdate();

            if (variant.equals("0"))
            {
                statement = conn.createStatement();
                rset = statement.executeQuery("SELECT * FROM tbl_products ORDER BY product_ID DESC LIMIT 1");

                while (rset.next())
                {
                    buffid = String.valueOf(rset.getInt("product_ID"));
                }

                pstatement = conn.prepareStatement("insert into tbl_productitem (product_ID, description, price) values (" + buffid + ", '" + description + "', " + price + ")");
                pstatement.executeUpdate();
            }
            pstatement.close();
            System.out.println("Inserted product : " + brand + " " + description);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    public ResultSet getProduct(String search) throws Exception
    {
        rset = null;

        try
        {
            connect();
            statement = conn.createStatement();
            rset = statement.executeQuery("select * from tbl_products where brand like '%" + search + "%' or description like '%" + search + "%'");
        }
        catch (Exception y)
        {
            throw y;
        }

        return rset;
    }

    public void close() throws Exception
    {
        try
        {
            conn.close();
            statement.close();
            rset = null;
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
