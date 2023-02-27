package com.PIDEV.demo.Services;

import com.PIDEV.demo.Entities.CommandLigne;
import com.PIDEV.demo.Entities.Facture;
import com.PIDEV.demo.Entities.Orderr;

import java.util.List;

public interface IOrderService {
    void ajoutOrder(Orderr order);
    void addFacture(Facture facture);
    void deleteOrder(int ido);
    Facture FacturesOfOrder(int ido);
    List<CommandLigne> listLigneCommand(int ido);
    List<CommandLigne> listcommandeligne(int idCmd);

}
