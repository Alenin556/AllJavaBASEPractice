package SerializationAndDeserializtion;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Создаем пользователя
        User user = new User();
        user.balance = 55000;
        User.age = 45;

        //Сериализуем объект в файл
        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        //Восстанавливаем объект из файла в новый объект
        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newUser.balance);
        System.out.println(newUser.age);
    }
}
