package pj.s30566.s30566bank.unitTest;

import org.junit.jupiter.api.Test;
import pj.s30566.s30566bank.objectTools.ClientTools;
import pj.s30566.s30566bank.objects.Client;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientUnitTest {

    Client client = new Client("Adam", "Kowalski", "kowalski@wp.pl", "123456789", "test", LocalDateTime.of(2003, 2, 1, 0, 0), 200.97);

    ClientTools clientTools = new ClientTools();

    @Test
    void testAgeCheck(){
    int age = clientTools.getAge(client);

    assertThat(age).isGreaterThan(0);
    }

}
