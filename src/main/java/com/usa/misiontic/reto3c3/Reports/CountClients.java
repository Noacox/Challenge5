package com.usa.misiontic.reto3c3.Reports;

import com.usa.misiontic.reto3c3.entities.Client;

public class CountClients {
    private Long total;
    private Client client;

    public CountClients(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
