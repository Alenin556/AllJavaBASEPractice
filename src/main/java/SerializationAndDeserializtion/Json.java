package SerializationAndDeserializtion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;

public class Json {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {
        //На основе класса Pojo Employee мы сериализовали данные в json с помощью метода writeValueAsString
        Employee employee = new Employee("Mark", "James", "22");

        String json = objectMapper.writeValueAsString(employee);

        System.out.println(json);

        //Десериализуем или восстанавливаем json в Pojo Employee с помощью метода readValue
        //где указываем json документ и в какой класс его десериализуем
        Employee employeeToPojo = objectMapper.readValue(json, Employee.class);

        Assertions.assertTrue(employeeToPojo.getFirstName().equals("Mark"));
        Assertions.assertTrue(employeeToPojo.getLastName().equals("James"));
        Assertions.assertTrue(employeeToPojo.getAge().equals("22"));
    }
}
