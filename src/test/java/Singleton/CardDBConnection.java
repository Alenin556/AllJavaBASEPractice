package Singleton;

import groovy.util.logging.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class CardDBConnection {
//    static ConfigProp prop = new ConfigProp();
//    private static final String DRIVER = "org.postgresql.Driver";
//    private static final String URL;
//
//    static {
//        URL = prop.getPropertyByKey("DB_AQA") + prop.getPropertyByKey("cardDB");
//    }
//
//    private static final String USER = "pguser";
//    private static final String PASSWORD = "123!@#qweQWE";
////
////        static {
////            try {
////                Class.forName(DRIVER);
////            } catch (ClassNotFoundException e) {
////                e.printStackTrace();
////            }
////        }
//
////        public static Connection getConnection() {
////            if (connection == null) {
////                try {
////                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
////                } catch (SQLException e) {
////                    log.error(" - 'SQLException in db PowerBank.Card'");
////                    e.printStackTrace();
////                }
////            }
////            return connection;
////        }
//
//
//    //singleton
//
//    private static Connection instanceOfCardConnection = null;
//
//    private CardDBConnection() throws SQLException {
//            try {
//                Class.forName(DRIVER);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        instanceOfCardConnection = DriverManager.getConnection(URL, USER, PASSWORD);
//    }
//
//    public static Connection getInstanceOfCardDbConnection() {
//        try {
//            if (instanceOfCardConnection == null)
//                instanceOfCardConnection = (Connection) new CardDBConnection();
//        } catch (Exception e) {
//            System.out.println(" - 'SQLException in db PowerBank.Card'");
//        }
//        return instanceOfCardConnection;
//    }

}