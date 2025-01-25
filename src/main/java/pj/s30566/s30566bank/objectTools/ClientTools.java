package pj.s30566.s30566bank.objectTools;

import org.springframework.stereotype.Component;
import pj.s30566.s30566bank.objects.Client;

import java.time.LocalDateTime;
import java.time.Period;

@Component
public class ClientTools {

    public int getAge(Client client) {
        if (client == null || client.getBirthday() == null){
            return 0;
        }
        LocalDateTime now = LocalDateTime.now();
        Period period = Period.between(client.getBirthday().toLocalDate(), now.toLocalDate());
        return period.getYears();
    }

    public String getClientData(Client client) {
        return client.toString();
    }
}
